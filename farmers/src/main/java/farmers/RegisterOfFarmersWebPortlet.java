package farmers;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Junction;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.test.model.RegisterOfDistricts;
import com.test.model.RegisterOfFarmers;
import com.test.service.RegisterOfDistrictsLocalServiceUtil;
import com.test.service.RegisterOfFarmersLocalServiceUtil;

import javax.portlet.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class RegisterOfFarmersWebPortlet extends MVCPortlet {
    private static final Log logger = LogFactoryUtil.getLog(RegisterOfFarmersWebPortlet.class);

    private long id_count = 1;

    private boolean is_on = false;


    @Override
    public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
        String dateOfRegistration = renderRequest.getParameter("dateOfRegistration");
        String registrationArea = renderRequest.getParameter("registrationArea");
        String inn = renderRequest.getParameter("inn");
        String organizationName = renderRequest.getParameter("organizationName");
        boolean isArchive = ParamUtil.getBoolean(renderRequest, "isArchive", false);

        DynamicQuery dynamicQuery = RegisterOfFarmersLocalServiceUtil.dynamicQuery();
        Junction junction = RestrictionsFactoryUtil.conjunction();
        int check = 0;
        if (Validator.isNotNull(dateOfRegistration)) {
            junction.add(RestrictionsFactoryUtil.like("dateOfRegistration", dateOfRegistration));
        } else {
            check++;
        }
        if (Validator.isNotNull(registrationArea)) {
            junction.add(RestrictionsFactoryUtil.like("registrationArea", registrationArea));
        } else {
            check++;
        }
        if (Validator.isNotNull(inn)) {
            junction.add(RestrictionsFactoryUtil.like("inn", inn));
        } else {
            check++;
        }
        if (Validator.isNotNull(organizationName)) {
            junction.add(RestrictionsFactoryUtil.like("organizationName", organizationName));
        } else {
            check++;
        }
        dynamicQuery.add(junction);
        List<RegisterOfFarmers> filteredRecords = null;
        if (check == 4) {
            try {
                filteredRecords = RegisterOfFarmersLocalServiceUtil.getRegisterOfFarmerses(0, Integer.MAX_VALUE);
            } catch (SystemException e) {
                throw new RuntimeException(e);
            }
        } else {
            try {
                filteredRecords = RegisterOfFarmersLocalServiceUtil.dynamicQuery(dynamicQuery);
            } catch (SystemException e) {
                throw new RuntimeException(e);
            }
        }
        if (!isArchive) {
            Iterator<RegisterOfFarmers> iterator = filteredRecords.iterator();
            while (iterator.hasNext()) {
                RegisterOfFarmers record = iterator.next();
                if (record.getIsArchived()) {
                    iterator.remove();
                }
            }
        }
        renderRequest.setAttribute("filteredRecords", filteredRecords);
        super.doView(renderRequest, renderResponse);
    }

    public void addRegisterOfFarmers(ActionRequest request, ActionResponse response) throws SystemException, IOException, PortalException {
        feelRegisterOfFarmers(request, response, "created");
    }

    public void updateRegisterOfFarmers(ActionRequest request, ActionResponse response) throws SystemException, PortalException, IOException {
        feelRegisterOfFarmers(request, response, "updated");
    }


    public void deleteRegisterOfFarmers(ActionRequest request, ActionResponse response) throws Exception {
        long registerOfFarmersId = ParamUtil.getLong(request, "registerOfFarmersId");
        String backURL = ParamUtil.getString(request, "backURL");
        try {
            RegisterOfFarmersLocalServiceUtil.deleteRegisterOfFarmers(registerOfFarmersId);
            SessionMessages.add(request, "farmer-deleted");
            logger.info("Farmer was deleted");
            response.sendRedirect(backURL);
        } catch (PortalException exception) {
            logger.error("Error occurred!", exception);
            SessionErrors.add(request, "error-key");
        }
    }

    protected Map<String, String> getActualFieldsMap(ActionRequest actionRequest) throws SystemException {
        int index = 0;
        Map<String, String> fieldsMap = new HashMap<String, String>();
        List<RegisterOfDistricts> registerOfDistricts = RegisterOfDistrictsLocalServiceUtil.findByIsArchived(false);
        for (RegisterOfDistricts registerOfDistrict : registerOfDistricts) {
            String districtName = registerOfDistrict.getName();
            String value = ParamUtil.getBoolean(actionRequest, districtName + index) ? "1" : "";
            fieldsMap.put(districtName, value);
            index++;
        }
        return fieldsMap;
    }

    public void feelRegisterOfFarmers(ActionRequest request, ActionResponse response, String type) throws SystemException, PortalException {
        String organizationName = ParamUtil.getString(request, "organizationName");
        String legalForm = ParamUtil.getString(request, "legalForm");
        String inn = ParamUtil.getString(request, "inn");
        String kpp = ParamUtil.getString(request, "kpp");
        String ogrn = ParamUtil.getString(request, "ogrn");
        String registrationArea = ParamUtil.getString(request, "registrationArea");
        long id__ = ParamUtil.getLong(request, "registerOfFarmersId");
        StringBuilder cropAreas = new StringBuilder();
        Map<String, String> fieldsMap = new HashMap<String, String>(getActualFieldsMap(request));
        for (Map.Entry<String, String> entry : fieldsMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value.equals("1") && cropAreas.toString().equals(""))
                cropAreas.append(key);
            else if (value.equals("1"))
                cropAreas.append(", ").append(key);
        }
        Date dateOfRegistration = ParamUtil.getDate(request, "dateOfRegistration", new SimpleDateFormat("dd/MM/yyyy"));
        boolean isArchived = ParamUtil.getBoolean(request, "isArchived");
        if (organizationName == null || organizationName.equals("")) {
            SessionErrors.add(request, "empty-name");
            logger.error("Given name is empty");
            response.setRenderParameter("mvcPath", "/edit.jsp");
        } else if (inn == null || inn.equals("")) {
            SessionErrors.add(request, "empty-inn");
            logger.error("Given INN is empty");
            response.setRenderParameter("mvcPath", "/edit.jsp");
        } else {
            RegisterOfFarmers registerOfFarmers = null;
            if (type.equals("created")) {
                registerOfFarmers = RegisterOfFarmersLocalServiceUtil.createRegisterOfFarmers(RegisterOfFarmersLocalServiceUtil.getRegisterOfFarmersesCount() + 1);
            } else {
                registerOfFarmers = RegisterOfFarmersLocalServiceUtil.getRegisterOfFarmers(id__);
            }
            registerOfFarmers.setOrganizationName(organizationName);
            registerOfFarmers.setLegalForm(legalForm);
            registerOfFarmers.setInn(inn);
            registerOfFarmers.setOgrn(ogrn);
            registerOfFarmers.setKpp(kpp);
            registerOfFarmers.setRegistrationArea(registrationArea);
            registerOfFarmers.setCropAreas(cropAreas.toString());
            registerOfFarmers.setDateOfRegistration(dateOfRegistration);
            registerOfFarmers.setIsArchived(isArchived);
            if (type.equals("created")) {
                RegisterOfFarmersLocalServiceUtil.addRegisterOfFarmers(registerOfFarmers);
            } else {
                RegisterOfFarmersLocalServiceUtil.updateRegisterOfFarmers(registerOfFarmers);
            }
            SessionMessages.add(request, "farmer-" + type);
            logger.info("Farmer was " + type);
        }
    }

    public void changeArchiveStatus(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        long id = ParamUtil.getLong(request, "registerOfDistrictsId");
        RegisterOfFarmers registerOfFarmers = RegisterOfFarmersLocalServiceUtil.getRegisterOfFarmers(id);
        registerOfFarmers.setIsArchived(!registerOfFarmers.getIsArchived());
        RegisterOfFarmersLocalServiceUtil.updateRegisterOfFarmers(registerOfFarmers);
    }


}
