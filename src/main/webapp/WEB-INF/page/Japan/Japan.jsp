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
</head>
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
            <a class="navbar-brand" href="#" id="">首页</a>
        </div>
        <div>
            <ul class="nav navbar-nav">
                <c:forEach var="i" items="${indexBars}">
                    <c:choose>
                        <c:when test="${i.id == 1}">
                            <li hidden="hidden"></li>
                        </c:when>
                        <c:otherwise>
                            <li class="topbar"><a href="#"><c:out value="${i.listName}"></c:out></a></li>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
            </ul>
        </div>
    </div>
</nav>

<%--Life in Japan--%>
<div>

</div>

</body>
</html>
