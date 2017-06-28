package com.book.bookapplication.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	
	@Column(name = "total_price")
	private Integer totalPrice;

	@Column(name = "status")
	private String status;
	
	@OneToMany(mappedBy = "order", fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	private List<OrderItem> orderItems = new ArrayList<>();
	
	@Column (name="ordered_date")	
	private LocalDateTime ordered_date;
	
	@Column (name="cancelled_date")
	private LocalDate cancelled_date;
	
	@Column (name="delivered_date")
	private LocalDate delivered_date;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public LocalDateTime getOrdered_date() {
		return ordered_date;
	}

	public void setOrdered_date(LocalDateTime ordered_date) {
		this.ordered_date = ordered_date;
	}

	public LocalDate getCancelled_date() {
		return cancelled_date;
	}

	public void setCancelled_date(LocalDate cancelled_date) {
		this.cancelled_date = cancelled_date;
	}

	public LocalDate getDelivered_date() {
		return delivered_date;
	}

	public void setDelivered_date(LocalDate delivered_date) {
		this.delivered_date = delivered_date;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", user=" + user + ", totalPrice=" + totalPrice + ", status=" + status
				+ ", orderItems=" + orderItems + ", ordered_date=" + ordered_date + ", cancelled_date=" + cancelled_date
				+ ", delivered_date=" + delivered_date + "]";
	}
	
}
