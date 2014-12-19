1
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${empty returnPage}">
    <c:url value="/" var="returnPage"/>
</c:if>
<div>
    <p>
        <button type="button" class="btn bg-info" value="${error}"
                onclick="location.href='${returnPage}'"/>
    </p>
</div>