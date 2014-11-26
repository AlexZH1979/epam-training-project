<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/header.css"/>" />

<div class="navbar navbar-default" role="navigation">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="<c:url value="/login"/>"><spring:message code="app.Name"/></a>
			<c:if test="${user.role eq 'ADMINISTRATOR'}">
				<a class="navbar-brand" href="<c:url value="/users/"/>">View Clients</a>
			</c:if>
            <c:if test="${not empty selectHotelId}">
                <a class="navbar-brand" href="<c:url value="/hotels/${selectHotelId}"/>">Hotel-info</a>
            </c:if>
		</div>
		<ul class="nav navbar-nav navbar-right">
			<c:if test="${not empty user}">
				<li><a href="<c:url value="/profile/${user.id}" />">${user.firstName} (ID: ${user.id})</a></li>
				<li><a href="<c:url value="/profile/${user.id}" />">Profile</a></li>
				<li><a href="<c:url value="/logout"/>">Logout</a></li>
			</c:if>
			<c:if test="${empty user}">
				<li><a href="<c:url value="/login"/>">Log In</a></li>
			</c:if>
		</ul>
	</div>
</div>