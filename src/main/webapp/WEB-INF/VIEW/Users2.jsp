<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@page  isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>UMIS</title>

  <!-- Bootstrap core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="css/simple-sidebar.css" rel="stylesheet">

</head>

<body>

<nav class="navbar navbar-dark bg-dark">
  <a class="navbar-brand ">UMIS</a>
  <!-- <form class="form-inline">
    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
  </form> -->
</nav>


  <div class="d-flex" id="wrapper">

    <!-- Sidebar -->
    <div class="bg-secondary border-right" id="sidebar-wrapper">
      
      <div class="list-group list-group-flush">
        <a href="/viewuniversity" class="list-group-item list-group-item-action bg-secondary text-light">UNIVERSITY</a>
        <a href="/viewcampus" class="list-group-item list-group-item-action bg-secondary text-light">CAMPUS</a>
          <a href="/viewfaculty" class="list-group-item list-group-item-action bg-secondary text-light">FACULTY</a>
        <a href="/viewdeparment" class="list-group-item list-group-item-action bg-secondary text-light">DEPARMENT</a>
        <a href="/viewprogramme" class="list-group-item list-group-item-action bg-secondary text-light">PROGRAMME</a>
         <a href="/viewuser" class="list-group-item list-group-item-action bg-secondary text-light">USERS</a>
        <a href="/login" class="list-group-item list-group-item-action bg-secondary text-light">LOGOUT</a>

      </div>
    </div>
    <!-- /#sidebar-wrapper -->

    <!-- Page Content -->
    <div id="page-content-wrapper">

      <nav class="navbar navbar-expand-lg navbar-light bg-secondary border-bottom">
        <button class="btn btn-primary" id="menu-toggle">Menu</button>

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav ml-auto mt-2 mt-lg-0">
            <!-- <li class="nav-item active">
                <div class="dropdown">
                    <a class="btn btn-secondary dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    
                    </a>

                    
                </div>
            </li>
           -->
           
           <!-- Button trigger modal -->
<button type="button" class="text-warning" >
  <a href="addusers">ADD</a>
</button>
<!-- <button type="button" class="text-warning" >
  <a href="viewuser">VIEW</a>
</button>
 -->

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">

        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>

  </div>
</div>
</div>

          </ul>
        </div>
      </nav>

      <div class="container-fluid">
          <table class="table table-hover table-fixed">
              <tr>

                  <th>User name</th>
                  <th>Telephone</th>
                  <th>Email</th>
                 

              </tr>
              <c:forEach items ="${user}" var="user" >
                  <tr>
                  <td>${user.name}</td>
                      <td>${user.telephone}</td>
                      <td>${user.email}</td>
                    
                      <td>  <button  type="submit"  class="text-warning">  <a href="/editusers?id=${user.id}">EDIT</a> </button> </td>
                      <td>  <button type="submit"  class="text-warning"><a href="/deleteusers?id=${user.id}">DELETE</a> </button> </td>
                  </tr>

              </c:forEach>
          </table>



      </div>
    </div>
    <!-- /#page-content-wrapper -->

  </div>
  <!-- /#wrapper -->

  <!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Menu Toggle Script -->
  <script>
    $("#menu-toggle").click(function(e) {
      e.preventDefault();
      $("#wrapper").toggleClass("toggled");
    });
  </script>

</body>

</html>
