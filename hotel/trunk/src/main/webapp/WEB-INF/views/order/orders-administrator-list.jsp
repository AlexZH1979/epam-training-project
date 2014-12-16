<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:url value="${path}" var="ajaxPath"/>
<c:url value="/profile/" var="profile"/>
<c:url value="/hotels/" var="hotel"/>
<script type="text/javascript">
    var body_id = '#tableBody';
    var hidenOrders="false";

    var f = function fillOrdersTable(o_id, o_obj) {
        //delete all
        $(o_id).html("");

        var i = 0;
        for (var k in o_obj) {
            var row = $('<tr class="" id="c_' + i + '"></tr>');
            var link = $("<td></td>");
            link.append('<a href="' + ${hotel}+o_obj[k].id + '"> #' +o_obj[k].id+ '</a>');
            row.append(link)
            var link1 = $("<td></td>");
            link1.append('<a href="' + ${hotel}+o_obj[k].hotelId + '"> ' +o_obj[k].hotelName+ '</a>');
            row.append(link1);
            row.append("<td>"+o_obj[k].roomCategory+"</td>");
            row.append("<td>" + o_obj[k].startDate + "</td>");
            row.append("<td>" + o_obj[k].endDate + "</td>");
            link = $("<td></td>");
            link.append('<a href="' + ${profile} +o_obj[k].customerId + '">'+o_obj[k].userFullName+'</a>');
            row.append(link);
            $(o_id).append(row);
            i++;
        }
    };

    function loadTable(begin, countSize) {
        loadTableAjax("${ajaxPath}?hiden="+hidenOrders, body_id, f, begin, countSize);
    }

    window.onload = function () {
        loadTableAjax("${ajaxPath}?hiden="+hidenOrders, body_id, f, 0, 10);
    }
</script>
<c:if test="${not empty intem}">
    <h1><spring:message code="title.${nameIntem}"/>: ${intem}</h1>
</c:if>
<select name="selected_count" id="select_count" onchange="loadTable(0,$(this).val())">
    <option disabled selected>count</option>
    <option value="10">10</option>
    <option value="50">50</option>
    <option value="100">100</option>
</select>
<table id="list_orders" border="1" cellpadding="10" cellspacing="0" class="table table-striped table-bordered">
    <thead>
    <tr>
        <th><spring:message code="title.Id"/> </th>
        <th><spring:message code="title.Hotel"/> </th>
        <th><spring:message code="title.Room_Category"/> </th>
        <th><spring:message code="order.Start_Date"/> </th>
        <th><spring:message code="order.End_Date"/> </th>
        <th><spring:message code="order.Customer"/> </th>
    </tr>
    </thead>
    <tbody id="tableBody">
    </tbody>
</table>