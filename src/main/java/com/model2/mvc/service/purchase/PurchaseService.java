package com.model2.mvc.service.purchase;
import com.model2.mvc.common.SearchVO;
import com.model2.mvc.service.purchase.vo.*;
import java.util.HashMap;

public interface PurchaseService {

	public void addPurchase(PurchaseVO purchaseVO) throws Exception;
		
	public PurchaseVO getPurchase(int tranNo) throws Exception;
	
	public HashMap<String, Object> getPurchaseList(SearchVO searchVO, String string) throws Exception;
	
	public HashMap<String, Object> getSaleList(SearchVO searchvo) throws Exception;
	
	public PurchaseVO updatePurchase(PurchaseVO purchaseVO) throws Exception;
	
	public void updateTranCode(PurchaseVO purchaseVO) throws Exception;
	
}
