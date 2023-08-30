<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.test.model.RegisterOfFarmers" %>
<%@ page import="com.test.service.RegisterOfFarmersLocalServiceUtil" %>
<%@ page import="com.test.service.RegisterOfDistrictsLocalServiceUtil" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="com.test.model.RegisterOfDistricts" %>
<%@ page import="java.util.List" %>
<%@ page import="com.liferay.portal.kernel.exception.SystemException" %>
<%@ page import="com.liferay.portal.kernel.exception.PortalException" %>

<%
    long registerOfFarmersId = ParamUtil.getLong(request, "registerOfFarmersId");
    RegisterOfFarmers registerOfFarmers = null;
    if (registerOfFarmersId > 0) {
        try {
            registerOfFarmers = RegisterOfFarmersLocalServiceUtil.getRegisterOfFarmers(registerOfFarmersId);
        } catch (Exception ignored) {
        }
    }
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
%>
<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value='/jsp/farmers/view.jsp'/>
</portlet:renderURL>
<portlet:actionURL name='<%= registerOfFarmers == null ? "addRegisterOfFarmers" : "updateRegisterOfFarmers"%>'
                   var="editRegisterOfFarmersURL"/>
<aui:form action="${editRegisterOfFarmersURL}" name="<portlet:namespace />fm" method="post">
    <h3>
        <%= registerOfFarmers == null ? "Create new farmer" : "Edit existing farmer"%>
    </h3>
    <liferay-ui:error key="empty-name" message="failure.empty-name"/>
    <aui:input name="registerOfFarmersId" type="hidden"
               value='<%= registerOfFarmers == null ? "" : registerOfFarmers.getRegisterOfFarmersId() %>'/>
    <aui:fieldset>
        <aui:input label="Organization name" name="organizationName"
                   value='<%= registerOfFarmers == null ? "" : registerOfFarmers.getOrganizationName() %>'>
            <aui:validator name="maximumLength">100</aui:validator>
        </aui:input>
        <aui:select label="Legal form" type="" name="legalForm"
                    value='<%=registerOfFarmers == null ? "" : registerOfFarmers.getLegalForm()%>'>
            <aui:option value="UR"
                        selected='<%=registerOfFarmers != null && registerOfFarmers.getLegalForm().equals("UR")%>'>${"UR"}</aui:option>
            <aui:option value="IP"
                        selected='<%=registerOfFarmers != null && registerOfFarmers.getLegalForm().equals("IP")%>'>${"IP"}</aui:option>
            <aui:option value="FL"
                        selected='<%=registerOfFarmers != null && registerOfFarmers.getLegalForm().equals("FL")%>'>${"FL"}</aui:option>
        </aui:select>
        <aui:input label="INN" name="inn" min="0"
                   value='<%= registerOfFarmers == null ? "" : registerOfFarmers.getInn() %>'>
            <aui:validator name="minLength">9</aui:validator>
            <aui:validator name="maximumLength">12</aui:validator>
        </aui:input>

        <aui:input label="KPP" name="kpp" value='<%= registerOfFarmers == null ? "" : registerOfFarmers.getKpp() %>'>
            <aui:validator name="minLength">9</aui:validator>
            <aui:validator name="maximumLength">9</aui:validator>
        </aui:input>


        <aui:input label="OGRN" name="ogrn" min="0"
                   value='<%= registerOfFarmers == null ? "" : registerOfFarmers.getOgrn() %>'>
            <aui:validator name="minLength">13</aui:validator>
            <aui:validator name="maximumLength">13</aui:validator>
        </aui:input>
        <%
            List<RegisterOfDistricts> districts;
            try {
                districts = RegisterOfDistrictsLocalServiceUtil.findByIsArchived(false);
            } catch (SystemException e) {
                throw new RuntimeException(e);
            }
            String regArea = "";
            if(registerOfFarmers != null) {
                try {
                    try {
                        regArea = RegisterOfDistrictsLocalServiceUtil.getRegisterOfDistricts(Long.parseLong(registerOfFarmers.getRegistrationArea())).getName();
                    } catch (SystemException ignored) {
                    }
                } catch (PortalException ignored) {
                }
            }
        %>
        <aui:select required="true" label="Registration Area" name="registrationArea" value='<%= registerOfFarmers == null ? "" : regArea %>'>
            <% for (RegisterOfDistricts registerOfDistrict : districts) {
                boolean selected = false;
                    if(regArea.equals(registerOfDistrict.getName())) selected = true;
            %>
            <aui:option value='<%= registerOfDistrict.getRegisterOfDistrictsId() %>' selected="<%=selected%>">
                <%= registerOfDistrict.getName() %>
            </aui:option>
            <% } %>
        </aui:select>


        <aui:fieldset>
            <legend>Crop Areas</legend>
            <%
                int index = 0;
                List<RegisterOfDistricts> registerOfDistricts = RegisterOfDistrictsLocalServiceUtil.findByIsArchived(false);
                for (RegisterOfDistricts registerOfDistrict : registerOfDistricts) {
                    String districtName = registerOfDistrict.getName();
                    boolean check = false;
                    if (registerOfFarmers != null) {
                        check = registerOfFarmers.getRegistrationArea().contains(Long.toString(registerOfDistrict.getRegisterOfDistrictsId()));
                    }
            %>
            <aui:input type="checkbox" label="<%= districtName %>" name="<%= districtName + index %>"
                       id='<%= districtName + index %>' value='<%= check %>' />
            <%
                    index++;
                }
            %>
        </aui:fieldset>


        <aui:input label="Date of registration" name="dateOfRegistration" type="date"
                   value='<%= registerOfFarmers == null ? simpleDateFormat.format(new Date()) : simpleDateFormat.format(registerOfFarmers.getDateOfRegistration())%>'
                   required="true" errorMessage="Date of registration is required"/>
        <aui:input label="Archive" type="checkbox" name="isArchived"
                   value='<%=registerOfFarmers != null && registerOfFarmers.getIsArchived() %>'/>
    </aui:fieldset>
    <aui:button-row>
        <aui:button type="submit"/>
        <aui:button type="cancel" onClick="${viewURL}"/>
    </aui:button-row>
</aui:form>
