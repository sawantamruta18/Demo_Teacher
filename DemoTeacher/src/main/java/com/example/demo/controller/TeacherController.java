package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Teacher;
import com.example.demo.service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/display")
    public List<Teacher> displayTeachers() {
        return teacherService.display();
    }

    @PostMapping("/add")
    public void addTeacher(@RequestBody Teacher teacher) {
        teacherService.add(teacher);
    }
}