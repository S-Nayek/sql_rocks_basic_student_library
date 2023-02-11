package com.example.sql_rocks;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //so that hibernate can identify whose attribute to pick
@Table(name="user_info") // this  is for table name by default table name = class name
public class User {

    @Id // which is primary key
    @Column(unique=true)
    private int id;

    private String name;
    @Column(name="email_id",unique=true)
    private String email;
    private String age;

    public User() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(int id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
