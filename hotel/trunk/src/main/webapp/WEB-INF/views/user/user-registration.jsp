<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!-- TODO причем много и жестоко -->
<c:url value="/login" var="login"/>
<c:if test="${not empty error}">
    <div class="danger">
        <p class="alert alert-danger">${error}</p>
    </div>
</c:if>
<form:form action="${action}" method="post" commandName="client"
           modelAttribute="registredUser" cssClass="form-horizontal">
    <form:errors path="*" cssClass="errorblock" element="div"/>
    <div class="form-group">
        <form:label path="firstName" cssClass="col-sm-4 control-label"><spring:message code="user.FirstName"/>:
        </form:label>
        <div class="col-sm-8">
            <div class="input-group">
                <div class="input-group-addon"><span class="glyphicon glyphicon-user"></span></div>
                <form:input class="form-control" path="firstName"/>
                <form:errors path="firstName" cssClass="alert alert-danger"/>
            </div>
        </div>
    </div>
    <div class="form-group">
        <form:label path="lastName" cssClass="col-sm-4 control-label"><spring:message code="user.LastName"/>:
        </form:label>
        <div class="col-sm-8">
            <div class="input-group">
                <div class="input-group-addon"><span class="glyphicon glyphicon-user"></span></div>
                <form:input class="form-control" path="lastName"/>
                <form:errors path="lastName" cssClass="alert alert-danger"/>
            </div>
        </div>
    </div>
    <div class="form-group">
        <form:label path="login" cssClass="col-sm-4 control-label"><spring:message code="title.Login"/>:
        </form:label>
        <div class="col-sm-8">
            <div class="input-group">
                <div class="input-group-addon"><span class="glyphicon glyphicon-log-in" aria-hidden="true"></span></div>
                <form:input class="form-control" path="login"/>
                <form:errors path="login"/>
            </div>
        </div>
    </div>
    <div class="form-group">
        <form:label path="password" cssClass="col-sm-4 control-label"><spring:message code="title.password"/>:
        </form:label>
        <div class="col-sm-8">
            <div class="input-group">
                <div class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></div>
                <form:input class="form-control" path="password" type="password"/>
                <form:errors path="password"/>
            </div>
        </div>
    </div>
    <div class="form-group">
        <form:label path="email" cssClass="col-sm-4 control-label"><spring:message code="user.Email"/>:
        </form:label>
        <div class="col-sm-8">
            <div class="input-group">
                <div class="input-group-addon"><span class="glyphicon glyphicon-envelope"></span></div>
                <form:input class="form-control" path="email" type="email"/>
                <form:errors path="email"/>
            </div>
        </div>
    </div>
    <div class="form-group">
        <form:label path="gender" cssClass="col-sm-4 control-label"><spring:message
                code="user.Gender"/></form:label>
        <div class="col-sm-8">
            <form:select path="gender" cssClass="form-control">
                <form:options items="${genderList}"/>
            </form:select>
            <form:errors path="gender" cssClass="error"/><br>
        </div>
    </div>
    <input name="submit" type="submit" class="btn btn-success" value="Save"/>
    <input name="submit" type="submit" class="btn btn-warning" value="Cancel" onclick="location.href='${login}'"/>
</form:form>