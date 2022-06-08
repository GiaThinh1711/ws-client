<%@ page import="java.util.List" %>
<%@ page import="com.example.wsclient.enity.Product" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/8/2022
  Time: 10:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%
    List<Product> products = (List<Product>) request.getAttribute("products");
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Product</title>
</head>
<body>
    <h1>List Product</h1>
<ul>
    <%for (Product product : products) { %>
        <li><%=product.getId()%> <%=product.getId()%></li>
    <%}%>
</ul>
</body>
</html>
