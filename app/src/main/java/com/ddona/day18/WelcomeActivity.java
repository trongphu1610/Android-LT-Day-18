package com.ddona.day18;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ddona.day18.database.StudentDbManager;
import com.ddona.day18.model.Student;

public class WelcomeActivity extends AppCompatActivity {
    private StudentDbManager studentDbManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        studentDbManager = new StudentDbManager(this);
        studentDbManager.addStudent(new Student(1, "Doan", 10));
        studentDbManager.addStudent2(new Student(2, "mai", 1));
    }
}