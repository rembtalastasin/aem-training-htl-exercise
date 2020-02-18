JSP:

<c:set var="resourceType" value="${properties.sling:resourceType}" />
<c:set var="holidaysmodel" value="${'com.codeandtheory.exercises.slingmodels.core.models.HolidaysModel'}"/>
<c:if test="${not empty holidaysmodel.holidays}"><c:set var="holidays" value="${holidaysmodel.holidays}" /></c:if>

<div class="container">
    Resource Type: ${resourceType}

    List of Holidays for 2020:

    <c:if test=${holidays} />
    <div class="holidays-container">
        <ul class="holiday-list">
        <c:forEach items="${holidays}" var="holiday" varStatus="counter">
            <li class="holiday"> ${holiday.index}: ${holidays} </li> <br />
        </c:forEach>
        </ul>
	</div>
    </c:if>
</div>
