package com.prince.java.project.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int department;
    private String email;
    private String name;
    private String phone_num;


    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }
    public int getDepartment() {
        return department;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
}