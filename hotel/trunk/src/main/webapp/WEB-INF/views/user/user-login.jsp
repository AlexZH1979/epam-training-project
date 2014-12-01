<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<c:url value="/login" var="login"/>
<c:url value="/reg" var="registration"/>
<h3>Please sign in</h3>
<c:if test="${not empty error}">
    <div class="danger">
        <p class="alert alert-danger">${error}</p>
    </div>
</c:if>
<form name='loginForm' action="${login}" method='POST' class="form-horizontal" role="form">
    <div class="form-group">
        <div class="col-sm-8">
            <div class="input-group">
                <div class="input-group-addon"><span class="glyphicon glyphicon-user"/></div>
                <input type="text" id="username" name="username" class="form-control"
                       placeholder="<spring:message code='title.enter_login'/>"
                       title="<spring:message code='title.Login'/>">
            </div>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-8">
            <div class="input-group">
                <div class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></div>
                <input type="password" id="password" name="password" class="form-control"
                       placeholder="<spring:message code='title.enter_password'/>"
                       title="<spring:message code='title.password'/>">
            </div>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-4 col-sm-8">
            <input name="submit" type="submit" class="btn btn-success" value="<spring:message code='title.signin'/>"/>
            <input name="submit" type="button" class="btn btn-primary" onclick="location.href='${registration}'">
        </div>
    </div>
</form>