package com.example.sqlitefirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    StudentModel studentModel;
    EditText etName,etAge,etAdress;
    Button addBtn,showstudent;
    StudentDatabaseSource studentDatabaseSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         etName = findViewById(R.id.etName);
         etAge = findViewById(R.id.etAge);
         etAdress = findViewById(R.id.etAdress);
         addBtn = findViewById(R.id.addstudent);
         showstudent = findViewById(R.id.showstudent);

        StudentModel studentModel = (StudentModel) getIntent().getSerializableExtra("STUDENT");
        if(studentModel!=null)
        {
            addBtn.setText("Update Student");
            etName.setText(studentModel.getName());
            etAge.setText(studentModel.getAge()+"");
            etAdress.setText(studentModel.getAddress());
        }

         studentDatabaseSource = new StudentDatabaseSource(this);

         addBtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 //Upadate Code here
                 if (studentModel != null) {
                     String updatedName = etName.getText().toString();
                     int updatedAge = Integer.valueOf(etAge.getText().toString());
                     String updatedAddress = etAdress.getText().toString();
                     int id = studentModel.getId();
                     StudentModel updatedStuentModel = new StudentModel(id, updatedName, updatedAge, updatedAddress);
                     Boolean updatedstatus = studentDatabaseSource.updateStudent(updatedStuentModel);

                     if (updatedstatus) {
                         Toast.makeText(MainActivity.this, "Updated Succesfully", Toast.LENGTH_SHORT).show();
                     } else
                         Toast.makeText(MainActivity.this, "Not Update", Toast.LENGTH_SHORT).show();

                 }



                 //insert Code here
                 else {

                     StudentModel studentModel = new StudentModel(etName.getText().toString(), Integer.valueOf(etAge.getText().toString()), etAdress.getText().toString());
                     Boolean status = studentDatabaseSource.addStudent(studentModel);

                     if (status) {
                         Toast.makeText(MainActivity.this, "Save", Toast.LENGTH_SHORT).show();
                     } else
                         Toast.makeText(MainActivity.this, "NotSave", Toast.LENGTH_SHORT).show();

                 }
             }
         });

         showstudent.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this, StudentListActivity.class);
                 startActivity(intent);
             }
         });



    }
}