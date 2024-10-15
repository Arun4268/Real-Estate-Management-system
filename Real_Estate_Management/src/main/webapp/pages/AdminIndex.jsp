<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<title>Choose</title>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Choose</title>
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

<br>
<a href="<%=context%>\pages\AdminRegister.jsp"   class="btn btn-primary">New User? Click here</a> <br>
 
 <br>
<a href="<%=context%>\pages\AdminLogin.jsp"class="btn btn-primary">Existing User? Click here</a> <br>
 


</body>
</html>

 