<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:url value="/hotels/${order.hotelId}" var="cancel"/>
<c:url value="/orders/register/send" var="send"/>
<div>
    <div class="col-md-2"></div>
    <div class="well col-md-6">
        <div>
        <p><b><spring:message code="title.Hotel"/>: </b>${order.hotelName}</p>
        <p><b><spring:message code="title.User"/>: </b>${order.userFullName}</p>
        <p><b><spring:message code="title.Room_Category"/>: </b>${order.roomCategory}</p>
        <p><b><spring:message code="title.Places"/>: </b>${order.places}</p>
        <p><b><spring:message code="order.Start_Date"/>: </b>${order.startDate}
            <b><spring:message code="order.End_Date"/>: </b>${order.endDate}</p>
    </div>
        <input class="btn btn-sm btn-success" type="button" onclick="location.href='${send}'"
               value="<spring:message code='send.Order'/>"/>
        <input class="btn btn-sm btn-danger" type="button" onclick="location.href='${cancel}'"
               value="<spring:message code='title.Cancel'/>"/>
    </div>
    <div class="col-md-2"></div>
</div>