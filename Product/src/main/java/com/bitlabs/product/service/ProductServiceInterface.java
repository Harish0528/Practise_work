package com.bitlabs.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bitlabs.product.entity.Product;

@Service
public interface ProductServiceInterface {

	List<Product> getProductByPrice(double pprice);

	List<Product> getProductBetweenPrice(double minprice, double maxprice);

	List<Product> getProductByPname(String pname);

	List<Product> getProductBygreatThan(double pprice);

	List<Product> getProductLikePname(String pname);

	double getProductByMaxprice(String pname);

	boolean saveProduct(Product prod);

	boolean updateqty(long pid, int nqty);

}
