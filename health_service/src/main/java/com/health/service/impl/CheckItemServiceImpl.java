package com.health.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.health.service.CheckItemService;
import com.health.dao.CheckItemDao;
import com.health.pojo.CheckItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author MECHREVO
 * @date 2020/11/5 16:33
 */
@Service(interfaceClass = CheckItemService.class)
@Transactional
public class CheckItemServiceImpl implements CheckItemService {
    @Autowired
    private CheckItemDao checkItemDao;
    /**
     * 查询所有检查项列表
     *
     * @return
     */
    @Override
    public List<CheckItem> findAll() {
        List<CheckItem> checkItemList = checkItemDao.findAll();
        return checkItemList;
    }
}
