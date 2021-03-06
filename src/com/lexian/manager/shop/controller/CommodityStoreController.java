package com.lexian.manager.shop.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lexian.manager.shop.bean.CommodityStore;
import com.lexian.manager.shop.service.CommodityStoreService;
import com.lexian.web.ResultHelper;

@Controller
@RequestMapping("commoditystore")
public class CommodityStoreController {
	@Autowired
	private CommodityStoreService commoditystoreService;

	public CommodityStoreService getCommoditystoreService() {
		return commoditystoreService;
	}

	public void setCommoditystoreService(CommodityStoreService commoditystoreService) {
		this.commoditystoreService = commoditystoreService;
	}

	@ResponseBody
	@RequestMapping("getCommodityStoreByStoreNo.do")
	public ResultHelper getCommdityByStoreNo(Integer pageNo,String storeNo) {
		ResultHelper result = commoditystoreService.getCommodityByStoreNo(storeNo,pageNo);
		return result;
		// commoditystore/getCommodityStoreByStoreNo.do?storeNo=1013&pageNo=10
	}
	@ResponseBody
	@RequestMapping("updateCommodityStore.do")
	public ResultHelper updateCommodityStore(CommodityStore commoditystore){
	ResultHelper result=commoditystoreService.updateCommodityStore(commoditystore);
	return result;
	//commoditystore/updateCommodityStore.do?id=8363&realPrice=11.11
	}
	@ResponseBody
	@RequestMapping("addCommodityStore.do")
	public ResultHelper addCommodityStore(CommodityStore commoditystore){
		/*CommodityStore commoditystore1=new CommodityStore();
		commoditystore1.setCommmodityNo("6666");
		commoditystore1.setStoreNo("123");*/
		ResultHelper result=commoditystoreService.addCommodityStore(commoditystore);
		return result;
		//commoditystore/addCommodityStore.do?commmodityNo=6666&storeNo=6666
	}
}
