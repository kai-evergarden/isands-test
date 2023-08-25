<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet" %>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.test.model.RegisterOfDistricts" %>
<%@ page import="com.liferay.portal.util.PortalUtil" %>
<%@ page import="com.test.service.RegisterOfDistrictsLocalServiceUtil" %>
<%@ page import="com.liferay.portal.kernel.exception.SystemException" %>
<%@ page import="com.liferay.portal.kernel.exception.PortalException" %>

<%
    ResultRow row = (ResultRow) request.getAttribute("SEARCH_CONTAINER_RESULT_ROW");
    RegisterOfDistricts registerOfDistricts = (RegisterOfDistricts) row.getObject();
    String currentURL = PortalUtil.getCurrentURL(request);
    request.setAttribute("currentURL", currentURL);
%>

<liferay-ui:icon-menu>

    <portlet:renderURL var="editURL">
        <portlet:param name="registerOfDistrictsId"
                       value="<%=String.valueOf(registerOfDistricts.getRegisterOfDistrictsId()) %>"/>
        <portlet:param name="mvcPath"
                       value='/edit.jsp'/>
    </portlet:renderURL>

    <liferay-ui:icon image="edit" message="Edit"
                     url="<%=editURL %>"/>

    <portlet:actionURL name="deleteRegisterOfDistricts" var="deleteRegisterOfDistrictsURL">
        <portlet:param name="registerOfDistrictsId"
                       value="<%= String.valueOf(registerOfDistricts.getRegisterOfDistrictsId()) %>"/>
        <portlet:param name="backURL" value="${currentURL}"/>
    </portlet:actionURL>

    <liferay-ui:icon-delete url="<%=deleteRegisterOfDistrictsURL %>"/>

    <portlet:actionURL name="changeArchiveStatus" var="changeArchiveStatusURL">
        <portlet:param name="registerOfDistrictsId"
                       value="<%=String.valueOf(registerOfDistricts.getRegisterOfDistrictsId()) %>"/>
    </portlet:actionURL>

    <% RegisterOfDistricts registerOfDistricts1 = null;
        try {
            try {
                registerOfDistricts1 = RegisterOfDistrictsLocalServiceUtil.getRegisterOfDistricts(registerOfDistricts.getRegisterOfDistrictsId());
            } catch (PortalException e) {
                throw new RuntimeException(e);
            }
        } catch (SystemException e) {
            throw new RuntimeException(e);
        }

    %><liferay-ui:icon image="edit" message='<%= !registerOfDistricts1.getIsArchived() ? "Archive" : "Unarchive"%>'
                       url="<%=changeArchiveStatusURL%>"/>
    <portlet:actionURL name='<%= registerOfDistricts == null ? "addRegisterOfDistricts" : "updateRegisterOfDistricts"%>'
                       var="editRegisterOfDistrictsURL"/>
</liferay-ui:icon-menu>