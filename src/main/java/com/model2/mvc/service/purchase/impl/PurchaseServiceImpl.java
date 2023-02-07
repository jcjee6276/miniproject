package com.model2.mvc.service.purchase.impl;

import java.util.HashMap;

import com.model2.mvc.common.SearchVO;
import com.model2.mvc.service.user.dao.UserDAO;
import com.model2.mvc.service.user.vo.UserVO;
import com.model2.mvc.service.product.dao.ProductDAO;
import com.model2.mvc.service.product.vo.ProductVO;
import com.model2.mvc.service.purchase.PurchaseService;
import com.model2.mvc.service.purchase.dao.PurchaseDAO;
import com.model2.mvc.service.purchase.vo.PurchaseVO;
import com.model2.mvc.service.product.dao.*;
//import com.model2.mvc.service.purchase.PurchaseService;

public class PurchaseServiceImpl implements PurchaseService{
	
	private ProductDAO productDAO;
	private PurchaseDAO purchaseDAO;
	
	public PurchaseServiceImpl() {
		productDAO = new ProductDAO();
		purchaseDAO = new PurchaseDAO();
	}
	
	//public PurchaseVO addPurchase(PurchaseVO purchaseVO) throws Exception {
		
		
		//return 
	//}
	public PurchaseVO getPurchase(int tranNo) throws Exception {
		//System.out.println(purchaseDAO.findPurchase(prodNo).getPurchaseProd());
		
		return purchaseDAO.findPurchase(tranNo);
	}

	@Override
	public void addPurchase(PurchaseVO purchaseVO) throws Exception{
		// TODO Auto-generated method stub
		 purchaseDAO.insertPurchase(purchaseVO);
	}


	@Override
	public HashMap<String, Object> getPurchaseList(SearchVO searchVO, String string) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<String, Object> getSaleList(SearchVO searchvo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PurchaseVO updatePurchase(PurchaseVO purchaseVO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateTranCode(PurchaseVO purchaseVO) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
