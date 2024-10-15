<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>HOME</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
      
<%
String context = request.getContextPath(); 
%>
         
            background-color: #f5f5f5;
        }

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

        /* new style for links */
        .link {
            display: inline-block;
            padding: 10px 20px;
            background-color: #1E90FF;
            border-radius: 5px;
            color: #FFFFFF;
            font-weight: bold;
            text-transform: uppercase;
            text-decoration: none;
            margin-right: 10px;
        }

        .link:hover {
            background-color: #0066CC;
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
                    <a href="<%=request.getContextPath()%>/pages/index.jsp" class="nav-link">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link">About Us</a>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link">Help</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<p style="font-size: 24px; font-weight: bold; color: #1E90FF; text-align: center;">Successfully Logged in</p>
<div style="text-align: center;">
  <p style="font-size: 18px; color: #1E90FF;">Ready to register your site?</p>
  <a href="<%=context%>/pages/SiteRegistration.jsp" style="font-size: 18px; color: #FFFFFF; background-color: #1E90FF; padding: 10px 20px; border-radius: 5px; text-decoration: none;">Click here</a>
</div>

</body>
</html>
