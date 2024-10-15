<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Login</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<style>
		body {
		
<%
String context = request.getContextPath(); 
%>
     
			background-color: #f1f1f1;
		}
		
        .navbar {
            background-color: #1E90FF;
        }

        .navbar-brand, .navbar-nav .nav-link {
            color: #FFFFFF;
        }
		.form-container {
			background-color: #ffffff;
			border-radius: 10px;
			padding: 20px;
			box-shadow: 0 0 10px rgba(0,0,0,0.3);
		}
		h2 {
			font-weight: bold;
			text-align: center;
			margin-bottom: 30px;
			color: #1E90FF;
		}
		label {
			font-weight: bold;
			color: #1E90FF;
		}
		.btn {
			background-color: #1E90FF;
			border: none;
			border-radius: 5px;
			color: #FFFFFF;
			font-weight: bold;
			text-transform: uppercase;
			padding: 10px;
			margin-top: 20px;
			width: 100%;
			transition: background-color 0.3s ease;
		}
		.btn:hover {
			background-color: #0069d9;
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

<div class="container mt-5">
    <div class="row">
        <div class="col-md-6 offset-md-3">
            <div class="form-container">
                <h2>Login</h2>
                <form action="Adminlogin.do">
                    <c:if test="${requestScope.Err!=null}">
                        <div class="alert alert-danger" role="alert">
                            ${requestScope.Err}
                        </div>
                    </c:if>
                    <div class="form-group">
                        <label for="Email">Email</label>
                        <input type="text" name="Email" class="form-control" id="Email">
                    </div>
                    <div class="form-group">
                        <label for="Password">Password</label>
                        <input type="password" name="Password" class="form-control" id="Password">
                    </div>
                    <div class="form-group">
                        <input type="submit" value="Login" class="btn btn-block">
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

<div class="container mt-5">
    <div class="row">
       <div class="col-md-12">
  <p class="welcome-text">Welcome to our Real Estate Management System. Please login to access your account.</p>
</div>

<style>
  .welcome-text {
    font-size: 24px;
    font-weight: bold;
    color: #1a1a1a;
    text-align: center;
    margin-top: 50px;
  }
</style>

    </div>
</div>
</body>
</html>