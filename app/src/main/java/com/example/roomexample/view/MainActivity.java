package com.example.roomexample.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import com.example.roomexample.MyDatabase;
import com.example.roomexample.R;
import com.example.roomexample.Student;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Context context;
    TextView textView;
    private static final String TAG = MainActivity.class.getName();
    MyDatabase myDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        textView = (TextView) findViewById(R.id.txtdata);

        List<Student> students = new ArrayList<>();
        students.add(new Student("ali", "rezayi"));
        students.add(new Student("aryan", "sohrabi"));
        students.add(new Student("jack", "richer"));
        students.add(new Student("sara", "colin"));

        myDatabase = Room.databaseBuilder(context, MyDatabase.class, "StudentDB").allowMainThreadQueries().build();

        //  myDatabase.getStudentDAO().insertAll(students);

        List<Student> secondList = new ArrayList<>();
        secondList = myDatabase.getStudentDAO().getAll();

        Student student = new Student("saman", "hoseyni");
        student.setID(2);
        myDatabase.getStudentDAO().update(student);


        myDatabase.getStudentDAO().delete(student);
        // secondList=myDatabase.getStudentDAO().search("ali");


        for (int i = 1; i < secondList.size(); i++) {
            textView.append(secondList.get(i).getName() + " - " + secondList.get(i).getFamily() + secondList.get(i).getID() + "\n");
        }

    }
}