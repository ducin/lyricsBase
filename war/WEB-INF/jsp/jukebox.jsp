<%@ include file="../tiles/include.jsp" %>

<h1><c:out value="${jukebox.name}" /></h1>
Display songs:<br />
<ul>
    <c:forEach items="${jukebox.songs}" var="song">
        <li><a href="display.html?slug=<c:out value="${song.slug}" />">
            <c:out value="${song.author}" /> - <c:out value="${song.title}" />
        </a></li>
    </c:forEach>
</ul>