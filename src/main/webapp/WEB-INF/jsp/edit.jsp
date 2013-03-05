<%@ include file="../tiles/include.jsp" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>edit song</h1>
<form:form method="POST" commandName="song">
<table>
    <tr>
        <td>Title:</td>
        <td><form:input path="title" /></td>
    </tr>
    <tr>
        <td>Author:</td>
        <td><form:input path="author" /></td>
    </tr>
    <tr>
        <td>Album:</td>
        <td><form:input path="album" size="80" /></td>
    </tr>
    <tr>
        <td>Lyrics :</td>
        <td>
            <form:textarea path="lyrics" rows="10" cols="80" />
        </td>
    </tr>
    <tr>
        <td colspan="2"><input type="submit" value="update"></td>
    </tr>
</table>
</form:form>

