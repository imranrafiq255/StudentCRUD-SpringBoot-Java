package com.springboot_crud.SpringBootCRUD.repository;

import com.springboot_crud.SpringBootCRUD.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
