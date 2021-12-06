package com.bitlabs.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitlabs.product.entity.Product;
import com.bitlabs.product.repository.ProductRepositoryInterface;

@Service
public class ProductServiceImpl implements ProductServiceInterface {
	
	@Autowired
	private ProductRepositoryInterface pri;
	
	@Override
	public boolean saveProduct(Product prod) {
		// TODO Auto-generated method stub
		boolean b=false;
		Product p= pri.save(prod);
		if(p!=null) {
			b=true;
		}
		return b;
	}

	@Override
	public List<Product> getProductByPrice(double pprice) {
		// TODO Auto-generated method stub
		return pri.findByProductByPprice(pprice);
	}

	@Override
	public List<Product> getProductBetweenPrice(double minprice, double maxprice) {
		// TODO Auto-generated method stub
		return pri.findByProductBetweenPrice(minprice, maxprice);
	}

	@Override
	public List<Product> getProductByPname(String pname) {
		// TODO Auto-generated method stub
		return pri.findByProductByPname(pname);
	}

	@Override
	public List<Product> getProductBygreatThan(double pprice) {
		// TODO Auto-generated method stub
		return pri.findByProductByGreatThanPprice(pprice);
	}

	@Override
	public List<Product> getProductLikePname(String pname) {
		// TODO Auto-generated method stub
		return pri.findByProductLikeName(pname);
	}

	@Override
	public double getProductByMaxprice(String pname) {
		// TODO Auto-generated method stub
		return pri.findByProductByMaxprice(pname);
	}

	@Override
	public boolean updateqty(long pid, int nqty) {
		// TODO Auto-generated method stub
		boolean b=false;
		Product p=pri.findById(pid).get();
		p.setPqty(p.getPqty()+nqty);
		if(pri.save(p)!=null) {
			b=true;
		}
		return b;
	}
}
