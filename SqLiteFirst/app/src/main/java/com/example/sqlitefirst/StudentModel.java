package com.example.sqlitefirst;

import java.io.Serializable;

public class StudentModel implements Serializable {
    int id;
    String name;
    int age;
    String address;

    public StudentModel(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public StudentModel(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
