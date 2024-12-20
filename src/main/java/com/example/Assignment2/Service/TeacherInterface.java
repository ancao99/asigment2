package com.example.Assignment2.Service;

import com.example.Assignment2.Entity.Teacher;

import java.util.List;

interface TeacherInterface {
    List<Teacher> getTeachersByStudentId(int studentId);
}
