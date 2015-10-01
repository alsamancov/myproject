package com.springapp.mvc.domain;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="age")
    private String age;

    public Student(){
    }

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Transactional
    public int getId() {
        return id;
    }
    @Transactional
    public void setId(int id) {
        this.id = id;
    }
    @Transactional
    public String getName() {
        return name;
    }
    @Transactional
    public void setName(String name) {
        this.name = name;
    }
    @Transactional
    public String getAge() {
        return age;
    }
    @Transactional
    public void setAge(String age) {
        this.age = age;
    }
}
