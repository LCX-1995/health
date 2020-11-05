package com.health.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.health.constant.MessageConstant;
import com.health.constant.Result;
import com.health.pojo.CheckItem;
import com.health.service.CheckItemService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author MECHREVO
 * @date 2020/11/5 16:37
 */
@RestController
@RequestMapping(value = "/checkitem")
public class CheckItemController {
    @Reference
    private CheckItemService checkItemService;

    /**
     * 查询所有检查项数据
     * @return
     */
    @RequestMapping("/findAll")
    public Result findCheckItemList() {
        List<CheckItem> checkItemList = checkItemService.findAll();
        return new Result(true, MessageConstant.QUERY_CHECKITEM_SUCCESS, checkItemList);
    }
}
