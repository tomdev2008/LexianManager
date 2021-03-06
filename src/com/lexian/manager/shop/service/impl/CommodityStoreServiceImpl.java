package com.lexian.manager.shop.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lexian.manager.authority.bean.Privilege;
import com.lexian.manager.shop.bean.CommodityStore;
import com.lexian.manager.shop.dao.CommodityStoreDao;
import com.lexian.manager.shop.service.CommodityStoreService;
import com.lexian.utils.Constant;
import com.lexian.web.Page;
import com.lexian.web.ResultHelper;
   @Service
public class CommodityStoreServiceImpl implements CommodityStoreService {
    @Autowired
	 private CommodityStoreDao commoditystoreDao;

	public CommodityStoreDao getCommoditystoreDao() {
		return commoditystoreDao;
	}

	public void setCommoditystoreDao(CommodityStoreDao commoditystoreDao) {
		this.commoditystoreDao = commoditystoreDao;
	}

	
	/*Page page = new Page();

	page.setPageNo(pageNo);

	Map<String, Object> params = new HashMap<>();
	params.put("page", page);
	params.put("id", id);
	List<Privilege> privileges = managerDao.getPrivilegesPage(params);
	page.setData(privileges);
	ResultHelper result = new ResultHelper(Constant.code_success, page);
	return result;*/
	@Override
	public ResultHelper getCommodityByStoreNo(String storeNo,Integer pageNo) {
		// TODO Aouto-generated method stub
		Page page=new Page();
		page.setPageNo(pageNo);
		Map<String, Object> params = new HashMap<>();
		params.put("page", page);
		params.put("storeNo",storeNo);
		List<CommodityStore> list = commoditystoreDao.getCommdityByStoreNoPage(params);
		page.setData(list);
		ResultHelper result = new ResultHelper(Constant.code_success, page);
		return result;
		/*List<CommodityStore> list=commoditystoreDao.getCommdityByStoreNo(storeNo);
		return new ResultHelper(Constant.code_success,list);*/
	}

	@Override
	public ResultHelper updateCommodityStore(CommodityStore commoditystore) {
		// TODO Auto-generated method stub
		commoditystoreDao.updateCommdityStore(commoditystore);
		return new ResultHelper(Constant.code_success);
	}

	@Override
	public ResultHelper addCommodityStore(CommodityStore commoditystore) {
		// TODO Auto-generated method stub
		/*System.out.println(commoditystore.getCommmodityNo()+"*********"+commoditystore.getStoreNo());*/
		commoditystoreDao.addCommodityStore(commoditystore);
		return new ResultHelper(Constant.code_success);
	}
    
}
