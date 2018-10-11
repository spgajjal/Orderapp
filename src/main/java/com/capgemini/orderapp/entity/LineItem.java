package com.capgemini.orderapp.entity;

public class LineItem {
	
	private int itemId;
	private int itemQuantity;
	private String itemProduct;
	
	
	public LineItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public LineItem(int itemId, int itemQuantity, String itemProduct) {
		super();
		this.itemId = itemId;
		this.itemQuantity = itemQuantity;
		this.itemProduct = itemProduct;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public String getItemProduct() {
		return itemProduct;
	}
	public void setItemProduct(String itemProduct) {
		this.itemProduct = itemProduct;
	}
	
	
	@Override
	public String toString() {
		return "ListItem [itemId=" + itemId + ", itemQuantity=" + itemQuantity + ", itemProduct=" + itemProduct + "]";
	}
	
	

}
