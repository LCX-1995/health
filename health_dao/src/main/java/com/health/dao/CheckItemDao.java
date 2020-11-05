package com.health.dao;

import com.health.pojo.CheckItem;

import java.util.List;

/**
 * @author MECHREVO
 * @date 2020/11/5 16:29
 */
public interface CheckItemDao {
    /**
     * 查询所有检查项列表
     * @return
     */
    List<CheckItem> findAll();
}
