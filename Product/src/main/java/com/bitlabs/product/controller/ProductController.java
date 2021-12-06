package com.bitlabs.product.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bitlabs.product.entity.Product;
import com.bitlabs.product.service.ProductServiceInterface;

@RestController
public class ProductController {
	
	@Autowired
	private ProductServiceInterface psi;
	
	
	@PostMapping("/addproduct")
	public boolean saveProduct(@Valid @RequestBody Product prod) {
		return psi.saveProduct(prod);
	}
	
	@GetMapping("/getProductBylessthanPrice/{price}")
	public List<Product> getProductByPrice(@PathVariable ("price") double pprice){
		return psi.getProductByPrice(pprice);
	}

	@GetMapping("getproductbybetweenprice/{minprice}/{maxprice}")
	public List<Product> getProductBetweenPrice(@PathVariable("minprice") double minprice,@PathVariable("maxprice") double maxprice){
		return psi.getProductBetweenPrice(minprice,maxprice);
	}
	
	@GetMapping("getProductByPname/{pname}")
	public List<Product> getProductByPname(@PathVariable("pname") String pname){
		return psi.getProductByPname(pname);
	}
	
	@GetMapping("/getProductBygreatthanPrice/{price}")
	public List<Product> getProductBygreatThan(@PathVariable ("price") double pprice){
		return psi.getProductBygreatThan(pprice);
	}
	
	@GetMapping("/getproductlikename/{pname}")
	public List<Product> getProductLikePname(@PathVariable ("pname") String pname){
		return psi.getProductLikePname(pname);
	}
	
	@GetMapping("/getProductByMaxprice/{pname}")
	public double getProductByMaxprice(@PathVariable("pname") String pname) {
		return psi.getProductByMaxprice(pname);
	}
	
	@PutMapping("/update/{pid}/{newqty}")
	public boolean updateQty(  @PathVariable ("pid") long pid,@PathVariable("newqty") int nqty) {
		return psi.updateqty(pid,nqty);
	}	
}
