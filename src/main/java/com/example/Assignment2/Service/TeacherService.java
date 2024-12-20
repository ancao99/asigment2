package com.example.Assignment2.Service;

import com.example.Assignment2.Entity.Teacher;
import com.example.Assignment2.Reponsitory.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> getTeachersByStudentId(int studentId) {
        return teacherRepository.findByStudentId(studentId);
    }
}
