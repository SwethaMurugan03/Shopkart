package com.shop.Shopkart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.Shopkart.Model.AddtocartModel;

@Repository
public interface AddtocartRepo extends JpaRepository <AddtocartModel,Long> {
	
	
	
	
}
