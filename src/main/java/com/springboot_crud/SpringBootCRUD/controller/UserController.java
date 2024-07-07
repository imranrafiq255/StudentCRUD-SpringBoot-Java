package com.springboot_crud.SpringBootCRUD.controller;

import com.springboot_crud.SpringBootCRUD.entity.Student;
import com.springboot_crud.SpringBootCRUD.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class UserController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add-student")
    public String addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return "Student Added Successfully!";
    }

    @GetMapping("/load-all-students")
    public List<Student> loadStudents() {
        return studentService.loadStudents();
    }

    @GetMapping("/load-single-student")
    public Student loadSingleStudent(@RequestParam Integer id) {
        return studentService.loadSingleStudent(id);
    }

    @PutMapping("/update-student/{id}")
    public ResponseEntity<Void> updateStudent(@PathVariable Integer id, @RequestBody Student student) {
        studentService.updateStudent(id, student);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/delete-student/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Integer id) {
        studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }
}
