<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <!-- Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom CSS -->
    <style>
        .error-message {
            color: red;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="home.jsp">Port Website</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="home.jsp">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="aboutus.jsp">About Us</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="login.jsp">Login</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="signup.jsp">Sign up</a>
            </li>
        </ul>
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="logout.jsp">Logout</a>
            </li>
        </ul>
    </div>
</nav>
<div class="container">
    <h2 class="mt-5">Login</h2>
    <form id="loginForm" action="loginServlet" method="post" onsubmit="return validateForm()">
        <div class="form-group">
            <label for="userid">User ID:</label>
            <input type="text" class="form-control" id="userid" name="userid" required>
            <span id="useridError" class="error-message"></span>
        </div>
        <div class="form-group">
            <label for="password">Password:</label>
            <input type="password" class="form-control" id="password" name="password" required>
            <span id="passwordError" class="error-message"></span>
        </div>
        <button type="submit" class="btn btn-primary">Login</button>
    </form>
    <div class="mt-3">
        <p>Don't have an account? <a href="signup.jsp">Sign up now</a>.</p>
    </div>
</div>

<!-- Bootstrap and jQuery JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<!-- JavaScript Validation -->
<script>
    function validateForm() {
        var userid = document.getElementById('userid').value;
        var password = document.getElementById('password').value;
        var useridError = document.getElementById('useridError');
        var passwordError = document.getElementById('passwordError');
        var isValid = true;

        // Reset error messages
        useridError.innerHTML = '';
        passwordError.innerHTML = '';

        // Validate userid
        if (userid.trim() === '') {
            useridError.innerHTML = 'User ID is required';
            isValid = false;
        }

        // Validate password
        if (password.trim() === '') {
            passwordError.innerHTML = 'Password is required';
            isValid = false;
        }

        return isValid;
    }
</script>
</body>
</html>
