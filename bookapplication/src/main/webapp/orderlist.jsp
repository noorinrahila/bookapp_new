<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Management System</title>
</head>
<body bgcolor="#33FF00">

	

		<br> <br> <br>
		<h1 style="color: #CC0099; font-size: 30px">BOOK MANAGEMENT
			SYSTEM</h1>
		<h1 style="color: #CC0099; font-size: 40px">ORDERS LIST</h1>



		<form>
			<table
				style="color: #00FF33; border-color: #FF0099; background-color: #CC0099;"
				border="1">
				<thead>
					<tr>
						<th style="font-size: 30px">Id</th>
						<th style="font-size: 30px">ItemName</th>
						<th style="font-size: 30px">Quantity</th>
						<th style="font-size: 30px">TotalCost</th>
					</tr>
				</thead>
				<tbody>
					

						<c:forEach items="${MY_CART.orderItems}" var="orderItem" varStatus="id">
						<tr><td>${id.index+1}</td>

							<td>${orderItem.book.name}</td>
							<td>${orderItem.quantity}</td>
							<td>Rs.${orderItem.quantity*orderItem.book.price}</td>
							<td><a href="/order/remove?id=${id.index}">Remove</a></td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</form>
					<a href="/books/list">Continue Shopping</a>
					
					<div class="col-md-4a">
						<b>Price Details</b>

					
						<c:set var="total_amount" value="0" />
						<c:forEach items="${MY_CART.orderItems}" var="orderItem">
							<c:set var="total_amount"
								value="${total_amount + orderItem.book.price*orderItem.quantity}" />
						</c:forEach>

						<form name="orderForm" action="../order/save" method="post">
							<input type="hidden" name="total_amount" value="${total_amount}" />
							<table border="1" >

								<tbody>
									<tr>
										<td>Price ( ${no_of_items != null ?no_of_items:0} items )</td>
										<td>Rs. ${total_amount}</td>
									</tr>
									<tr>
										<td>Delivery Charges</td>
										<td>FREE</td>
									</tr>
									<tr>
										<th><b>Amount Payable </b></th>
										<th><b>Rs. ${total_amount}</b></th>
									</tr>
									<tr>
										<td colspan="2" align="center">
										
										<button type="submit" 
											class="btn btn-success btn-block" >Place an Order</button></td>
									</tr>
								</tbody>
							</table>
						</form>
					</div>
	
	</CENTER>
</body>
</html>
