<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<script type="text/javascript">
    $(document).ready(
            $('.dropdown-toggle').dropdown()
    );
</script>
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/header.css"/>" />
<div class="navbar navbar-default navbar-static-top" role="navigation">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="<c:url value="/login"/>"><spring:message code="app.Name"/></a>
			<c:if test="${user.role eq 'ADMINISTRATOR'}">
				<a class="navbar-brand" href="<c:url value="/users/"/>">View Clients</a>
			</c:if>
		</div>
        <c:set var="currentLocale">${pageContext.response.locale}</c:set>
        <c:set var="localeCode" value="${fn:toUpperCase(currentLocale)}"/>
        <c:set var="availLanguages" value="EN,RU"/>
        <c:if test="${!fn:contains(availLanguages, localeCode)}">
            <c:set var="localeCode" value="EN"/>
        </c:if>
        <ul class="nav navbar-nav navbar-right">
            <li>
                <button class="btn dropdown-toggle btn-sm" data-toggle="dropdown" role="button"
                        aria-expanded="false">
                    <img src="<c:url value='/resources/img/${fn:toLowerCase(currentLocale)}.png'/>"
                         alt="${langHTML}"></a>
                    <span class="caret"></span>
                </button>
                <ul class="dropdown-menu" role="menu" aria-labelledby="dLabel">
                    <c:forEach var="lang" items="${availLanguages}">
                        <c:set var="langHTML" value="${lang}"/>
                        <c:if test="${lang eq localeCode}">
                            <c:set var="langHTML" value="<b><u>${lang}</u></b>"/>
                        </c:if><a class="btn dropdown-toggle"
                                  href="${currentPage}?lang=${lang}">
                        <img src="<c:url value='/resources/img/${fn:toLowerCase(lang)}.png'/>"
                             alt="${langHTML}"></a>
                    </c:forEach>
                </ul>
            </li>
            <c:if test="${not empty user}">
                <li><a href="<c:url value="/profile/${user.id}" />">${user.firstName} (ID: ${user.id})</a></li>
                <li><a href="<c:url value="/j_spring_security_logout"/>">Logout</a></li>
            </c:if>
            <c:if test="${empty user}">
                <li><a href="<c:url value="/login"/>">Log In</a></li>
            </c:if>
        </ul>
    </div>
</div>