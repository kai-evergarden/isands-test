package districts;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.test.model.RegisterOfDistricts;
import com.test.service.RegisterOfDistrictsLocalServiceUtil;

import javax.portlet.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RegisterOfDistrictsWebPortlet extends MVCPortlet {
    private static final Log logger = LogFactoryUtil.getLog(RegisterOfDistrictsWebPortlet.class);

    @Override
    public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
        boolean isArchive = ParamUtil.getBoolean(renderRequest, "isArchive", false);
        List<RegisterOfDistricts> filteredRecords = null;
        try {
            filteredRecords = new ArrayList<>(
                    RegisterOfDistrictsLocalServiceUtil.getRegisterOfDistrictses(0, Integer.MAX_VALUE)
            );
        } catch (SystemException e) {
            throw new RuntimeException(e);
        }
        if (!isArchive) {
            Iterator<RegisterOfDistricts> iterator = filteredRecords.iterator();
            while (iterator.hasNext()) {
                RegisterOfDistricts record = iterator.next();
                if (record.getIsArchived()) {
                    iterator.remove();
                }
            }
        }
        renderRequest.setAttribute("filteredRecords", filteredRecords);
        super.doView(renderRequest, renderResponse);
    }
    public void addRegisterOfDistricts(ActionRequest request, ActionResponse response) throws SystemException, IOException, PortalException {
        feelTheRegisterOfDistricts(request, response, "created");
    }

    public void updateRegisterOfDistricts(ActionRequest request, ActionResponse response) throws SystemException, PortalException, IOException {
        feelTheRegisterOfDistricts(request, response, "updated");
    }

    public void feelTheRegisterOfDistricts(ActionRequest request, ActionResponse response, String type) throws SystemException, PortalException {
        String name = ParamUtil.getString(request, "name");
        long districtCode = ParamUtil.getLong(request, "districtCode");
        long id__ = ParamUtil.getLong(request, "registerOfDistrictsId");
        boolean isArchived = ParamUtil.getBoolean(request, "isArchived");
        if (name == null || name.equals("")) {
            SessionErrors.add(request, "empty-name");
            logger.error("Given name is empty");
            response.setRenderParameter("mvcPath", "/edit.jsp");
        } else {
            RegisterOfDistricts registerOfDistricts = null;
            if (type.equals("created")) {
                registerOfDistricts = RegisterOfDistrictsLocalServiceUtil.createRegisterOfDistricts(RegisterOfDistrictsLocalServiceUtil.getRegisterOfDistrictsesCount() + 1);
            } else {
                registerOfDistricts = RegisterOfDistrictsLocalServiceUtil.getRegisterOfDistricts(id__);
            }
            registerOfDistricts.setName(name);
            registerOfDistricts.setDistrictCode(districtCode);
            registerOfDistricts.setIsArchived(isArchived);
            if (type.equals("created")) {
                RegisterOfDistrictsLocalServiceUtil.addRegisterOfDistricts(registerOfDistricts);
            } else {
                RegisterOfDistrictsLocalServiceUtil.updateRegisterOfDistricts(registerOfDistricts);
            }
            SessionMessages.add(request, "districts-" + type);
            logger.info("Districts was " + type);
        }
    }


    public void deleteRegisterOfDistricts(ActionRequest request, ActionResponse response) throws Exception {
        long registerOfDistrictsId = ParamUtil.getLong(request, "registerOfDistrictsId");
        String backURL = ParamUtil.getString(request, "backURL");
        try {
            RegisterOfDistrictsLocalServiceUtil.deleteRegisterOfDistricts(registerOfDistrictsId);
            SessionMessages.add(request, "districts-deleted");
            logger.info("Districts was deleted");
            response.sendRedirect(backURL);
        } catch (PortalException exception) {
            logger.error("Error occurred!", exception);
            SessionErrors.add(request, "error-key");
        }
    }

    public void changeArchiveStatus(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        long id = ParamUtil.getLong(request, "registerOfDistrictsId");
        RegisterOfDistricts registerOfDistricts = RegisterOfDistrictsLocalServiceUtil.getRegisterOfDistricts(id);
        registerOfDistricts.setIsArchived(!registerOfDistricts.getIsArchived());
        RegisterOfDistrictsLocalServiceUtil.updateRegisterOfDistricts(registerOfDistricts);
    }

}
