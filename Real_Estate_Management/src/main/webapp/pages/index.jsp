<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    
    <title>HOME</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {

<%
String context = request.getContextPath(); 
%>
            margin: 0;
            padding: 0;
            background-image: url('<%=context%>/images/res.jpg');
            background-size: cover;
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

        .btn:hover {
            background-color: #1873CC;
        }

        .btn-seller {
            background-color: #FFA500;
        }

        .btn-buyer {
            background-color: #00FF00;
        }

        .btn-admin {
            background-color: #FF0000;
        }

        .btn-text {
            margin-top: 20px;
            font-size: 20px;
            color: #FFFFFF;
            text-align: center;
        }
    </style>
</head>
<body>
<nav class="navbar ">
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

   <div class="btn-text" style="font-size: 24px; font-weight: bold; text-align: center; color: #1E90FF;">
    Choose a Role
</div>

    <div class="container-fluid">
        <div class="row justify-content-center">
            <div class="col-sm-12 col-md-4 text-center">
                <a href="<%=context%>/pages/SellerIndex.jsp" class="btn btn-seller">Seller</a>
            </div>
            <div class="col-sm-12 col-md-4 text-center">
                <a href="<%=context%>/pages/BuyerIndex.jsp" class="btn btn-buyer">Buyer</a>
            </div>
            <div class="col-sm-12 col-md-4 text-center">
                <a href="<%=context%>/pages/AdminIndex.jsp" class="btn btn-admin">Admin</a>
            </div>
        </div>
    </div>


</body>
</html>
