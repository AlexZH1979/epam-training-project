<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/room/ajax" var="ajaxPath"/>
<script type="text/javascript">
    var body_id='#tableBody';
    var f = function fillOrdersTable(id, obj) {
        //delete all
        $(id).html("");

        var i = 0;
        for (var k in obj) {
            var row = $('<tr id="c_' + i + '"></tr>');
            row.append("<td>" + obj[k].id + "</td>");
            row.append("<td>" + obj[k].roomName + "</td>");
            row.append("<td>" + obj[k].size + "</td>");
            row.append("<td>" + obj[k].pricePerDay + "</td>");
            $(id).append(row);
            i++;
        }
    };

    function loadTable(begin, countSize) {
        loadTableAjax("${ajaxPath}",body_id, f, begin, countSize);
    }

    window.onload = function () {
        loadTableAjax("${ajaxPath}",body_id, f, 0, 10);
    }
</script>

<select name="selected_count" id="select_count" onchange="loadTable(0,$(this).val())">
    <option disabled selected>count</option>
    <option value="10">10</option>
    <option value="50">50</option>
    <option value="100">100</option>
</select>
<table id="list_rooms" border="1" cellpadding="10" cellspacing="0" class="table table-striped table-bordered">
    <thead>
    <tr>
        <th><spring:message code="title.Id"/></th>
        <th>NAME</th>
        <th>SIZE</th>
        <th>COST</th>
    </tr>
    </thead>
    <tbody id="tableBody">
    </tbody>
</table>
