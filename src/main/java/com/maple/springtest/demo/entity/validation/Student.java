package com.maple.springtest.demo.entity.validation;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

/**
 * @Classname Student
 * @Description TODO
 * @Date 2021/2/16 10:45 上午
 * @Created by chenzhongzhi
 * @Version 1.0
 */
@Data
public class Student {

    @Length(min = 2, max = 12, message = "学生编码长度为2～12位")
    @NotEmpty(message = "学生编码不能为空")
    private String code;


    @Length(min = 2, max = 5, message = "学生姓名长度为2～5")
    @NotEmpty(message = "学生姓名不能为空")
    private String name;

}
