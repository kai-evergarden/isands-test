<%@ page import="java.util.List" %>
<%@ page import="com.liferay.portal.kernel.exception.SystemException" %>
<%@ page import="com.test.model.RegisterOfDistricts" %>
<%@ page import="com.test.service.RegisterOfDistrictsLocalServiceUtil" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
<%@ taglib prefix="liferay-theme" uri="http://liferay.com/tld/theme" %>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>

<liferay-theme:defineObjects/>
<portlet:defineObjects/>

<p>
    <b><liferay-ui:message key="districts.caption"/></b>
</p>
<h4>FILTERS</h4>
<aui:form action="<%=renderResponse.createRenderURL()%>" method="POST">

    <aui:fieldset>
        <aui:input name="isArchive" label="Show Archive" type="checkbox"/>

        <aui:button-row>
            <aui:button type="submit" value="Apply Filters"/>
        </aui:button-row>

    </aui:fieldset>

</aui:form>

<aui:button-row cssClass="crud-buttons">
    <portlet:renderURL var="addRegisterOfDistrictsURL">
        <portlet:param name="mvcPath" value="/edit.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= addRegisterOfDistrictsURL %>" value="Add district"/>

</aui:button-row>
<h4>REGISTRY</h4>
<liferay-ui:search-container emptyResultsMessage="no-data.caption"
                             total="<%= RegisterOfDistrictsLocalServiceUtil.getRegisterOfDistrictsesCount() %>">
    <%
        List<RegisterOfDistricts> list = (List<RegisterOfDistricts>) renderRequest.getAttribute("filteredRecords");
    %>
    <liferay-ui:search-container-results results='<%=list%>'/>

    <liferay-ui:search-container-row className="com.test.model.RegisterOfDistricts" modelVar="registerOfDistricts">
        <liferay-ui:search-container-column-text name="District name" value="<%= registerOfDistricts.getName() %>"/>
        <liferay-ui:search-container-column-text
                name="District code">${ registerOfDistricts.getDistrictCode() }</liferay-ui:search-container-column-text>
        <liferay-ui:search-container-column-text
                name="Archive">${ registerOfDistricts.getIsArchived() }</liferay-ui:search-container-column-text>
        <liferay-ui:search-container-column-jsp name="Manage" path="/actions.jsp"/>
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator/>
</liferay-ui:search-container>
