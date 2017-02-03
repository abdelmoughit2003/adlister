<%--
  Created by IntelliJ IDEA.
  User: abdelmoughit
  Date: 2/3/2017
  Time: 10:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create a new ad</title>
</head>
<body>
<form action="/ads/create" method="post">
    <label>Title</label>
    <input type="text" name="title">
    <label>Description</label>
    <textarea name="description"></textarea>
    <input type="submit" name="create" value="Create ad">
</form>
</body>
</html>