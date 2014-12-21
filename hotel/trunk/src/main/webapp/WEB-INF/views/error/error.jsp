<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<h1>Error Page</h1>
<c:if test="${empty returnPage}">
    <c:url value="/" var="returnPage"/>
</c:if>
<c:if test="${not empty errorMessage}">
    <div><p>${errorMessage}</p></div>
</c:if>
<div>
    <p>
        <button type="button" class="btn btn-warning"
                onclick="location.href='${returnPage}'"><spring:message code="title.Return"/></button>
    </p>
</div>