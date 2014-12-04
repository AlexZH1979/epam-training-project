<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<h1>order</h1>
<form:form action="${action}" method="post" modelAttribute="order" commandName="order" cssClass="form-horizontal">
    <form:input type="text" id="hotelId" path="hotelId" class="form-control" value="${hotel.id}" hidden="true"/>
    <form:input type="text" id="customerId" path="customerId" class="form-control" value="${user.id}" hidden="true"/>

    <input type="text" id="customer" name="user" class="form-control" placeholder="${user.firstName} ${user.lastName}" disabled>
    <input type="text" id="hotel" name="hotel" class="form-control" placeholder="${hotel.name}" disabled>
    <input type="text" id="startDate"class="form-control" value="${order.startDate}"
                disabled="true"/>
    <input type="text" id="endDate"  class="form-control" value="${order.endDate}" disabled="true"/>
    <input type="text" id="hotel" name="hotel" class="form-control" placeholder="${hotel.name}" disabled>

    <form:errors path="*" cssClass="errorblock" element="div"/>

    <input name="submit" type="submit" class="btn btn-success" value="Save"/>
    <input name="submit" type="submit" class="btn btn-warning" value="Cancel"
           onclick="location.href='/hotels/${hotel.id}'"/>
</form:form>