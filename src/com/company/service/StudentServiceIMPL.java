package com.company.service;

import com.company.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceIMPL implements IStudentService{
    public static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student(1, "Chinh", 15));
        studentList.add(new Student(4, "Bình", 14));
        studentList.add(new Student(2, "Anh Tây", 15));
        studentList.add(new Student(3, "Tiến Long", 20));
    }
    @Override
    public List<Student> findAll() {
        return studentList;
    }
}
