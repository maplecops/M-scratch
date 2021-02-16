package com.maple.springtest.demo.service.impl;

import com.maple.springtest.demo.entity.DailyHitCount;
import com.maple.springtest.demo.mapper.DailyHitCountMapper;
import com.maple.springtest.demo.service.DailyHitCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Classname DailyHitCountServiceImpl
 * @Description TODO
 * @Date 2021/2/15 10:40 下午
 * @Created by chenzhongzhi
 * @Version 1.0
 */
@Service
public class DailyHitCountServiceImpl implements DailyHitCountService {

    @Autowired
    private DailyHitCountMapper dailyHitCountMapper;

    @Override
    public Integer getCount() {
        return dailyHitCountMapper.count();
    }
}
