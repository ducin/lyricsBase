<%@ include file="../tiles/include.jsp" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>edit song</h1>
<form:form method="POST" commandName="song" action="submit.html">
<table>
    <tr>
        <td><form:label path="title">Title</form:label></td>
        <td><form:input path="title" /></td>
    </tr>
    <tr>
        <td><form:label path="author">Author</form:label></td>
        <td><form:input path="author" /></td>
    </tr>
    <tr>
        <td><form:label path="album">Album</form:label></td>
        <td><form:input path="album" size="80" /></td>
    </tr>
    <tr>
        <td><form:label path="lyrics">Lyrics</form:label></td>
        <td>
            <form:textarea path="lyrics" rows="10" cols="80" />
        </td>
    </tr>
    <tr>
        <td colspan="2"><input type="submit" value="update"></td>
    </tr>
</table>
</form:form>

