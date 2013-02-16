<%@ page import="com.blogspot.symfonyworld.lyricsbase.*" contentType="text/html" pageEncoding="UTF-8" %>
<%@ include file="include.jsp" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title><tiles:insertAttribute name="title" /></title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/lyricsBase.css">
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.9.1.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
        <link rel="Shortcut icon" href="${pageContext.request.contextPath}/resources/img/favicon32.png" />
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
                    <a class="brand" href="${pageContext.request.contextPath}">lyricsBase</a>
                    <div class="nav-collapse collapse">
                        <ul class="nav">
                            <li class="active"><a href="#">Home</a></li>
                            <li><a href="${pageContext.request.contextPath}/static/about.html">About</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>

        <div class="container">
            <tiles:insertAttribute name="body" />
        </div>
    </body>
</html>
