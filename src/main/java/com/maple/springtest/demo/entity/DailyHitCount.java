package com.maple.springtest.demo.entity;

import lombok.Data;

/**
 * @Classname DailyHintCount
 * @Description TODO
 * @Date 2021/2/15 10:18 下午
 * @Created by chenzhongzhi
 * @Version 1.0
 */

@Data
public class DailyHitCount {

    /**
     * 日期
     */
    private String day;

    /**
     * 槽位
     */
    private Integer slot;

    /**
     * 计数
     */
    private Integer cnt;
}
