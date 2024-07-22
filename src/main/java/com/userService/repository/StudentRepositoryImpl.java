package com.userService.repository;

import com.userService.model.Student;
import com.userService.repository.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static final String STUDENT_TABLE_NAME = "student";

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void createStudent(Student student) {
        String sql = "INSERT INTO " + STUDENT_TABLE_NAME + " (first_name, last_name, email,payment_method) VALUES (?, ?, ?,?)";
        jdbcTemplate.update(sql, student.getFirstName(), student.getLastName(), student.getEmail(),student.getPaymentMethod().name());
    }

    @Override
    public Student getStudentById(Long studentId) {
        String sql = "SELECT * FROM " + STUDENT_TABLE_NAME + " WHERE id=?";
        try {
            return jdbcTemplate.queryForObject(sql, new StudentMapper(), studentId);
        } catch (EmptyResultDataAccessException error){
            return null;
        }
    }

    @Override
    public List<Student> getStudentsByFirstName(String firstName) {
        return null;
    }
}
