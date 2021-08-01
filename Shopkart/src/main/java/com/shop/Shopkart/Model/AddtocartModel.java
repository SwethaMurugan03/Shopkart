package com.shop.Shopkart.Model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "add_to_cart",catalog="shopkart")

public class AddtocartModel {
	@Id
	long id;
	@JsonIgnore
	
	@OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "product_id")
	ProductModel productmodel;
	//Long product_id;
	int qty;
	double price;
	Long user_id;
	@Column(updatable=false, insertable=false)
	String added_date;
	@Transient
	static
	String productName;
	
	public AddtocartModel() {
		
		// TODO Auto-generated constructor stub
	}
	public AddtocartModel(long id, ProductModel productmodel, int qty, double price, Long user_id, String added_date) {
		
		this.id = id;
		this.productmodel = productmodel;
		this.qty = qty;
		this.price = price;
		this.user_id = user_id;
		this.added_date = added_date;
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public ProductModel getProductmodel() {
		return productmodel;
	}
	public void setProductmodel(ProductModel productmodel) {
		this.productmodel = productmodel;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getAdded_date() {
		return added_date;
	}
	public void setAdded_date(String added_date) {
		this.added_date = added_date;
	}
	public static String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		AddtocartModel.productName = productName;
	}
	


	
	
}
