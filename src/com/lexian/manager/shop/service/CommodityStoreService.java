package com.lexian.manager.shop.service;

import com.lexian.manager.shop.bean.CommodityStore;
import com.lexian.web.ResultHelper;
public interface CommodityStoreService {
  
   public ResultHelper getCommodityByStoreNo(String storeNo,Integer pageNo);
   public ResultHelper updateCommodityStore(CommodityStore commoditystore);
   public ResultHelper addCommodityStore(CommodityStore commoditystore);
}
