<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.ecommerce.entity.EProductEntity" %>
<%@ page import="java.util.*" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List Products</title>
</head>
<body>
       <%
        List<EProductEntity> productList = (List<EProductEntity>) request.getAttribute("list");
        for (EProductEntity product : productList) {
            out.println(product.getName() + ", " + product.getPrice() + ", " + product.getDateAdded() + "<br>");
        }
    %>
</body>
</html>
