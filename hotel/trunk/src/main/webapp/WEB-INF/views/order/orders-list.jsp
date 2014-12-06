<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:url value="/orders/ajax" var="ajaxPath"/>
<c:url value="/profile/" var="profile"/>
<c:url value="/hotels/" var="hotel"/>
<script type="text/javascript">
    var body_id = '#tableBody';

    var f = function fillOrdersTable(o_id, o_obj) {
        //delete all
        $(o_id).html("");

        var i = 0;
        for (var k in o_obj) {
            var row = $('<tr id="c_' + i + '"></tr>');
            var link = $("<td></td>");
            link.append('<a href="' + ${hotel}+o_obj[k].hotelId + '"> ' +o_obj[k].hotelName+ '</a>');
            row.append(link);
            row.append("<td>"+o_obj[k].roomCategory+"</td>");
            row.append("<td>" + new Date(o_obj[k].startDate).toLocaleDateString() + "</td>");
            row.append("<td>" + new Date(o_obj[k].endDate).toLocaleDateString() + "</td>");
            link = $("<td></td>");
            link.append('<a href="' + ${profile} +o_obj[k].customerId + '">'+o_obj[k].userFullName+'</a>');
            row.append(link);
            $(o_id).append(row);
            i++;
        }
    }


    function loadTable(begin, countSize) {
        loadTableAjax("${ajaxPath}", body_id, f, begin, countSize);
    }

    window.onload = function () {
        loadTableAjax("${ajaxPath}", body_id, f, 0, 10);
    }
</script>

<select name="selected_count" id="select_count" onchange="loadTable(0,$(this).val())">
    <option disabled selected>count</option>
    <option value="10">10</option>
    <option value="50">50</option>
    <option value="100">100</option>
</select>
<table id="list_orders" border="1" cellpadding="10" cellspacing="0" class="table table-striped table-bordered">
    <thead>
    <tr>
        <th>Hotel</th>
        <th>Room Category</th>
        <th>Start Date</th>
        <th>End Date</th>
        <th>Client link</th>
    </tr>
    </thead>
    <tbody id="tableBody">
    </tbody>
</table>