package com.company;

import com.company.comparator.ComparatorWithStudent;
import com.company.service.StudentServiceIMPL;

import java.util.Collections;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Queue<Integer> queue = new ArrayBlockingQueue(2);
//        queue.add(1);
//        queue.add(2);
//        System.out.println(queue.offer(3));
//        System.out.println("quese ===> "+queue);
        StudentServiceIMPL studentServiceIMPL = new StudentServiceIMPL();
        System.out.println("Trước khi sắp xếp ");
        System.out.println(studentServiceIMPL.findAll());
        ComparatorWithStudent comparatorWithStudent = new ComparatorWithStudent();
        Collections.sort(studentServiceIMPL.findAll(),comparatorWithStudent);
//        Collections.sort(studentServiceIMPL.findAll());
        System.out.println("Sau khi sắp xếp ");
        System.out.println(studentServiceIMPL.findAll());
    }
}
