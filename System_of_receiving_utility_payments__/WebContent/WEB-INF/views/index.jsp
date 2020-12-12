<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>System of receiving utility payments</title>
</head>
<body>
<div align="center">
    <h2>System of receiving utility payments</h2>
    <form method="get" action="search">
        <input type="text" name="keyword" />  
        <input type="submit" value="Search" />
    </form>
    <h3><a href="/new">New Service</a></h3>
    <table border="1" cellpadding="5">
        <tr>
            <th>ServiceId</th>
            <th>ServiceName</th>
            <th>Client</th>
            <th>Payment</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${listService}" var="service">
        <tr>
            <td>${service.service_id}</td>
            <td>${service.service_name}</td>
            <td>${service.client}</td>
            <td>${service.payment}</td>
            <td>
                <a href="/edit?service_id=${service.service_id}">Edit</a>
                   
                <a href="/delete?service_id=${service.service_id}">Delete</a>
            </td>
        </tr>
        </c:forEach>
    </table>
</div>   
</body>
</html>