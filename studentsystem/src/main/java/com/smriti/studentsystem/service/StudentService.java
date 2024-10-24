package com.smriti.studentsystem.service;

import com.smriti.studentsystem.model.Student;
import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
