<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">

<title>Save Customer</title>
</head>

<body>

	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">

				<h1 class="text-center mb-3">Customer Relationship
					Management</h1>
				<hr>

				<p class="h4 mb-4">Save Customer</p>

				<form action="/customerrelationshipmanagement/save" method="POST">

					<!-- Add hidden form field to handle update -->
					<input type="hidden" name="id" value="${Customer.id}" />

					<div class="form-group">
						<label for="firstName">First Name</label>: <input type="text"
							name="firstName" id="firstName" value="${Customer.firstName}"
							class="form-control" placeholder="FirstName">
					</div>

					<div class="form-group">
						<label for="lastName">Last Name</label>: <input type="text"
							name="lastName" id="lastName" value="${Customer.lastName}"
							class="form-control " placeholder="LastName">
					</div>

					<div class="form-group">
						<label for="email">Email</label>: <input type="text" name="email"
							id="email" value="${Customer.email}" class="form-control"
							placeholder="Email">
					</div>

					<button type="submit" class="btn btn-info col-2">Save</button>

				</form>

				<hr>
				<a href="/customerrelationshipmanagement/list">Back to List
					</a>

			</div>
		</div>
	</div>
</body>

</html>










<






