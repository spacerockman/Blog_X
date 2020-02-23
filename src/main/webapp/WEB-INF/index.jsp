<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>

<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="<%=basePath%>/lib/bootstrap.min.css"/>
    <link rel="stylesheet" href="<%=basePath%>/lib/index.css"/>


    <script src="<%=basePath%>/lib/jquery-3.3.1.min.js"></script>
    <script src="<%=basePath%>/lib/index.js"></script>
    <script src="<%=basePath%>/lib/bootstrap.min.js"></script>

    <title>首页</title>
<html>
<body>
<%--bar的上面自我简介--%>
<div>
    <h1 class="text-warning" >Joey_博客</h1>
    <h4 class="col-md-offset-2">-- 关注技术移民政策动向，探讨华人移民热点问题</h4>
</div>

<%--bar--%>
<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#"></a>
            <%--<a class="navbar-brand active" href="#" id="">首页</a>--%>
        </div>

       <div>
            <ul class="nav navbar-nav" id="topbar">
                <c:forEach var="i" items="${indexBars}">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <c:if test="${i.id == 1}">
                               <li href="#" class="navbar-brand active"><c:out value="${i.listName}"></c:out> <b class="caret"></b></li>
                            </c:if>
                            <c:if test="${i.id > 1}">
                               <li href="#" class="navbar-brand"><c:out value="${i.listName}"></c:out> <b class="caret"></b>
                                   <ul class="dropdown-menu" >
                                       <c:if test="${i.id == 3}"> <%--id=3的时候为日本的bar--%>
                                           <c:forEach var="j" items="${jTitles}">
                                                <c:choose>
                                                    <c:when test="${j.id == 1}">
                                                        <li><a href="<%=basePath%>/japan/${j.urlName}.do"> <c:out value="${j.title}"></c:out></a></li>
                                                    </c:when>
                                                    <c:when test="${j.id == 2}">
                                                        <li><a href="<%=basePath%>/japan/${j.urlName}.do"> <c:out value="${j.title}"></c:out></a></li>
                                                    </c:when>
                                                    <c:when test="${j.id == 3}">
                                                        <li><a href="<%=basePath%>/japan/${j.urlName}.do"> <c:out value="${j.title}"></c:out></a></li>
                                                    </c:when>
                                                </c:choose>
                                           </c:forEach>
                                       </c:if>
                                   </ul>
                               </li>
                            </c:if>
                        </a>
                    </li>
                </c:forEach>
            </ul>
        </div>
    </div>
</nav>

<%--轮播信息--%>
<div class="whole-body">
    <div class="body-carousel">
        <div id="myCarousel" class="carousel slide">

            <!-- 轮播（Carousel）指标 -->

            <ol class="carousel-indicators">

                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>

                <li data-target="#myCarousel" data-slide-to="1"></li>

                <li data-target="#myCarousel" data-slide-to="2"></li>

            </ol>

            <!-- 轮播（Carousel）项目 -->

            <div class="carousel-inner">

                <div class="item active">

                    <img src="https://static.runoob.com/images/mix/img_fjords_wide.jpg" alt="First slide">

                </div>

                <div class="item">

                    <img src="https://static.runoob.com/images/mix/img_nature_wide.jpg" alt="Second slide">

                </div>

                <div class="item">

                    <img src="https://static.runoob.com/images/mix/img_mountains_wide.jpg" alt="Third slide">

                </div>

            </div>

            <!-- 轮播（Carousel）导航 -->

            <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">

                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>

                <span class="sr-only">Previous</span>

            </a>

            <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">

                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>

                <span class="sr-only">Next</span>

            </a>

        </div>
    </div>

<div class="question-body">
    <div class="question-body-inside">
        <div class="question-body-inside-top-part">
            <div class="question-body-inside-question-title">自助移民随时帮 - 有问必答 Q&amp;A</div>
            <div class="question-body-inside-button"><button type="button" class="btn btn-danger glyphicon glyphicon-pencil">提一个问题</button></div>
        </div>
        <div class="quest-div">
            <c:forEach var="i" items="${questions}">
                        <div class="active"><a href="#"><c:out value="${i.title}"></c:out></a></div>
            </c:forEach>
        </div>
        <div>more</div>
    </div>
</div>

</div>

</body>
</html>
