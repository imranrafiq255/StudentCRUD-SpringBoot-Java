package com.springboot_crud.SpringBootCRUD.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;

    public Integer getStudentId() {
        return studentId;
    }
    public void setStudentId(Integer studentId)
    {
        this.studentId = studentId;
    }
    private String studentName;
    public String getStudentName()
    {
        return this.studentName;
    }
    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }
    private String studentRollNo;
    public String getStudentRollNo()
    {
        return this.studentRollNo;
    }
    public void setStudentRollNo(String studentRollNo)
    {
        this.studentRollNo = studentRollNo;
    }
    private String studentProgram;
    public String getStudentProgram()
    {
        return this.studentProgram;
    }
    public void setStudentProgram(String studentProgram)
    {
        this.studentProgram = studentProgram;
    }
}
