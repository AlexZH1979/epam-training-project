<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<h1>Error Page</h1>
<c:if test="${empty returnPage}">
    <c:url value="/" var="returnPage"/>
</c:if>
<c:if test="${not empty errorMessage}">
<div><p>${errorMessage}</p></div>
</c:if>
<c:if test="${not empty url}">
    <b>Page:</b>Page URL ${url}
</c:if>
<c:if test="${not empty timestamp}">
    <b>Occurred:</b>Timestamp
</c:if>
<c:if test="${not empty error}">error ...${error}
</c:if>
<c:if test="${not empty status}">
    <b>Response Status:</b>status-code ${status}
    <p>Application has encountered an error. Please contact support on
        ...</p>
    <p>Support may ask you to right click to view page source.</p></c:if>
<div>
    <p>
        <button type="button" class="btn btn-warning"
                onclick="location.href='${returnPage}'"><spring:message code="title.Return"/></button>
    </p>
</div>