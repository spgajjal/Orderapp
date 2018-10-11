package com.capgemini.orderapp.entity;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
  

@Document(collection= "orderTable")
public class Order {
        @Id
		private int orderId;
		private float orderTotal;
		private LocalDate orderDate;
		private int customerId;
		private String Status;
		private List<LineItem> item;
		public Order() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Order(int orderId, float orderTotal, LocalDate orderDate, int customerId, String status,
				List<LineItem> item) {
			super();
			this.orderId = orderId;
			this.orderTotal = orderTotal;
			this.orderDate = orderDate;
			this.customerId = customerId;
			Status = status;
			this.item = item;
		}
		public int getOrderId() {
			return orderId;
		}
		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}
		public float getOrderTotal() {
			return orderTotal;
		}
		public void setOrderTotal(float orderTotal) {
			this.orderTotal = orderTotal;
		}
		public LocalDate getOrderDate() {
			return orderDate;
		}
		public void setOrderDate(LocalDate orderDate) {
			this.orderDate = orderDate;
		}
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public String getStatus() {
			return Status;
		}
		public void setStatus(String status) {
			Status = status;
		}
		public List<LineItem> getItem() {
			return item;
		}
		public void setItem(List<LineItem> item) {
			this.item = item;
		}
		@Override
		public String toString() {
			return "Order [orderId=" + orderId + ", orderTotal=" + orderTotal + ", orderDate=" + orderDate
					+ ", customerId=" + customerId + ", Status=" + Status + ", item=" + item + "]";
		}
		
		
}