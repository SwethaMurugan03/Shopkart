package com.shop.Shopkart.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.shop.Shopkart.Model.CheckoutModel;
import com.shop.Shopkart.Repository.CheckoutRepo;



@RestController
@RequestMapping("api/checkout")
@CrossOrigin("*")
public class Checkout {
	@Autowired
	CheckoutRepo checkoutRepo;
	
	@PostMapping("/checkout")
	public CheckoutModel createaddtocart(@RequestBody CheckoutModel addtocart)
	{
		return checkoutRepo.save(addtocart);
		
	} 
	
	
	@GetMapping("/checkout/{id}")
	public Optional<CheckoutModel> getByUserId(@PathVariable(value = "id") Long id){
		return checkoutRepo.findById(id);
		
	}
	
	@PutMapping("/checkout/{id}")
	public Optional<CheckoutModel> updateCartByUserId(@PathVariable(value = "id") Long id,@RequestBody CheckoutModel checkout) {
		return checkoutRepo.findById(id);
	}
	
	@DeleteMapping("/checkout/{id}")
	public void deleteByUserId(@PathVariable(value = "id") long id) {
		
	}
	

}
