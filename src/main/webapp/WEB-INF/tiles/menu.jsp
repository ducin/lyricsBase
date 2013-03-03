<%@ include file="include.jsp" %>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<a class="brand" href="${pageContext.request.contextPath}">lyricsBase</a>

<tilesx:useAttribute name="view" />
<div class="nav-collapse collapse">
    <ul class="nav">
        <li<c:if test="${'homepage' == view}"> class="active"</c:if>><a href="${pageContext.request.contextPath}">Home</a></li>
        <li<c:if test="${'jukebox' == view}"> class="active"</c:if>><a href="${pageContext.request.contextPath}/jukebox.html">Jukebox</a></li>
        <li<c:if test="${'about' == view}"> class="active"</c:if>><a href="${pageContext.request.contextPath}/static/about.html">About</a></li>
<!--
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li><a href="${pageContext.request.contextPath}/edit.html">Edit</a></li>
                    <li><a href="#">Another action</a></li>
                    <li><a href="#">Something else here</a></li>
                    <li class="divider"></li>
                    <li class="nav-header">Nav header</li>
                    <li><a href="#">Separated link</a></li>
                    <li><a href="#">One more separated link</a></li>
                </ul>
            </li>
-->
    </ul>
</div>
