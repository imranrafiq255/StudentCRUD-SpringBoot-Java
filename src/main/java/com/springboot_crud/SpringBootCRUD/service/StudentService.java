package com.springboot_crud.SpringBootCRUD.service;

import com.springboot_crud.SpringBootCRUD.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    void addStudent(Student student);

    List<Student> loadStudents();

    void deleteStudent(Integer id);

    void updateStudent(Integer id, Student student);

    Student loadSingleStudent(Integer id);
}
