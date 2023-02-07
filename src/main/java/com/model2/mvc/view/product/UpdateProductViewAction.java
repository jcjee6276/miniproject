package com.model2.mvc.view.product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model2.mvc.framework.Action;
import com.model2.mvc.service.product.ProductService;
import com.model2.mvc.service.product.impl.ProductServiceImpl;
import com.model2.mvc.service.product.vo.ProductVO;

import com.model2.mvc.service.user.vo.UserVO;

public class UpdateProductViewAction extends Action {
	public String execute(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		
		int prodNo=Integer.parseInt(request.getParameter("prodNo"));
		
		ProductService service = new ProductServiceImpl();
		ProductVO productVO = service.getProduct(prodNo);
		
		request.setAttribute("productVO", productVO);
		//System.out.println("up"+productVO);
		return "forward:/product/updateProduct.jsp"; //JSP ют╥б
	}
}
