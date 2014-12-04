<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="string" uri="http://java.sun.com/jsp/jstl/fmt" %>
<h3><spring:message code="title.profile"/></h3>
<c:if test="${(not empty user) and (not empty currentUser)}">
    <b><spring:message code="title.Id"/> </b> ${currentUser.id}<br>
    <b>${currentUser.firstName} ${currentUser.lastName}</b> (<spring:message code="title.login"/> ${currentUser.login})<br>
   <b><spring:message code="user.Gender"/>: </b><spring:message code="gender.${currentUser.gender}"/><br>
    <b><spring:message code="user.Role"/>: </b><spring:message code="role.${currentUser.role}"/><br>
    <b><spring:message code="user.Email"/>: </b><a href="mailto:">${currentUser.email}</a>
</c:if>