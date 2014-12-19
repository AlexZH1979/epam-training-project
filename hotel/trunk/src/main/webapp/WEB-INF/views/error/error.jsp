<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${empty returnPage}">
    <c:url value="/" var="returnPage"/>
</c:if>
<c:if test="${not empty errorMessage}">
<div><p>${errorMessage}</p></div>
</c:if>
<div>
    <p>
        <input type="reset" class="btn btn-warning"
                onclick="location.href='${returnPage}'"/>
    </p>
</div>