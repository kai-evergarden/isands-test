<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet" %>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.util.PortalUtil" %>
<%@ page import="com.test.model.RegisterOfFarmers" %>
<%@ page import="com.test.service.RegisterOfFarmersLocalServiceUtil" %>
<%@ page import="com.liferay.portal.kernel.exception.PortalException" %>
<%@ page import="com.liferay.portal.kernel.exception.SystemException" %>

<%
    ResultRow row = (ResultRow) request.getAttribute("SEARCH_CONTAINER_RESULT_ROW");
    RegisterOfFarmers registerOfFarmers = (RegisterOfFarmers) row.getObject();
    String currentURL = PortalUtil.getCurrentURL(request);
    request.setAttribute("currentURL", currentURL);
%>

<liferay-ui:icon-menu>

    <portlet:renderURL var="editURL">
        <portlet:param name="registerOfFarmersId"
                       value="<%=String.valueOf(registerOfFarmers.getRegisterOfFarmersId()) %>"/>
        <portlet:param name="mvcPath"
                       value='/edit.jsp'/>
    </portlet:renderURL>

    <liferay-ui:icon image="edit" message="Edit"
                     url="<%=editURL %>"/>

    <portlet:actionURL name="deleteRegisterOfFarmers" var="deleteRegisterOfFarmersURL">
        <portlet:param name="registerOfFarmersId"
                       value="<%= String.valueOf(registerOfFarmers.getRegisterOfFarmersId()) %>"/>
        <portlet:param name="backURL" value="${currentURL}"/>
    </portlet:actionURL>

    <liferay-ui:icon-delete url="<%=deleteRegisterOfFarmersURL %>"/>

    <portlet:actionURL name="changeArchiveStatus" var="changeArchiveStatusURL">
        <portlet:param name="registerOfDistrictsId"
                       value="<%=String.valueOf(registerOfFarmers.getRegisterOfFarmersId()) %>"/>
    </portlet:actionURL>

    <% RegisterOfFarmers registerOfFarmers1 = null;
        try {
            registerOfFarmers1 = RegisterOfFarmersLocalServiceUtil.getRegisterOfFarmers(registerOfFarmers.getRegisterOfFarmersId());
        } catch (PortalException e) {
            throw new RuntimeException(e);
        } catch (SystemException e) {
            throw new RuntimeException(e);
        }

    %><liferay-ui:icon image="edit" message='<%= !registerOfFarmers1.getIsArchived() ? "Archive" : "Unarchive"%>'
                       url="<%=changeArchiveStatusURL%>"/>

</liferay-ui:icon-menu>