package com.example.controller;

import com.example.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<Student>() {{
        students.add(new Student("jone", "class1", "zh"));
        students.add(new Student("bule", "class3", "jp"));
        students.add(new Student("acje", "class6", "us"));
    }};


    @RequestMapping("/getStudents")
    public List<Student> getStudents() {
        return students;
    }
}
