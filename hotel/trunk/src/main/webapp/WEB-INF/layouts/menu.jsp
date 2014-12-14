<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<security:authorize access="isFullyAuthenticated()">
    <ul id="menu" class="nav nav-pills nav-stacked">
        <li id="menu-hotel"><a href="<c:url value='/hotels/search'/>"><spring:message code="title.Hotels"/></a></li>
        <li id="menu-order"><a href="<c:url value='/orders/'/>"><spring:message code="title.Orders"/></a></li>
        <li id="menu-map"><a href="<c:url value='/map' />"><spring:message code="title.Map"/></a></li>
    </ul>
</security:authorize>