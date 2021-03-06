package com.lexian.manager.shop.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lexian.manager.shop.bean.Store;
import com.lexian.manager.shop.service.StoreService;
import com.lexian.web.ResultHelper;
@Controller
@RequestMapping("store")
@SessionAttributes(value={"isLogining"},types={Boolean.class})
public class StoreController {
	@Autowired
	private StoreService storeService;

	public StoreService getStoreService() {
		return storeService;
	}

	public void setStoreService(StoreService storeService) {
		this.storeService = storeService;
	}
	
	
	
	//Integer pageNo
	@ResponseBody
	@RequestMapping("getAllStore.do")
	public ResultHelper getAllStore(Integer pageNo){
		// TODO Auto-generated method stub
		ResultHelper result=storeService.getAllStore(pageNo);
		//store/getAllStore.do?pageNo=2
		return result;
	}
	@ResponseBody
	@RequestMapping("addStore.do")
	public ResultHelper addStore(Store store){
		/*Store store1=new Store();
	    store1.setStoreNo("9999");*/
		ResultHelper result=storeService.addStore(store);
		return result;
		//store/addStore.do
	}
	@ResponseBody
	@RequestMapping("updateStore.do")
	public ResultHelper updateStore(Store store){
	/*Map<Integer,Store> map=new HashMap<Integer,Store>();*/
	/*  Integer id1=90;
	  Store store1=new Store();
	  store1.setStoreName("hahah");*/
		ResultHelper result=storeService.updateStore(store);
		return result;
		//store/updateStore.do?id=69&status=-1
	}
}
