<%--
  Created by IntelliJ IDEA.
  User: Hoang Viet
  Date: 22/01/2021
  Time: 3:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CaseStudy Management Resort</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
          integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/navbar.css" type="text/css">
</head>
<body>

<header class="navbar navbar-dark bg-success">
    <!-- Navbar content -->
    <a href="#" class="navbar-brand">
        <!-- Logo Image -->
        <img src="img/logo.png" style="width: 40%">
    </a>
    <button type="button" name="login" id="button_login" class="btn btn-outline-secondary bg-light color-black">
        Login
    </button>
</header>
<nav class="navbar sticky-top navbar-expand-lg navbar-light bg-light"  id="navbarNav">
    <div class="collapse navbar-collapse">
        <ul class="navbar-nav d-flex">
            <li class="nav-item active p-1">
                <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item active p-1">
                <a class="nav-link" href="employees">Employees</a>
            </li>
            <li class="nav-item active p-1">
                <a class="nav-link" href="customers">Customers</a>
            </li>
            <li class="nav-item active p-1">
                <a class="nav-link" href="services">Services</a>
            </li>
            <li class="nav-item active p-1">
                <a class="nav-link" href="contact">Contact</a>
            </li>
            <li class="nav-item active p-1">
                <form class="form-inline">
                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </form>
            </li>
        </ul>
    </div>
</nav>
<div class="container-fluid d-flex row">
    <div class="left-container col-4 p-4">
        <div class="list-group">
            <a class="list-group-item" href="#">Dapibus ac facilisis in</a>
            <a class="list-group-item " href="#">This is a primary list group item</a>
            <a class="list-group-item " href="#">This is a secondary list group item</a>
            <a class="list-group-item " href="#">This is a success list group item</a>
            <a class="list-group-item " href="#">This is a danger list group item</a>
            <a class="list-group-item " href="#">This is a warning list group item</a>
            <a class="list-group-item " href="#">This is a info list group item</a>
            <a class="list-group-item " href="#">This is a light list group item</a>
            <a class="list-group-item " href="#">This is a dark list group item</a>
        </div>
    </div>
    <div class="right-container col-8 p-8">
        Body
    </div>
</div>
<div class="footer">

</div>
</body>
</html>
