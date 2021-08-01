package com.shop.Shopkart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.shop.Shopkart.Model.ProductModel;

@Repository
public interface ProductRepo extends JpaRepository<ProductModel, Long>{
	
}
