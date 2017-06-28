<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List All Orders</title>
<style>
</style>
</head>
<body>
	<%@ include file="../../layout/header.jsp"%>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="panel panel-default">
					<div class="panel-heading">
						<strong><i class="fa fa-list"></i> All Orders</strong>
					</div>
					<div class="panel-body">
						<table id="ordersTbl" border="1"
							class="table table-striped table-bordered">
							<thead>
								<tr>
									<th width="10%">Order Id</th>
									<th>Customer Name</th>
									<th>Items</th>
									<th>Order Amount</th>
									<th>Status</th>
									<th>Ordered Date</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${ORDERS_LIST}" var="order">
									<tr>
										<td>${order.id}</td>
										<td>${order.user.name}</td>
										<td>
											<ul>
												<c:forEach items="${order.orderItems}" var="item">
													<li>${item.book.name}(Quantity-${item.quantity})</li>
												</c:forEach>
											</ul>
										</td>
										<td>Rs. ${order.totalPrice}</td>
										<td>${order.status}</td>
										<td>${order.orderedDate }</td>


										<c:if
											test="${order.status !='CANCELLED' && order.status != 'DELIVERED'}">
											<td><a
												href="../orders/updateStatus?id=${order.id}&status=DELIVERED"
												class="btn btn-success btn-sm">Deliver Order </a></td>
										</c:if>
										<c:if test="${order.status == 'ORDERED'}">
											<td><a
												href="../orders/updateStatus?id=${order.id}&status=CANCELLED"
												class="btn btn-danger btn-sm">Cancel Order </a></td>
										</c:if>
									</tr>

								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>

			</div>
		</div>
	</div>
	<script>
		$(document).ready(function() {
			$("#ordersTbl").DataTable();
		});
	</script>
</body>
</html>