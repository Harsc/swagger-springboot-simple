package com.example.controller;

import com.example.model.Student;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Api(tags = {"学生"})
@RestController
public class StudentController {


    List<Student> students = new ArrayList<Student>();

    {
        students.add(new Student("Sajal", "IV", "India"));
        students.add(new Student("Lokesh", "V", "India"));
        students.add(new Student("Kajal", "III", "USA"));
        students.add(new Student("Sukesh", "VI", "USA"));
    }

    //自定义消息类型，不需要设置
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "200-ok"),
            @ApiResponse(code = 401, message = "401-not auth"),
            @ApiResponse(code = 403, message = "403-forbidden"),
            @ApiResponse(code = 500, message = "500-not found")
    })
    @ApiOperation(value = "查询All用户", response = Student.class, notes = "显示所有用户")//,tags = "分组的设置" notes 是情况而定
    @GetMapping(value = "/getStudents")
    public List<Student> getStudents() {
        return students;
    }


    //test
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "token", required = true, paramType = "header", dataType = "String"),
            @ApiImplicitParam(name = "name", required = true, paramType = "path", dataType = "String")
    })
    @ApiOperation(value = "根据用户名查询信息", response = Student.class)
    @GetMapping(value = "/getStudent/{name}")
    public Student getStudent(@PathVariable(value = "name") String name) {
        return students.stream().filter(x -> x.getName().equalsIgnoreCase(name)).collect(Collectors.toList()).get(0);
    }


}