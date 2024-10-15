<%@page import="com.keane.training.domain.Buyer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>success</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {

<%
String context = request.getContextPath(); 
%>
        .navbar {
            background-color: #1E90FF;
        }

        .navbar-brand, .navbar-nav .nav-link {
            color: #FFFFFF;
        }

        .btn {
            margin-top: 20px;
            padding: 10px;
            background-color: #1E90FF;
            border: none;
            border-radius: 5px;
            color: #FFFFFF;
            font-weight: bold;
            text-transform: uppercase;
        }



    </style>
</head>
<body>


<nav class="navbar navbar-expand-lg navbar-light">
    <div class="container">
        <a class="navbar-brand" href="#">Real Estate Management System</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavDropdown">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item active">
                    <a href="<%=context%>/pages/index.jsp"  class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">About Us</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Help</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<h2>deal Success  </h2>
<h3>Please note deal id for reference ${requestScope.details.dealid }</h3>
</body>
</html>
