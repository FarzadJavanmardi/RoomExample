package com.example.roomexample;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface StudentDAO {


    @Query("select * from Student")
    List<Student> getAll();

    @Query("SELECT * FROM Student WHERE name = :name")
    List<Student> search(String name);

    @Insert
    void insertAll(List<Student> StudentList);

    @Update
    void update(Student student);

    @Delete
    void delete(Student student);
}
