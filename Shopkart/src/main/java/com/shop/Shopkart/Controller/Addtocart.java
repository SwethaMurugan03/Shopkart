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

import com.shop.Shopkart.Model.AddtocartModel;
import com.shop.Shopkart.Repository.AddtocartRepo;
@RestController
@RequestMapping("api/addtocart")
@CrossOrigin("*")
public class Addtocart {
	@Autowired
	AddtocartRepo addCartRepo;
	
	@PostMapping("/addtocart")
	public AddtocartModel createaddtocart(@RequestBody AddtocartModel addtocart)
	{
		return addCartRepo.save(addtocart);
		
	} 
	
	
	@GetMapping("/addtocart/{id}")
	public Optional<AddtocartModel> getCartByUserId(@PathVariable(value = "id") Long id){
		return addCartRepo.findById(id);
		
	}
	
	@PutMapping("/addtocart/{id}")
	public Optional<AddtocartModel> updateCartByUserId(@PathVariable(value = "id") Long id,@RequestBody AddtocartModel addtocart) {
		return addCartRepo.findById(id);
	}
	
	@DeleteMapping("/addtocart/{id}")
	public void deleteCartByUserId(@PathVariable(value = "id") long id) {
		
	}



}
