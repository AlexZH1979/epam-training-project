<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table id="roomsTable" border="1" cellpadding="10" cellspacing="0" class="table table-striped table-bordered">
    <thead>
    <tr>
        <th><spring:message code="title.Id"/></th>
        <th>NAME</th>
        <th>SIZE</th>
        <th>COST</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${rooms}" var="room">
       <tr id="id_${room.id}">
            <td>#${room.id}</td>
            <td>${room.roomName}</td>
            <td>${room.size} &nbsp; &nbsp;</td>
            <td>${room.pricePerDay}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
