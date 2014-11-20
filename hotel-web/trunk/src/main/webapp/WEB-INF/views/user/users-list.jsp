<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<table id="clientsTable" border="1" cellpadding="10" cellspacing="0" class="table table-striped table-bordered">
    <thead>
    <tr>
        <th><spring:message code="title.Id"/></th>
        <th><spring:message code="user.FirstName"/></th>
        <th><spring:message code="user.LastName"/></th>
        <th><spring:message code="title.login"/></th>
        <th><spring:message code="user.Email"/></th>
        <th><spring:message code="user.Gender"/></th>
        <th><spring:message code="user.Role"/></th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${users}" var="currentUser">
        <c:url value="/profile/${currentUser.id}" var="viewClientUrl"/>
        <tr id="c${currentUser.id}">
            <td>${currentUser.id}</td>
            <td><a href="${viewClientUrl}">${currentUser.firstName}</a></td>
            <td>${currentUser.lastName} &nbsp; &nbsp;</td>
            <td>${currentUser.login}</td>
            <td>${currentUser.email}</td>
            <td><spring:message code="gender.${currentUser.gender}"/></td>
            <!-- TODO -->
            <td>${currentUser.role}</td>
            <td>
                <span onclick="clientInfo(${currentUser.id})">Client Info (ajax)</span> <br/>
                <span onclick="clientDelete(${currentUser.id})">Client Delete (ajax)</span>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
