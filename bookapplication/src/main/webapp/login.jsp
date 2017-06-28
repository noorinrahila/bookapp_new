<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="index.css" rel="stylesheet" />
<title>Insert title here</title>
</head>
<body>
<form action ="users/validate" method="post">
<table border="1">
			<tbody>
			
				<tr>
					<th>Email</th>
					<td><input type="email" name="email" required="required" /></td>
				</tr>
				<tr>
					<th>Password</th>
					<td><input type="password" name="password" required="required" />
					</td>
				</tr>
			</tbody>

			<tr>
				<td>
					<button type="submit">login</button>
				</td>
			</tr>
		</table>
		</form>

</body>
</html>