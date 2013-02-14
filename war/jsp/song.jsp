<%@ include file="../WEB-INF/tiles/include.jsp" %>

<h1><c:out value="${song.author}" /> - <c:out value="${song.title}" /></h1>
<h2>from album "<c:out value="${song.album}" />"</h2>
<pre><c:out value="${song.lyrics}" /></pre>
