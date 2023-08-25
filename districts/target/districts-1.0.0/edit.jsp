<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet" %>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.test.model.RegisterOfDistricts" %>
<%@ page import="com.test.service.RegisterOfDistrictsLocalServiceUtil" %>
<%
    long registerOfDistrictsId = ParamUtil.getLong(request, "registerOfDistrictsId");
    RegisterOfDistricts registerOfDistricts = null;
    if (registerOfDistrictsId > 0) {
        try {
            registerOfDistricts = RegisterOfDistrictsLocalServiceUtil.getRegisterOfDistricts(registerOfDistrictsId);
        } catch (Exception ignored) {
        }
    }
%>

<portlet:renderURL var="viewURL">

    <portlet:param name="mvcPath" value='/view.jsp' />

</portlet:renderURL>

<portlet:actionURL name='<%= registerOfDistricts == null ? "addRegisterOfDistricts" : "updateRegisterOfDistricts"%>' var="editRegisterOfDistrictsURL" />


<aui:form action="<%= editRegisterOfDistrictsURL %>" name="<portlet:namespace />fm" method="post">
    <h3>
        <%= registerOfDistricts == null ? "Create registerOfDistricts" : "Edit existing registerOfDistricts"%>
    </h3>

    <liferay-ui:error key="empty-name" message="failure.empty-name"/>

    <aui:input name="registerOfDistrictsId" type="hidden"
               value='<%= registerOfDistricts == null ? "" : registerOfDistricts.getRegisterOfDistrictsId() %>'/>

    <aui:fieldset>
        <aui:input label="District name" name="name" value='<%= registerOfDistricts == null ? "" : registerOfDistricts.getName() %>'>
            <aui:validator name="maxLength">100</aui:validator>
        </aui:input>
        <aui:input label="District code" name="districtCode" min="0" value='<%= registerOfDistricts == null ? "" : registerOfDistricts.getDistrictCode() %>'>
            <aui:validator name="min">1</aui:validator>
        </aui:input>
        <aui:input label="Archive" type="checkbox" name="isArchived"
                   value='<%=registerOfDistricts != null && registerOfDistricts.getIsArchived() %>'/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"/>
        <aui:button type="cancel" onClick="<%= viewURL %>"/>
    </aui:button-row>
</aui:form>