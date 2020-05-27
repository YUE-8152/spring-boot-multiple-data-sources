package com.company.project.service.impl;

import com.company.project.dao.OrderItemMapper;
import com.company.project.model.OrderItem;
import com.company.project.service.OrderItemService;
import com.company.project.common.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * @Author: YUEXIN
 * @Date: 2020-05-27 09:05:51
 */
@Service
@Transactional
public class OrderItemServiceImpl extends AbstractService<OrderItem> implements OrderItemService {
    @Resource
    private OrderItemMapper orderItemMapper;

}
