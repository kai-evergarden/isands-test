<%@ page import="com.test.service.RegisterOfFarmersLocalServiceUtil" %>
<%@ page import="com.test.model.RegisterOfFarmers" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
<%@ taglib prefix="liferay-theme" uri="http://liferay.com/tld/theme" %>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>

<liferay-theme:defineObjects/>

<portlet:defineObjects/>
<p>
    <b><liferay-ui:message key="farmers.caption"/></b>
</p>
<h4>FILTERS</h4>
<aui:form action="<%=renderResponse.createRenderURL()%>" method="POST">

    <aui:fieldset>
        <aui:input name="dateOfRegistration" label="Date of Registration" type="date"/>
        <aui:input name="registrationArea" label="Registration Area" type="text"/>
        <aui:input name="inn" label="INN" type="text" />
        <aui:input name="organizationName" label="Organization Name" type="text"/>
        <aui:input name="isArchive" label="Show Archive" type="checkbox"/>

        <aui:button-row>
            <aui:button type="submit" value="Apply Filters"/>
        </aui:button-row>

    </aui:fieldset>

</aui:form>

<aui:button-row cssClass="crud-buttons">

    <portlet:renderURL var="addRegisterOfFarmersURL">
        <portlet:param name="mvcPath" value='/edit.jsp'/>
    </portlet:renderURL>

    <portlet:renderURL var="filterRegisterOfFarmersURL">
        <portlet:param name="mvcPath" value="/filter.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%=addRegisterOfFarmersURL%>" value="Add organization"/>
</aui:button-row>

<h4>REGISTRY</h4>
<liferay-ui:search-container emptyResultsMessage="no-data.caption"
                             total="<%=RegisterOfFarmersLocalServiceUtil.getRegisterOfFarmersesCount()%>">

    <%
            List<RegisterOfFarmers> list= (List<RegisterOfFarmers>) renderRequest.getAttribute("filteredRecords");
    %>
    <liferay-ui:search-container-results results='<%=list%>'/>
    <liferay-ui:search-container-row className="com.test.model.RegisterOfFarmers" modelVar="registerOfFarmers">

        <liferay-ui:search-container-column-text name="Organization name"
                                                 value="<%= registerOfFarmers.getOrganizationName()%>"/>
        <liferay-ui:search-container-column-text name="Legal form" value="<%= registerOfFarmers.getLegalForm()%>"/>
        <liferay-ui:search-container-column-text name="INN" value="<%= registerOfFarmers.getInn()%>"/>
        <liferay-ui:search-container-column-text name="KPP" value="<%= registerOfFarmers.getKpp()%>"/>
        <liferay-ui:search-container-column-text name="OGRN" value="<%= registerOfFarmers.getOgrn()%>"/>
        <liferay-ui:search-container-column-text name="Registration area"
                                                 value="<%= registerOfFarmers.getRegistrationArea()%>"/>
        <liferay-ui:search-container-column-text name="Crop areas" value="<%= registerOfFarmers.getCropAreas()%>"/>
        <liferay-ui:search-container-column-text name="Date of regestaration">
            ${registerOfFarmers.dateOfRegistration}
        </liferay-ui:search-container-column-text>
        <liferay-ui:search-container-column-text name="Archive">
            ${registerOfFarmers.isArchived}
        </liferay-ui:search-container-column-text>
        <liferay-ui:search-container-column-jsp name="Manage" path='/actions.jsp'/>

    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator/>
</liferay-ui:search-container>