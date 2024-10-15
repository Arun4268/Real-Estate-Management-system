<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ page import ="com.keane.training.domain.Booking"%>
<%@ page import ="java.util.List"%>
<%@ page import ="java.util.ArrayList"%>

<html>
    <head>
    <title> Booking List </title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css">
    <script src="https://code.jquery.com/jquery-1.12.3.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>

    <script>
        $(document).ready(function(){
            $('#tbl_booking').dataTable();
        });
    </script>
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

 <div class="table-responsive">
        <table id="tbl_booking" class="display table">
            <thead>
                <tr>
                    <th>bid</th>
                    <th>pid</th>
                    <th>booking_date</th>
                    <th>pay_mode</th>
                    <th>buyid</th>
                   
                </tr>
            </thead>
            <tbody>
                   
             <% for(Booking emp:(ArrayList<Booking>)request.getAttribute("booking")) { %>
                <tr>
                    <td><%=emp.getBid() %></td>
                    <td><%=emp.getPrid() %></td>
                    <td><%=emp.getBooking_date() %></td>
                    <td><%=emp.getPay_mode() %></td>
                    <td><%=emp.getBuyid() %></td>
                  
                </tr>
                <% } %>
            </tbody>
        </table>
    </div>  
    
    
</body>
</html>