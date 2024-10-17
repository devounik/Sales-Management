<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Sales Management</title>
  <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
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
      <li class="nav-item">
        <a class="nav-link" href="deletesalesdata.jsp">Delete Sales Data</a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="readsales.jsp">View Sales Data</a>
      </li>
    </ul>
   
    <form class="form-inline my-2 my-lg-0">
      <button class="btn btn-outline-danger my-2 my-sm-0" type="submit"><a href="home.jsp">Logout</a></button>
    </form>
   
  </div>
</nav>

<div class="container">
  <!-- Your content here -->
   <h1>Sales Page</h1>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
