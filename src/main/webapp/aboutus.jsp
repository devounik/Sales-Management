<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>About Us</title>
<!-- Bootstrap CSS -->
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="home.jsp">Port Website</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href="home.jsp">Home</a>
				</li>
				<li class="nav-item active"><a class="nav-link"
					href="aboutus.jsp">About Us</a></li>
				<li class="nav-item"><a class="nav-link" href="login.jsp">Login</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="signup.jsp">Sign
						up</a></li>
			</ul>
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="logout.jsp">Logout</a>
				</li>
			</ul>
		</div>
	</nav>

	<div class="container mt-5">
		<div class="row">
			<div class="col-lg-6">
				<h2>About Our Company</h2>
				<p>
					Welcome to <strong> Netherland Port </strong>, a leading company in
					the industry. We are dedicated to providing exceptional services
					and innovative solutions to our clients. Our commitment to
					excellence has been the cornerstone of our success for over
					[number] years.
				</p>
				<p>Founded in [year], our company has grown to become a trusted
					partner for businesses around the world. Our team of experts is
					passionate about delivering high-quality products and services that
					meet the evolving needs of our customers.</p>
			</div>
			<div class="col-lg-6">
				<img
					src="https://images.unsplash.com/photo-1527314392553-2c7bded21b23?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
					class="img-fluid" alt="Company Image">
			</div>
		</div>
		<div class="row mt-5">
			<div class="col-lg-6">
				<img
					src="https://images.unsplash.com/photo-1527314392553-2c7bded21b23?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
					class="img-fluid" alt="Port Image">
			</div>
			<div class="col-lg-6">
				<h2>About Our Port</h2>
				<p>The port is a vital hub for international trade and
					logistics. Located in [location], it serves as a gateway for goods
					and services to and from [region]. Our state-of-the-art facilities
					and strategic location ensure efficient and effective handling of
					cargo, making us a preferred choice for businesses looking to
					optimize their supply chain operations.</p>
				<p>With a focus on sustainability and innovation, we
					continuously invest in infrastructure and technology to enhance our
					capabilities and provide superior service to our clients.</p>
			</div>
		</div>
	</div>

	<!-- jQuery and Bootstrap Bundle (includes Popper) -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
