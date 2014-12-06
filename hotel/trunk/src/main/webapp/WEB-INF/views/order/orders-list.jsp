<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:url value="/orders/ajax" var="ajaxPath"/>
<c:url value="/profile/" var="profile"/>
<script type="text/javascript">
    var body_id = '#tableBody';

    var f = function fillOrdersTable(o_id, o_obj) {
        //delete all
        $(o_id).html("");

        var i = 0;
        for (var k in o_obj) {
            var start =new Date(o_obj[k].startDate);
            var end=new Date(o_obj[k].endDate);
            var row = $('<tr id="c_' + i + '"></tr>');
            row.append("<td>" + o_obj[k].id + "</td>");
            row.append("<td>" + new Date(o_obj[k].startDate).toLocaleDateString() + "</td>");
            row.append("<td>" + new Date(o_obj[k].endDate).toLocaleDateString() + "</td>");
            var link = $("<td></td>");
            link.append('<a href="' + ${profile} +o_obj[k].customerId + '">link</a>');
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
        <th class="col-sm-pull-1">Order ID</th>
        <th>Start Date</th>
        <th>End Date</th>
        <th>Client link</th>
    </tr>
    </thead>
    <tbody id="tableBody">
    </tbody>
</table>