package com.example.Assignment2.Service;

import com.example.Assignment2.Entity.Student;

import java.util.List;

interface StudentInterface {
    List<Student> getAllStudents();

     List<Student> getStudentsByAge(int age);
    void saveStudent(Student student);

    void updateStudent(Student student);

    void deleteStudentById(int id);
}
