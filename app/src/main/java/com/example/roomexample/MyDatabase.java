package com.example.roomexample;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;


@Database(entities = Student.class,version = 1)
public abstract class MyDatabase extends RoomDatabase {


    public abstract StudentDAO getStudentDAO();

}
