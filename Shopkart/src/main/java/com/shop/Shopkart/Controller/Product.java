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


import com.shop.Shopkart.Model.ProductModel;
import com.shop.Shopkart.Repository.ProductRepo;

@RestController
@RequestMapping("api/product")
@CrossOrigin("*")
public class Product {
	@Autowired
	ProductRepo proRepo;
	
	@PostMapping("/product")
	public ProductModel createproduct(@RequestBody ProductModel product)
	{
		return proRepo.save(product);
		
	} 
	
	@GetMapping("/product/{id}")
	public Optional<ProductModel> getproductByUserId(@PathVariable(value = "id") Long id){
		return proRepo.findById(id);
	}
		
	
	@PutMapping("/product/{id}")
	public Optional<ProductModel> updateproductByUserId(@PathVariable(value = "id") Long id,@RequestBody ProductModel product) {
		return proRepo.findById(id);
	}
	
	
	@DeleteMapping("/product/{id}")
	public void deleteproductByUserId(@PathVariable(value = "id") long id) {
		
	}		
	

}
