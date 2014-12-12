<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

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
            var color;
            var confirm;
            var clazz;
            switch (o_obj[k].confirmed) {
                case true:
                    color = "#0C0";
                    confirm="Confirm";
                    clazz='success';
                    break;
                case false:
                    color = "#C00";
                    confirm="Disc";
                    clazz='danger';
                    break;
                default:
                    color = "";
                    confirm="XZ";
                    clazz='';
                    break;
            };


            var row = $('<tr id="c_' + i + '"  class='+clazz+'></tr>');
            row.append("<td>"+o_obj[k].id+"</td>");
            var link = $("<td></td>");
            link.append('<a href="' + ${hotel}+o_obj[k].hotelId + '"> ' +o_obj[k].hotelName+ '</a>');
            row.append(link);
            row.append("<td>"+o_obj[k].places+"</td>");
            row.append("<td>"+o_obj[k].roomCategory+"</td>");
            row.append("<td>" + new Date(o_obj[k].startDate).toDateString() + "</td>");
            row.append("<td>" + new Date(o_obj[k].endDate).toDateString() + "</td>");
            //TODO visual check
            row.append("<td style='background: "+color+";'>" + confirm + "</td>");
            $(o_id).append(row);
            i++;
        }
    };

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
        <th><spring:message code="title.Id"/></th>
        <th><spring:message code="title.Hotel"/></th>
        <th><spring:message code="title.Places"/></th>
        <th><spring:message code="title.Room_Category"/></th>
        <th><spring:message code="order.Start_Date"/></th>
        <th><spring:message code="order.End_Date"/></th>
        <th><spring:message code="order.Confurm"/></th>
    </tr>
    </thead>
    <tbody id="tableBody">
    </tbody>
</table>