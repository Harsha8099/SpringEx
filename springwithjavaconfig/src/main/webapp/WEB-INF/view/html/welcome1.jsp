<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<head>
<%@ page isELIgnored="false"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
	<table class="table">
		<thead>
			<th>EMAIL_ADDRESS</th>
			<th>USERNAME</th>
			<th>FIRST_NAME</th>
		</thead>
		<tbody>
			
			<tr>
			
			<c:forEach items="${list}" var="item">
    			<td><c:out value="${item.emailAddress}"/></td> 
				<td><c:out value="${item.userName}"/></td>
				<td><c:out value="${item.firstName}"/></td>
			</c:forEach>
			
				
			</tr>
		</tbody>
	</table>
</body>
</html>