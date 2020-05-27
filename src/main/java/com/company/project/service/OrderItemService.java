package com.company.project.service;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.company.project.model.OrderItem;
import com.company.project.common.core.Service;


/**
 * @Author: YUEXIN
 * @Date: 2020-05-27 09:05:51
 */
@DS("slave")
public interface OrderItemService extends Service<OrderItem> {

}
