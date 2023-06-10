package com.example.sqlitefirst;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class StudentDatabaseSource {


   StudentDatabaseHelper studentDatabaseHelper;
    SQLiteDatabase sqLiteDatabase;
    StudentModel studentModel;
    public StudentDatabaseSource(Context context)
    {
        studentDatabaseHelper = new StudentDatabaseHelper(context);

    }

    public void open()
    {
        sqLiteDatabase= studentDatabaseHelper.getWritableDatabase();
    }

    public void close()
    {
        studentDatabaseHelper.close();
    }

    public boolean addStudent(StudentModel studentModel)
    {
        this.open();
        ContentValues contentValues = new ContentValues();
        contentValues.put(StudentDatabaseHelper.COL_NAME,studentModel.getName());
        contentValues.put(StudentDatabaseHelper.COL_AGE,studentModel.getAge());
        contentValues.put(StudentDatabaseHelper.COL_ADDRESS,studentModel.getAddress());

        long insertedRow = sqLiteDatabase.insert(StudentDatabaseHelper.STUDENT_TABLE, null,contentValues);
        this.close();
        if(insertedRow>0)
        {
            return  true;
        }
        else return  false;

    }

    public  boolean updateStudent(StudentModel studentModel)
    {
        this.open();
        ContentValues contentValues = new ContentValues();
        contentValues.put(StudentDatabaseHelper.COL_NAME,studentModel.getName());
        contentValues.put(StudentDatabaseHelper.COL_AGE,studentModel.getAge());
        contentValues.put(StudentDatabaseHelper.COL_ADDRESS,studentModel.getAddress());

        int updatedRow = sqLiteDatabase.update(studentDatabaseHelper.STUDENT_TABLE,contentValues,StudentDatabaseHelper.COL_ID+" =?",new String[]{String.valueOf(studentModel.getId())});
        this.close();

        if(updatedRow>0)
        {
            return true;
        }
        else return false;

    }


    public ArrayList<StudentModel> getAllstudent()
    {
        this.open();
        ArrayList<StudentModel> arrayList = new ArrayList<>();
        Cursor cursor = sqLiteDatabase.query(studentDatabaseHelper.STUDENT_TABLE,null,null,null,null,null,null,null);
        if(cursor.moveToFirst())
        {
            int nameColumnIndex = cursor.getColumnIndex(studentDatabaseHelper.COL_NAME);
            int ageColumnIndex = cursor.getColumnIndex(studentDatabaseHelper.COL_AGE);
            int addressColumnIndex = cursor.getColumnIndex(studentDatabaseHelper.COL_ADDRESS);
            int idColumnIndex = cursor.getColumnIndex(studentDatabaseHelper.COL_ID);

            if (nameColumnIndex >= 0 && ageColumnIndex >= 0 && addressColumnIndex>=0 && idColumnIndex>=0)
            {

                do {
                    String name = cursor.getString(nameColumnIndex);
                    int age = cursor.getInt(ageColumnIndex);
                    String address = cursor.getString(addressColumnIndex);
                    int id = cursor.getInt(idColumnIndex);

                    //String name = cursor.getString(cursor.getColumnIndex(studentDatabaseHelper.COL_NAME));
                    //int age = cursor.getInt(cursor.getColumnIndex(studentDatabaseHelper.COL_AGE));
                    //String address = cursor.getString(cursor.getColumnIndex(studentDatabaseHelper.COL_ADDRESS));


                    StudentModel studentModel = new StudentModel(id,name,age,address);
                    arrayList.add(studentModel);
                }
                while (cursor.moveToNext());
            }


        }
        this.close();
        cursor.close();

        return  arrayList;

    }

    public  boolean deleteStudent(StudentModel model)
    {
        this.open();
        int deletedRow = sqLiteDatabase.delete(StudentDatabaseHelper.STUDENT_TABLE,StudentDatabaseHelper.COL_ID+ " =?",new String[]{String.valueOf(model.getId())});
        this.close();
        if (deletedRow>0)
            return true;

        else return false;
    }


}
