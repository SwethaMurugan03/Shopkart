package com.shop.Shopkart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.shop.Shopkart.Model.UserModel;

@Repository
public interface UserRepo extends JpaRepository<UserModel, Long> {
	

}
