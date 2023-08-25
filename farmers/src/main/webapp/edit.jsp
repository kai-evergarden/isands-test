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
    <portlet:param name="mvcPath" value='/view.jsp'/>
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
                   value='<%= registerOfFarmers == null ? "" : registerOfFarmers.getInn() %>'
                   maxlength="12" minlength="9"
                   onkeypress="return isNumberKey(event)">
        </aui:input>

        <aui:input label="KPP" name="kpp" value='<%= registerOfFarmers == null ? "" : registerOfFarmers.getKpp() %>'
                   maxlength="9" minlength="9"
                   onkeypress="return isNumberKey(event)">
        </aui:input>


        <aui:input label="OGRN" name="ogrn" min="0"
                   value='<%= registerOfFarmers == null ? "" : registerOfFarmers.getOgrn() %>'
                   maxlength="13" minlength="13"
                   onkeypress="return isNumberKey(event)">
        </aui:input>

        <script>
            function isNumberKey(event) {
                var charCode = (event.which) ? event.which : event.keyCode;
                if (charCode > 31 && (charCode < 48 || charCode > 57)) {
                    event.preventDefault();
                    return false;
                }
                return true;
            }
        </script>

        <aui:select label="Registration Area" name="registrationArea"
                    value='<%= registerOfFarmers == null ? "" : registerOfFarmers.getRegistrationArea() %>'>

            <%
                List<RegisterOfDistricts> districts = RegisterOfDistrictsLocalServiceUtil.findByIsArchived(false);
                for (RegisterOfDistricts registerOfDistrict : districts) {
            %>
            <aui:option value="<%= registerOfDistrict.getName() %>"><%= registerOfDistrict.getName() %>
            </aui:option>
            <%
                }
            %>
        </aui:select>


        <aui:fieldset>
            <legend>Crop Areas</legend>
            <%
                int index = 0;
                List<RegisterOfDistricts> registerOfDistricts = RegisterOfDistrictsLocalServiceUtil.findByIsArchived(false);
                for (RegisterOfDistricts registerOfDistrict : registerOfDistricts) {
                    String districtName = registerOfDistrict.getName();
                    String checkboxValue = (districtName != null ? "true" : "false");
            %>
            <aui:input type="checkbox" label="<%= districtName %>" name="<%= districtName + index %>"
                       id='<%= districtName + index %>' value='<%= checkboxValue %>'/>
            <%
                    index++;
                }
            %>
        </aui:fieldset>


        <aui:input label="Date of registration" name="dateOfRegistration" type="date"
                   value='<%= registerOfFarmers == null ? simpleDateFormat.format(new Date()) : simpleDateFormat.format(registerOfFarmers.getDateOfRegistration())%>'/>
        <aui:input label="Archive" type="checkbox" name="isArchived"
                   value='<%=registerOfFarmers != null && registerOfFarmers.getIsArchived() %>'/>
    </aui:fieldset>
    <aui:button-row>
        <aui:button type="submit"/>
        <aui:button type="cancel" onClick="${viewURL}"/>
    </aui:button-row>
</aui:form>
