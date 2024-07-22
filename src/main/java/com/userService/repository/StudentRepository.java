package com.userService.repository;

import com.userService.model.Student;

import java.util.List;

public interface StudentRepository {
    void createStudent(Student student);
    Student getStudentById(Long studentId);
    List<Student> getStudentsByFirstName(String firstName);
}
