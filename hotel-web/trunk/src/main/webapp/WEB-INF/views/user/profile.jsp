<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="string" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div align="right">
	<c:set var="currentLocale">${pageContext.response.locale}</c:set>
	<c:set var="localeCode" value="${fn:toUpperCase(currentLocale)}" />
	
	<c:set var="availLanguages" value="EN,RU" />
	<c:if test="${!fn:contains(availLanguages, localeCode)}">
	  <c:set var="localeCode" value="EN" />
	</c:if>
	
 	<c:forEach var="lang" items="${availLanguages}">
 	    <c:set var="langHTML" value="${lang}" />
	 	<c:if test="${lang eq localeCode}">
		  <c:set var="langHTML" value="<b><u>${lang}</u></b>" />
		</c:if>
    	<a href="${currentPage}?lang=${lang}">${langHTML}</a> &nbsp;
	</c:forEach>
</div>
<h3><spring:message code="title.profile"/></h3>
<c:if test="${not empty user}">
    <b><spring:message code="title.Id"/> </b> ${currentUser.id}<br>
    <b>${currentUser.firstName} ${currentUser.lastName}</b> (<spring:message code="title.login"/> ${currentUser.login})<br>
   <b><spring:message code="user.Gender"/>: </b><spring:message code="gender.${currentUser.gender}"/><br>
    <b><spring:message code="user.Role"/>: </b>${currentUser.role}<br>
    <b><spring:message code="user.Email"/>: </b>${currentUser.email}
</c:if>
<br/><br/>

