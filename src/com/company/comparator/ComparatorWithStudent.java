package com.company.comparator;

import com.company.model.Student;

import java.util.Comparator;

public class ComparatorWithStudent implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int i = o1.getAge() - o2.getAge();
        if(i!=0){
            return i;
        }
        i = o1.getName().compareTo(o2.getName());
        return i;
    }
}
