<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: sim
  Date: 1/31/17
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        .color{
            background-color: aqua;
        }
    </style>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Welcome to my site!" />
    </jsp:include>
</head>
<body>
<jsp:include page="/partials/navbar.jsp" />
<div class="container">
    <table class="table table-bordered">
        <thead>
        <td class ="color">Id</td>
        <td class ="color">UserId</td>
        <td class ="color">Title</td>
        <td class ="color">Description</td>
        <c:forEach  var="ads" items="${ads}">
            <tr>
                <td>${ads.id}</td>
                <td>${ads.userId}</td>
                <td>${ads.title}</td>
                <td>${ads.description}</td>
            </tr>
        </c:forEach>
        </thead>
    </table>
</div>
</body>
</html>
