package com.springboot_crud.SpringBootCRUD.service.impl;

import com.springboot_crud.SpringBootCRUD.entity.Student;
import com.springboot_crud.SpringBootCRUD.repository.StudentRepository;
import com.springboot_crud.SpringBootCRUD.service.StudentService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> loadStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteStudent(Integer id) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid student Id: " + id));
        studentRepository.delete(student);
    }

    @Override
    @Transactional
    public void updateStudent(Integer id, Student student) {
        Student s = studentRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No student found with given id: " + id));
        s.setStudentName(student.getStudentName());
        s.setStudentRollNo(student.getStudentRollNo());
        s.setStudentProgram(student.getStudentProgram());
        studentRepository.save(student);
    }

    @Override
    public Student loadSingleStudent(Integer id) {
        Student student = studentRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Student not found with given id: " + id));
        return student;
    }
}
