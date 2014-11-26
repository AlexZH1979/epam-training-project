<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:if test="${not empty user}">
    <ul id="menu" class="nav nav-pills nav-stacked">
        <li id="menu-hotel"><a href="<c:url value='/hotels/'/>">HOTELS</a></li>
        <li id="menu-order"><a href="<c:url value='/orders/'/>">ORDERS</a></li>
        <li id="menu-user"><a href="<c:url value='/profile/${user.id}' />"> User </a></li>
        <li id="menu-map"><a href="<c:url value='/map' />">MAP</a></li>
        <c:if test="${not empty selectHotelId}">
            <li id="menu-room"><a href="<c:url value='/room/' />"> ROOM</a></li>
        </c:if>
    </ul>
</c:if>