<%@ include file="../tiles/include.jsp" %>

<h1><c:out value="${jukebox.name}" /></h1>
Display songs:<br />
<ul id="sortable">
    <c:forEach items="${jukebox.allSongs}" var="song">
        <li>
            <a href="${pageContext.request.contextPath}/song/display.html?slug=<c:out value="${song.slug}" />">
                <c:out value="${song.author}" /> - <c:out value="${song.title}" />
            </a>
            <a href="${pageContext.request.contextPath}/song/edit.html?id=<c:out value="${song.id}" />">
                <i class="icon-edit"></i>
            </a>
            <a class="confirm" href="${pageContext.request.contextPath}/song/delete.html?id=<c:out value="${song.id}" />">
                <i class="icon-remove"></i>
            </a>
        </li>
    </c:forEach>
</ul>

<script>
    $(document).on("click", ".confirm", function(e) {
        e.preventDefault();
        var location = $(this).attr('href');
        bootbox.confirm("Are you sure?", "No way!", "Yes, delete the song!", function(result) {
            if(result) {
                window.location.replace(location);
            }
        });
    });
</script>
