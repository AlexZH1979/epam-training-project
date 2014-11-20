<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:if test="${not empty user}">
	<ul class="nav nav-pills nav-stacked">
		<li><a href="<c:url value="/order"/> "> Menu</a></li>
		<li class="active"><a href="<c:url value="/profile/${user.id}" />"> User </a></li>
		<li><a href="<c:url value="/map" />">MAP</a></li>
		<li><a href="<c:url value="/reg/" />"> Registration</a></li>
		<li><a href="<c:url value="/client/list" />"> Menu Item 3254</a></li>
	</ul>
</c:if>