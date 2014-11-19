<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


    <table>
        <tr><th>Order ID</th><th>Price</th><th>Client link</th></tr>
        <c:forEach items="${list}" var="order">
            <tr><td>${order.id}</td><td>${order.price}</td><td><a href='<c:url value="/profile/${order.customerId}"/>'>client...</a></td></tr>
        </c:forEach>
    </table>
