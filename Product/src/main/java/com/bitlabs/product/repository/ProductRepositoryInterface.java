package com.bitlabs.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bitlabs.product.entity.Product;

@Repository
public interface ProductRepositoryInterface extends JpaRepository<Product, Long>{
	
	@Query("select p from Product p where pprice<=?1")
	public List<Product> findByProductByPprice(double pprice);
	
	@Query("select p from Product p where pprice  between ?1 and ?2")
	public List<Product> findByProductBetweenPrice(double minprice,double maxprice);
	
	@Query("select p from Product p where pname=?1")
	public List<Product> findByProductByPname(String pname);

	@Query("select p from Product p where pprice>=?1")
	public List<Product> findByProductByGreatThanPprice(double pprice);
	
	@Query("select p from Product p where pname like %?1%")
	public List<Product> findByProductLikeName(String pname);
	
	@Query(value="select max(pprice) from Product p where pname=?1",nativeQuery = true)
	public double findByProductByMaxprice(String pname);
	
}