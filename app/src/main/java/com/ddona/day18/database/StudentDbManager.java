package com.ddona.day18.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.ddona.day18.model.Student;

public class StudentDbManager {

    private SQLiteDatabase mDb;
    private StudentDbOpenHelper mHelper;

    public StudentDbManager(Context context) {
        mHelper = new StudentDbOpenHelper(context);
        mDb = mHelper.getWritableDatabase();
    }

    public void addStudent(Student student) {
        ContentValues values = new ContentValues();
        values.put(StudentDbOpenHelper.COL_NAME, student.getName());
        values.put(StudentDbOpenHelper.COL_SCORE, student.getScore());
        mDb.insert(StudentDbOpenHelper.TB_STUDENT, null, values);
    }

    public void addStudent2(Student student) {
        String sql = "INSERT INTO " + StudentDbOpenHelper.TB_STUDENT + "(" +
                StudentDbOpenHelper.COL_NAME + "," +
                StudentDbOpenHelper.COL_SCORE + ") VALUES('" +
                student.getName() + "'," +
                student.getScore() + ");";
        mDb.execSQL(sql);
    }
}
