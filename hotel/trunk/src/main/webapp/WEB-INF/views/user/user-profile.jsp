<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="string" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<security:authorize access="isFullyAuthenticated()">
    <div class="col-md-2"></div>
    <div class="well col-md-6">
        <h3><spring:message code="title.profile"/></h3>
        <b><spring:message code="title.Id"/> </b> ${currentUser.id}<br>
        <b><spring:message code="title.user"/>: </b>${currentUser.firstName} ${currentUser.lastName}
        (<b><spring:message code="title.login"/>: </b>${currentUser.login})<br>
        <b><spring:message code="user.Gender"/>: </b><spring:message code="gender.${currentUser.gender}"/><br>
        <b><spring:message code="user.Role"/>: </b><spring:message code="role.${currentUser.role}"/><br>
        <b><spring:message code="user.Email"/>: </b><a href="mailto:">${currentUser.email}</a>
    </div>
    <div class="col-md-2"></div>
</security:authorize>