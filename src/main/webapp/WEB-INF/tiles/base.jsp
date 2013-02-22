<%@ page import="com.blogspot.symfonyworld.lyricsbase.*" contentType="text/html" pageEncoding="UTF-8" %>
<%@ include file="include.jsp" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title><tiles:insertAttribute name="title" /></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <link rel="Shortcut icon" href="${pageContext.request.contextPath}/resources/img/favicon32.png" />

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap-responsive.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/lyricsBase.css">

  </head>
  <body>

    <!-- NAVBAR
    ================================================== -->
    <div class="navbar-wrapper">
      <!-- Wrap the .navbar in .container to center it within the absolutely positioned parent. -->
      <div class="container">

        <div class="navbar navbar-inverse">
          <div class="navbar-inner">
            <!-- Responsive Navbar Part 1: Button for triggering responsive navbar (not covered in tutorial). Include responsive CSS to utilize. -->
            <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="brand" href="${pageContext.request.contextPath}">lyricsBase</a>
            <!-- Responsive Navbar Part 2: Place all navbar contents you want collapsed withing .navbar-collapse.collapse. -->
            <div class="nav-collapse collapse">
              <ul class="nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="${pageContext.request.contextPath}/static/about.html">About</a></li>
                <!-- Read about Bootstrap dropdowns at http://twitter.github.com/bootstrap/javascript.html#dropdowns -->
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
                  <ul class="dropdown-menu">
                    <li><a href="#">Action</a></li>
                    <li><a href="#">Another action</a></li>
                    <li><a href="#">Something else here</a></li>
                    <li class="divider"></li>
                    <li class="nav-header">Nav header</li>
                    <li><a href="#">Separated link</a></li>
                    <li><a href="#">One more separated link</a></li>
                  </ul>
                </li>
              </ul>
            </div><!--/.nav-collapse -->
          </div><!-- /.navbar-inner -->
        </div><!-- /.navbar -->

      </div> <!-- /.container -->
    </div><!-- /.navbar-wrapper -->



    <!-- Carousel
    ================================================== -->
    <div id="myCarousel" class="carousel slide">
      <div class="carousel-inner">
        <div class="item active">
          <img src="${pageContext.request.contextPath}/resources/img/examples/slide-01.jpg" alt="">
          <div class="container">
            <div class="carousel-caption">
              <h1>Example headline.</h1>
              <p class="lead">Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
              <a class="btn btn-large btn-primary" href="#">Sign up today</a>
            </div>
          </div>
        </div>
        <div class="item">
          <img src="${pageContext.request.contextPath}/resources/img/examples/slide-02.jpg" alt="">
          <div class="container">
            <div class="carousel-caption">
              <h1>Another example headline.</h1>
              <p class="lead">Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
              <a class="btn btn-large btn-primary" href="#">Learn more</a>
            </div>
          </div>
        </div>
        <div class="item">
          <img src="${pageContext.request.contextPath}/resources/img/examples/slide-03.jpg" alt="">
          <div class="container">
            <div class="carousel-caption">
              <h1>One more for good measure.</h1>
              <p class="lead">Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
              <a class="btn btn-large btn-primary" href="#">Browse gallery</a>
            </div>
          </div>
        </div>
      </div>
      <a class="left carousel-control" href="#myCarousel" data-slide="prev">&lsaquo;</a>
      <a class="right carousel-control" href="#myCarousel" data-slide="next">&rsaquo;</a>
    </div><!-- /.carousel -->

    <!-- Marketing messaging and featurettes
    ================================================== -->
    <!-- Wrap the rest of the page in another container to center all the content. -->

    <div class="container marketing">

        <div class="container">
            <tiles:insertAttribute name="body" />
        </div>

      <!-- FOOTER -->
      <footer>
        <p class="pull-right"><a href="#">Back to top</a></p>
        <p>&copy; 2013 tkoomzaaskz, Inc. &middot; <a href="http://symfony-world.blogspot.com/">symfony-world</a> &middot; <a href="https://github.com/tkoomzaaskz">github</a></p>
      </footer>

    </div><!-- /.container -->



    <!-- Placed at the end of the document so the pages load faster -->
    <script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
    <script src="http://code.jquery.com/ui/1.10.1/jquery-ui.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/sortable.js" type="text/javascript"></script>    <script src="${pageContext.request.contextPath}/resources/js/bootstrap-transition.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap-alert.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap-modal.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap-dropdown.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap-scrollspy.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap-tab.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap-tooltip.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap-popover.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap-button.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap-collapse.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap-carousel.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap-typeahead.js"></script>
    <script>
      !function ($) {
        $(function(){
          // carousel demo
          $('#myCarousel').carousel()
        })
      }(window.jQuery)
    </script>
    <script src="${pageContext.request.contextPath}/resources/js/holder/holder.js"></script>
  </body>
</html>
