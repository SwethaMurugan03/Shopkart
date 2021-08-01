package com.shop.Shopkart.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products",catalog ="shopkart")
public class ProductModel {
	@Id
	long id;
	String name;
	String price;
	String added_on;
	String product_id;
	public ProductModel() {
		
		// TODO Auto-generated constructor stub
	}
	public ProductModel(long id, String name, String price, String added_on, String product_id) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.added_on = added_on;
		this.product_id = product_id;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAdded_on() {
		return added_on;
	}
	public void setAdded_on(String added_on) {
		this.added_on = added_on;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setCategory_id(String product_id) {
		this.product_id = product_id;
	}
	

}
