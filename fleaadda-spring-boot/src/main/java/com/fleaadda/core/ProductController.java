package com.fleaadda.core;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mangofactory.swagger.plugin.EnableSwagger;
import com.wordnik.swagger.annotations.ApiOperation;



@RestController
@EnableSwagger
public class ProductController {
	
	@Resource
	private ProductService productService;
	
	@ApiOperation(value="get list of products")
	@RequestMapping(value ="/products", method= RequestMethod.GET)
	public List<Product> getProductList() {
		return productService.getProductList();
	}


}
