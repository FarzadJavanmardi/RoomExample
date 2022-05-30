package com.example.roomexample;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Student {

    @PrimaryKey(autoGenerate = true)
    private int ID;
    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name ="family")
    private String family;

    public Student() {
    }

    public Student(String name, String family) {
        this.name = name;
        this.family = family;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
