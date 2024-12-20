package com.example.Assignment2.Controller;

import com.example.Assignment2.Entity.Teacher;
import com.example.Assignment2.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/student/{studentId}")
    public List<Teacher> getTeachersByStudentId(@PathVariable int studentId) {
        return teacherService.getTeachersByStudentId(studentId);
    }
}


