<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sc" uri="http://www.springframework.org/security/tags" %>
<c:if test="${not empty user}">
    <ul id="menu" class="nav nav-pills nav-stacked">
        <li id="menu-hotel"><a href="<c:url value='/hotels/search'/>">HOTELS</a></li>

        <li id="menu-order"><a href="<c:url value='/orders/'/>">ORDERS</a></li>
        <li id="menu-user"><a href="<c:url value='/profile/' />"> User </a></li>
        <li id="menu-map"><a href="<c:url value='/map' />">MAP</a></li>
    </ul>
</c:if>