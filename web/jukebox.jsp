<%@ page import="com.blogspot.symfonyworld.lyricsbase.*" contentType="text/html" pageEncoding="UTF-8" %>
<%@ include file="include.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/bootsrtap.min.css">
        <script type="text/javascript" src="<%= request.getContextPath() %>/js/bootstrap.min.js"></script>
        <title>lyricsBase: <c:out value="${jukebox.name}" /></title>
    </head>
    <body>
        <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container">
                    <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </a>
                    <a class="brand" href="#">Project name</a>
                    <div class="nav-collapse collapse">
                        <ul class="nav">
                            <li class="active"><a href="#">Home</a></li>
                            <li><a href="#about">About</a></li>
                            <li><a href="#contact">Contact</a></li>
                        </ul>
                    </div><!--/.nav-collapse -->
                </div>
            </div>
        </div>

        <div class="container">

            <h1><c:out value="${jukebox.name}" /></h1>
            Edit songs:<br />
            <ul>
                <c:forEach items="${jukebox.songs}" var="song">
                    <li><a href=""><c:out value="${song.author}" /> - <c:out value="${song.title}" /></a></li>
                </c:forEach>
            </ul>
            <p>Use this document as a way to quick start any new project.<br> All you get is this message and a barebones HTML document.</p>
        </div> <!-- /container -->
    </body>
</html>
