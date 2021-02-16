package com.maple.springtest.demo.controller;

import com.maple.springtest.demo.entity.validation.Student;
import com.maple.springtest.demo.service.DailyHitCountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname DailyHitCountController
 * @Description TODO
 * @Date 2021/2/15 10:41 下午
 * @Created by chenzhongzhi
 * @Version 1.0
 */
@RestController
@RequestMapping("/daily")
@Slf4j
public class DailyHitCountController {

    @Autowired
    private DailyHitCountService dailyHitCountService;

    @GetMapping("/count")
    public Integer getDailyHitCount() {
        log.debug("debug");
        log.info("info");
        log.error("error");
        log.error("{} - [{}]", log.getClass(), log.getName());
        return dailyHitCountService.getCount();
    }

}
