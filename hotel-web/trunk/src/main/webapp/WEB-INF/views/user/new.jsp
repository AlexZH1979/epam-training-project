<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!-- TODO причем много и жестоко -->
<form:form commandName="client"  method="post">
    <form:label path="firstName"><spring:message code="user.FirstName"/>: </form:label>
    <form:input class="input" cssClass="glyphicon-search" path="firstName"/>

    <form:label path="lastName"><spring:message code="user.LastName"/>: </form:label>
    <form:input class="input search-query" path="lastName"/>
    <form:errors path="lastName"/><br>

    <form:label path="login"><spring:message code="title.login"/>: </form:label>
    <form:input class="input search-query" path="login"/>
    <form:errors path="login"/><br>

    <form:label path="password"><spring:message code="title.password"/>: </form:label>
    <form:input class="input" path="password"/>
    <form:errors path="password"/><br>

    <form:label path="email"><spring:message code="user.Email"/>: </form:label>
    <form:input class="input" path="email"/>
    <form:errors path="email"/><br>

    <form:label path="gender"><spring:message code="user.Gender"/></form:label><br/>
    <form:select path="gender">
        <form:option  value="${genderList[0]}"/>
        <form:options items="${generList}" />
    </form:select>
    <form:errors path="gender" cssClass="error" />

    <form:label path="role"><spring:message code="user.Role"/></form:label><br/>
    <form:select path="role" disabled="true">
        <form:option  value="CUSTOMER"/>
    </form:select>
    <form:errors path="role" cssClass="error" />
    <input type="submit" value="Save"/>
    <input type="reset" value="Cancel" onclick="window.history.back();"/>
</form:form>