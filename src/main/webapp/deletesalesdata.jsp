<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Delete Sales Data</title>
  <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/sweetalert2@10"></script>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="sales.jsp">Sales Management</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item">
        <a class="nav-link" href="addsalesdata.jsp">Add Sales Data</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="updatesalesdata.jsp">Update Sales Data</a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="deletesalesdata.jsp">Delete Sales Data</a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="readsales.jsp">View Sales Data</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0" action="home.jsp" method="POST">
      <button class="btn btn-outline-danger my-2 my-sm-0" type="submit" >Logout</button>
    </form>
  </div>
</nav>

<div class="container mt-4">
  <h2>Delete Sales Data</h2>
  <form action="deleteSalesController" method="POST" onsubmit="return confirm('Are you sure you want to delete this sales record?')">
    <div class="form-group">
      <label for="salesID">Sales ID</label>
      <input type="number" class="form-control" id="salesID" name="salesID" placeholder="Enter Sales ID" required>
    </div>
    <button type="submit" class="btn btn-danger">Delete</button>
  </form>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<%
    String successMessage = (String) request.getAttribute("successMessage");
    if (successMessage != null) {
%>
<script>
    Swal.fire({
        icon: 'success',
        title: '<%= successMessage %>',
        showConfirmButton: false,
        timer: 3000
    });
</script>
<%
    }
    String errorMessage = (String) request.getAttribute("errorMessage");
    if (errorMessage != null) {
%>
<script>
    Swal.fire({
        icon: 'error',
        title: '<%= errorMessage %>',
        showConfirmButton: false,
        timer: 3000
    });
</script>
<%
    }
%>

</body>
</html>
