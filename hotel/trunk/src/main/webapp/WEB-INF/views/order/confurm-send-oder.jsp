<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:url value="/hotels/${order.hotelId}" var="abort"/>
<c:url value="/orders/register/send" var="send"/>
<div>
    <p><b><spring:message code="title.Hotel"/>: </b>${order.hotelName}</p>
    <p><b><spring:message code="title.user"/>: </b>${order.userFullName}</p>
    <p><b><spring:message code="title.Room_Category"/>: </b>${order.roomCategory}</p>
    <p><b><spring:message code="title.Places"/>: </b>${order.places}</p>
    <p><b><spring:message code="order.Start_Date"/>: </b>${order.startDate}</p>
    <p><b><spring:message code="order.End_Date"/>: </b>${order.endDate}</p>
</div>
<input type="submit" class="btn btn-success" value="send" onclick="location.href='${send}'"/>
<input type="submit" class="btn btn-danger" value="cancel" onclick="location.href='${abort}'"/>