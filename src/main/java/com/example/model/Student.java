package com.example.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ApiModel(value = "学生对象")
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Student {

    @ApiModelProperty(required = true, value = "学生名字")
    private String name;

    @ApiModelProperty(required = true, value = "学生班级")
    private String cls;

    @ApiModelProperty(required = false, value = "学生国籍")
    private String country;
}
