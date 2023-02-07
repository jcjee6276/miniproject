package com.model2.mvc.view.product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model2.mvc.framework.Action;
import com.model2.mvc.service.product.ProductService;
import com.model2.mvc.service.product.impl.ProductServiceImpl;
import com.model2.mvc.service.product.vo.ProductVO;
//import com.model2.mvc.view.product.*;

import com.model2.mvc.service.user.vo.UserVO;

public class UpdateProductAction extends Action {
	public String execute(	HttpServletRequest request,HttpServletResponse response) throws Exception {
		int prodNo = Integer.parseInt(request.getParameter("prodNo"));
		//System.out.println("EE"+prodNo);

		//UpdateProductViewAction VO = new UpdateProductViewAction();
		ProductVO productVO = new ProductVO();
		UserVO userVO = new UserVO();
		//VO.execute(request, response);
		
		String userId=(String)request.getParameter("userId");
		//int prodNo = Integer.parseInt(request.getParameter("prodNo"));

		
		//System.out.println("EE"+productVO);
		//service.getProduct(prodNo);
		productVO.setProdNo(prodNo);
		
		productVO.setProdName(request.getParameter("prodName"));
		productVO.setProdDetail(request.getParameter("prodDetail"));
		productVO.setManuDate(request.getParameter("manuDate"));
		
		productVO.setPrice(Integer.parseInt(request.getParameter("price")));
		productVO.setFileName(request.getParameter("fileName"));
		ProductService service = new ProductServiceImpl();
		service.updateProduct(productVO);
		System.out.println("EE"+productVO);
		
		
		
		/*HttpSession session = request.getSession();
		int sessionId=((ProductVO)session.getAttribute("prodNo")).getProdNo();
		
		if(sessionId == prodNo){
			session.setAttribute("prodNo", productVO);
		}*/

		return "redirect:/getProduct.do?prodNo="+prodNo;
	}
}
