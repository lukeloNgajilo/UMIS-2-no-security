<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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


 <style type='text/css'>
        label{

            font-size: 9px;

        }


    </style>








</head>

<body>
  
<nav class="navbar navbar-dark bg-dark">
  <a class="navbar-brand ">UMIS</a>
<!--   <form class="form-inline">
    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
  </form> -->
</nav>



  <div class="d-flex" id="wrapper">

    <!-- Sidebar -->
    <div class= "bg-secondary border-right" id="sidebar-wrapper">
      
      <div class="list-group list-group-flush">
        <a href="/university" class="list-group-item list-group-item-action bg-secondary text-light">UNIVERSITY</a>
          <a href="/campus" class="list-group-item list-group-item-action bg-secondary text-light">CAMPUS</a>
          <a href="/faculty" class="list-group-item list-group-item-action bg-secondary text-light">FACULTY</a>
          <a href="/deparment" class="list-group-item list-group-item-action bg-secondary text-light">DEPARMENT</a>
        <a href="/programme" class="list-group-item list-group-item-action bg-secondary text-light">PROGRAMME</a>
          <a href="/users" class="list-group-item list-group-item-action bg-secondary text-light">USERS</a>
     <!--    <a href="/changepassword" class="list-group-item list-group-item-action bg-secondary text-light">CHANGE PASSWORD</a> -->
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
            <li class="nav-item active">
              <a class="nav-link" href="#"><span class="sr-only">(current)</span></a>
            </li>
          
           
<!--            Button trigger modal
<button type="button" class="text-warning" >
  ADD
</button> -->

              <button type="button" class="text-warning">
                 <a href="/viewfaculty">VIEW</a>
              </button>
<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header bg-secondary">
        <h5 class="modal-title " id="exampleModalLabel"> FACULTY DETAILS</h5>
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

          <div class="">
              <form class="form-horizontal" role="form" action="/savefaculty">
                  <div class="form-group">
                      <div class="col-sm-12">
                            <label>UNIVERSITY NAME</label>
                              <select class="browser-default custom-select custom-select-lg mb-3" name="university">
                              <c:forEach items ="${university}" var="university">
                                  <option value="${university.id}">${university.uname}</option>
                              </c:forEach>
                          </select>
                      </div>
                  </div>

                  <div class="form-group">
                      <div class="col-sm-12">
                                <label>CAMPUS NAME</label>
                              <select class="browser-default custom-select custom-select-lg mb-3" name="campus">
                              
                              <c:forEach items ="${campus}" var="campus">
                                  <option value="${campus.id}">${campus.CName}</option>
                              </c:forEach>
                          </select>
                      </div>
                  </div>
                  <div class="form-group">
                      <div class="col-sm-12">
                      <label>FACULTY NAME</label>
                          <input type="text" class="form-control" name="fname" placeholder="FacultyName" value="${a}" required="this" />
                      </div>
                  </div>

                  <div class="form-group">
                      <div class="col-sm-12">
                      <labeL> CODE</label>
                      
                          <input type="text" class="form-control" name="code" placeholder="code" value="${faculty.code}" required="this" />
                      </div>
                  </div>

               
                  <div class=" ">

                      <button type="submit" class="btn btn-primary">Save changes</button>

                  </div>

              </form>


          </div>
      </div>
    </div>
  </div>













































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
