JSP:

<%@include file="/libs/foundation/global.jsp"%>
<%@page session="false" %>

<c:set var="title" value="${properties.title}" />
<c:set var="holidaysmodel" value="${com.exercise.slingmodels.HolidaysModel}"/>
<c:if test="${not empty holidaysmodel.holidays}"><c:set var="holidays" value="${holidaysmodel.holidays}" /></c:if>

<div class="container">
    ${title}

    <c:if test=${holidays} />
    <div class="holidays-container">
        <ul class="holiday-list">
        <c:forEach items="${holidays}" var="holiday" varStatus="counter">
            <li class="holiday">
                ${holiday.index}: ${holiday}
            </li>
        </c:forEach>
        </ul>
	</div>
    </c:if>
</div>
