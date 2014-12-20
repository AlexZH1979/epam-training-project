<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<c:url value="/hotels/search"  var="search"/>
<c:url value="/hotels/search/length" var="searchLength"/>
<c:url value="/hotels/search" var="ajaxSearchHotel"/>
<script type="text/javascript">
    var f = function fillHotelsTable(o_id, o_obj) {
        //delete all
        $(o_id).html("");
        var i = 0;
        for (var k in o_obj) {
            var row = $('<tr id="c_' + i + '"></tr>');
            var link = $("<td></td>");
            link.append('<a href="' + ${hotel} +o_obj[k].id + '"> #' + o_obj[k].id + '</a>');
            row.append(link);
            row.append("<td>" + o_obj[k].name + "</td>");
            row.append("<td>" + o_obj[k].category + "</td>");
            row.append("<td> Address: " + o_obj[k].hotelAddress.address + "<br> City: " + o_obj[k].hotelAddress.city +
                    "<br> Country: " + o_obj[k].hotelAddress.county + "</td>");
            $(o_id).append(row);
            i++;
        }
        $(o_id).parent().parent().show();
    }
    //get table hotels by param
    function loadTables(parameter, value) {
        loadTableByParamAjax("${ajaxSearchHotel}", '#tableBody', f, parameter, value);
    }

    var listSizes = function listHotelSizes(e_id, parameter, v, find) {
        console.log("id "+ e_id+' parameter '+parameter+ ' value ' +v+ ' find '+find);
        var message;
        switch (parameter) {
            case "state":
                message = "<spring:message code='title.by_state'/>";
                break;
            case "county":
                message = "<spring:message code='title.by_county'/>";
                break;
            case "city":
                message = "<spring:message code='title.by_city'/>";
                break;
            case "address":
                message = "<spring:message code='title.by_address'/>";
                break;
            case "name":
                message = "<spring:message code='title.by_name'/>";
                break;
        }
        var btn = $('<button type="button" class="btn btn-primary col-md-12" onclick="loadTables(\'' + parameter + '\', \'' + v + '\');"></button>');
        btn.append('<spring:message code="title.Findded_by"/>&nbsp' + message + ': ' + v + ' ' + find + ' </p>');
        $(e_id).append(btn);
        $(e_id).show();
    };


    function listSizesResult(target_id, value) {
        var searchParameters = ["state", "county", "city", "address", "name"];
        $('#butt').button('loading')
        $(target_id).html("");
        $("#tableBody").html("");
        console.log("target_id "+target_id);
        console.log("value "+value);
        for (var k in searchParameters) {
            console.log("searchParameters "+searchParameters[k]);
            searchByParam("${searchLength}", searchParameters[k], value, target_id, listSizes, '#butt');
        }
    }
</script>
<div>
    <h3><spring:message code="title.Search"/></h3>

    <div>
        <label for="state" class="col-sm-4 control-label"><spring:message code="title.destination"/></label>

        <div class="col-sm-8">
            <div class="col-sm-8">

                <input type="text" id="state" name="value" class="input-sm"
                       placeholder="<spring:message code="title.search_placeholder"/> ">
            </div>
        </div>
    </div>
    <div>
        <div class="col-sm-offset-4 col-sm-8">
            <button id="butt" type="button" class="btn btn-primary"
            onclick="listSizesResult('#finder',$('#state').val())"><span class="glyphicon glyphicon-search"></span>
                <spring:message code='title.Search'/></button>
        </div>
    </div>
</div>
<div id="finder" class="row" hidden="hidden">
</div>
<div class="well" hidden="hidden">
    <table class="table table-striped">
    <thead/>
    <tbody id="tableBody"></tbody>
</table>
</div>