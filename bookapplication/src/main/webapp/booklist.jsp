<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Management System</title>
</head>
<body>
	




		<table
			
			border="1">
			<thead>
				<tr>
					<th style="font-size: 30px">Id</th>
					<th style="font-size: 30px">Name</th>
					<th style="font-size: 30px">Price</th>
					<th style="font-size: 30px">ReleasedDate</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${BOOK_LIST}" var="book">
					<tr>
						<td>${book.id}</td>
						<td>${book.name}</td>
						<td>${book.price}</td>
						<td>${book.released_date}</td>
						<td><a href="../books/${book.id}">View</a>
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
	
</body>
</html>