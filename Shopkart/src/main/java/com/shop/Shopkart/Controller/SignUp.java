package com.shop.Shopkart.Controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.shop.Shopkart.Model.UserModel;
import com.shop.Shopkart.Repository.UserRepo;




@RestController
@RequestMapping("api/signup")
@CrossOrigin("*")
public class SignUp {
	@Autowired
	UserRepo userRepo;
	
	@PostMapping("/signup")
	public UserModel createUser(@RequestBody UserModel user)
	{
		return userRepo.save(user);
		
	} 
	@PutMapping("/signup/{id}")
	public Optional<UserModel> updateParticipants(@PathVariable(value = "id") long id,@RequestBody UserModel user) {
		return userRepo.findById(id);
	}
	
		
	@DeleteMapping("/addtocart/{id}")
	public void deleteByUserId(@PathVariable(value = "id") long id) {
		
	}

	
	
}
