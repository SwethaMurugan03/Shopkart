package com.shop.Shopkart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.shop.Shopkart.Model.CheckoutModel;

@Repository
public interface CheckoutRepo extends JpaRepository<CheckoutModel, Long> {
	
}
