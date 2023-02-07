package com.model2.mvc.service.product.impl;

import java.util.HashMap;

import com.model2.mvc.service.product.vo.ProductVO;
import com.model2.mvc.service.product.dao.ProductDAO;
import com.model2.mvc.common.SearchVO;
import com.model2.mvc.service.product.ProductService;

public class ProductServiceImpl implements ProductService{

	private ProductDAO productDAO;
	public ProductServiceImpl() {
		productDAO = new ProductDAO();
	}
	
	@Override
	public void addProduct(ProductVO productVO) throws Exception {
		// TODO Auto-generated method stub
		productDAO.insertProduct(productVO);
	}

	@Override
	public ProductVO getProduct(int productNo) throws Exception {
		// TODO Auto-generated method stub
		return productDAO.findProduct(productNo);
	}

	@Override
	public HashMap<String, Object> getProductList(SearchVO searchVO) throws Exception {
		// TODO Auto-generated method stub
		return productDAO.getProductList(searchVO);
	}

	@Override
	public void updateProduct(ProductVO productVO) throws Exception {
		// TODO Auto-generated method stub
		productDAO.updateProduct(productVO);
	}
	
	
}
