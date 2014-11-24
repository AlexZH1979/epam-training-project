<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h3><spring:message code="title.Hotel"/></h3>
<c:url value="/hotels/set" var="set"/>
<c:if test="${success eq true}">
    <div class="alert-success">Selected hotel: ${hotel.name}</div>
</c:if>
<c:if test="${not empty hotel}">
    <address>
        <strong><h3><i>${hotel.name}</i></h3></strong>
        <h4><b>Address:</b></h4>
        <c:if test="${not empty hotel.hotelAddress.county}">
            <b>County:</b> ${hotel.hotelAddress.county}<br>
        </c:if>
        <c:if test="${not empty hotel.hotelAddress.city}">
            <b>City: </b>${hotel.hotelAddress.city}<br>
        </c:if>
        <c:if test="${not empty hotel.hotelAddress.state}">
            <b>State: </b>${hotel.hotelAddress.state}<br>
        </c:if>
        <c:if test="${not empty hotel.hotelAddress.address}">
            <b>Address: </b>${hotel.hotelAddress.address}<br>
        </c:if>
        <c:if test="${not empty hotel.hotelAddress.zip}">
            <b>ZIP: </b>${hotel.hotelAddress.zip}<br>
        </c:if>
    </address>
    <div><a href="${set}/${hotel.id}">select this hotel</a></div>
</c:if>