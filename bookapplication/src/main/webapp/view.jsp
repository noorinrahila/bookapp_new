<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="../order/orderlist" method="post">

		<input type="hidden" name="book_id" value="${BOOK_ORDER.id}" />
		<table>
			<tr>
				<th>Book Name</th>
				<th>Price</th>
				<th>Quantity</th>
			</tr>
			<tr>

				<td>${BOOK_ORDER.name}</td>

				<td>Rs. ${BOOK_ORDER.price}</td>
				<td><input type="number" name="qty" min="1" value="1" required /></td>

				<c:if test="${!empty LOGGED_IN_USER}">
					<td><button type="submit" class="btn btn-primary">Add
							To Cart</button></td>
				</c:if>
				<c:if test="${empty LOGGED_IN_USER}">
					<td><button type="submit" class="btn btn-primary">Add
							To Cart</button></td>
				</c:if>




			</tr>
		</table>
	</form>
</body>
</html>