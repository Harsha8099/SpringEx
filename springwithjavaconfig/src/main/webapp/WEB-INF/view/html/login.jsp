<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>


<script src="<c:url value='/resources/jquery-1.10.2.min.js'/>"
	type="text/javascript"></script>
<script src="<c:url value='/resources/jquery-ui.js'/>"
	type="text/javascript"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script>
	
</script>
<style>
</style>

<script type="text/javascript">
	$(document).ready(function() {

		/* 			 $("#newUserForm").bind("submit",function(e){
		
		 // will pass the form date using the jQuery serialize function
		 $.post('${pageContext.request.contextPath}/LoginController/Login', $(this).serialize(), function(message) {
		
		
		
		
		 });
		 */

	});
</script>

</head>
<nav class="navbar navbar-default">
<div class="container-fluid" style="background-color: #eee;">
	<div class="navbar-header">
		<a class="navbar-brand" href="#">Brand</a>
	</div>
	<div>
		<ul class="nav navbar-nav navbar-right">
			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown" role="button" aria-haspopup="true"
				aria-expanded="false">Dropdown</a></li>
		</ul>
	</div>
</div>
</nav>


<div class="container">
	<div id="loginbox" style="margin-top: 50px;"
		class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
		<div class="panel panel-info">
			<div class="panel-heading">
				<div class="panel-title">LogIn</div>
				<!--     <div style="float:right; font-size: 80%; position: relative; top:-10px"><a href="#">Forgot password?</a></div> -->
			</div>

			<div style="padding-top: 30px" class="panel-body">

				<div style="display: none" id="login-alert"
					class="alert alert-danger col-sm-12"></div>

				<form:form id="newUserForm" action="/springwithjavaconfig/login1"
					modelAttribute="UserModal">


					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon"><i
							class="glyphicon glyphicon-user"></i></span>

						<form:input placeholder="User Name" class="loginTextbox"
							id="login_id" path="userName" required="required" />

					</div>

					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon"><i
							class="glyphicon glyphicon-lock"></i></span>
						<form:password path="password" id="login-password"
							class="form-control" placeholder="password" required="required" />
					</div>



					<div class="input-group">
						<div class="checkbox">
							<label> <input id="login-remember" type="checkbox"
								name="remember" value="1"> Remember me
							</label>
						</div>
					</div>


					<div style="margin-top: 10px" class="form-group">
						<!-- Button -->

						<div class="col-sm-12 controls">
							<!--                   <a id="btn-login" href="#" class="btn btn-success">Login  </a> -->
							<input type="submit" value="Login" class="btn btn-success">

						</div>
					</div>


				</form:form>



			</div>
		</div>
	</div>
</div>




</div>
</div>

</body>
</html>