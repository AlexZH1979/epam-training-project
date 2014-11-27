<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<c:url value="/hotels/search"  var="search"/>
<script type="text/javascript">
    function searchHotel(param){
        searchByParam(${search},param, '#finded',function listHotels(e_id,find){
            $(e_id).html("");
            var i = 0;
            for (var k in find) {
                var row = $('<tr id="c_' + i + '"></tr>');
                row.append("<td>" + find[k].id + "</td>");
                row.append("<td>" + find[k].name + "</td>");
                $(id).append(row);
                i++;
            }
        })
    }
</script>
<form name="searchForm" action="${search}" method='POST' class="form-horizontal" role="form">
    <div class="form-group">
        <label for="state" class="col-sm-4 control-label"><spring:message code="title.destination"/></label>

        <div class="col-sm-8">
            <div class="col-sm-8">
                <input type="text" id="state" name="value" class="form-control" placeholder="<spring:message code="title.search_placeholder"/> ">
            </div>
        </div>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-4 col-sm-8">
            <input name="submit" type="submit" class="btn btn-primary" value="<spring:message code='title.Search'/>" onclick="searchHotel($('#state').value);"/>
        </div>
    </div>
</form>
<table id="finded"></table>