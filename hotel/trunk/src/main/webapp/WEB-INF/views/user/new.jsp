<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!-- TODO причем много и жестоко -->
<form:form method="post" commandName="client"
           modelAttribute="client" cssClass="form-horizontal">
    <div class="form-group">
        <form:label path="firstName" cssClass="col-sm-4 control-label"><spring:message code="user.FirstName"/>:
        </form:label>
        <div class="col-sm-8">
            <form:input class="form-control" path="firstName"/>
            <form:errors path="firstName" cssClass="alert alert-danger"/>
        </div>
    </div>
    <div class="form-group">
        <form:label path="lastName" cssClass="col-sm-4 control-label"><spring:message code="user.LastName"/>:
        </form:label>
        <div class="col-sm-8">
            <form:input class="form-control" path="lastName"/>
            <form:errors path="lastName" cssClass="alert alert-danger"/>
        </div>
    </div>

    <div class="form-group">
        <form:label path="login" cssClass="col-sm-4 control-label"><spring:message code="title.Login"/>:
        </form:label>
        <div class="col-sm-8">
            <form:input class="form-control" path="login"/>
            <form:errors path="login"/>
        </div>
    </div>

    <div class="form-group">
        <form:label path="password" cssClass="col-sm-4 control-label"><spring:message code="title.password"/>:
        </form:label>
        <div class="col-sm-8">
            <form:input class="form-control" path="password" type="password"/>
            <form:errors path="password"/>
        </div>
    </div>

    <div class="form-group">
        <form:label path="email" cssClass="col-sm-4 control-label"><spring:message code="user.Email"/>:
        </form:label>
        <div class="col-sm-8">
            <form:input class="form-control" path="email" type="email" required="true"/>
            <form:errors path="email"/>
        </div>
    </div>

    <div class="form-group">
        <form:label path="gender" cssClass="col-sm-4 control-label"><spring:message
                code="user.Gender"/></form:label>
        <div class="col-sm-8">
            <form:select path="gender" cssClass="form-control">
                <form:options items="${generList}"/>
            </form:select>
            <form:errors path="gender" cssClass="error"/><br>
        </div>
    </div>
    <!-- TODO -->
    <!-- user role set in controller: default value=role.customer -->
    <input type="submit" class="btn btn-success" value="Save"/>
    <input type="reset" class="btn btn-warning" value="Cancel" onclick="window.history.back();"/>
</form:form>