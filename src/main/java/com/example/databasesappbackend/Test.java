package com.example.databasesappbackend;

import org.graalvm.compiler.api.replacements.ClassSubstitution;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "test")
public class Test {
    @Id
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;


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
}
