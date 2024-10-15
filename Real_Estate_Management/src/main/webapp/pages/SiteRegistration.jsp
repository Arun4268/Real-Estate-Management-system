<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>site register</title>
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
<h2 align="center">Register</h2>

<form action="SiteRegister.do">    


<table>
	<tr>
		<td colspan="2"><c:if test="${requestScope.Err!=null}">
			<font color="red">${requestScope.Err}</font>
		</c:if></td>
	</tr>
	<tr>
		<td>pid</td>
		<td><input type="text" name="pid"></td>
	</tr>
	<tr>
		<td>sid</td>
		<td><input type="text" name="sid"></td>
	</tr>
	<tr>
		<td>Location</td>
		<td><input type="text" name="location"></td>
	</tr>
	<tr>
		<td>property_type</td>
		<td><input type="text" name="property_type"></td>
	</tr>
	<tr>
		<td>Budget</td>
		<td><input type="text" name="budget"></td>
	</tr>
	<tr>
		<td>Availability</td>
		<td><input type="text" name="Availability"></td>
	</tr>
	<tr>
		<td colspan="2" align="center"><input type="submit"
			value="Register"></td>
	</tr>
</table>
</form>
</body>
</html>