package com.maple.springtest.demo.controller.validation;

import com.maple.springtest.demo.component.validation.StrContains;
import com.maple.springtest.demo.entity.validation.Student;
import com.maple.springtest.demo.exception.handle.ValidationExceptionHandle;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.NotNull;

/**
 * 使用到Validation的请求接收器，如果参数信息格式错误，受到全局异常处理{@link ValidationExceptionHandle}
 *
 * @Classname StudentController
 * @Description
 * @Date 2021/2/16 10:50 上午
 * @Created by chenzhongzhi
 * @Version 1.0
 */
@RestController
@RequestMapping("/student")
@Validated
public class StudentController {


    @GetMapping("/print")
    public String printStudent(@Validated Student student) {
        return student.toString();
    }

    @GetMapping("/count")
    public String assertStudentCount(@DecimalMax(value = "100", message = "学生数量不能大于100")
                                     @NotNull(message = "学生数量不允许为空") Integer count) {
        return "Success";
    }

    @GetMapping("/name")
    public String assertStudentName(@StrContains(contains = "ABC") String studentName) {
        return "Success";
    }
}
