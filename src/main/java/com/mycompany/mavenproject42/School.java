
package com.mycompany.mavenproject42;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Student> studentList = new ArrayList<>();
    
    public School(String name){
        this.name = name;
    }
    
    public void addStudent(String name, String id){
        Student s = new Student(name, id);
        studentList.add(s);
    }
    
    public void displaySchool(){
        System.out.println(name);
        for(Student s: studentList){
            System.out.println(s.getName());
            System.out.println(s.getId());
        }
    }
}
