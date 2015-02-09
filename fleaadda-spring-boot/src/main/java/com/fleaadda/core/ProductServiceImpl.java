package com.fleaadda.core;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public List<Product> getProductList() {
		Product product = new Product();
		product.setProductId(98998);
		product.setProductName("FleaAdda Product 1");
		product.setSku("876778y78");
		System.out.println(product);
		List<Product> productList= new ArrayList<>();
		productList.add(product);
		return productList;
				
	}

}
