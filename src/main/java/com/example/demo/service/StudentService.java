package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.StudentEntity;

public interface StudentService {

    Student insertStudent(Student st);

    List<Student> getdata();

    Optional<Student> getOneStudent(Long id);

    void deleteStudent(Long id);
}