package com.example.studants;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] Name_data = {"Heba Hamdy","Heba Hamdy1","Heba Hamdy2","Heba Hamdy3" };
    String[] Id_data = {"20151607", "20155263", "20155278", "20157789"};
    String[] Age_data = {"22", "23", "24", "25"};
    AdapterStudentList studentList;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentList = new AdapterStudentList(this, Name_data, Id_data , Age_data);
        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(studentList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, Studant.class);

                String Name = Name_data[position];
                intent.putExtra("Name", Name);
                startActivity(intent);

                String Id = Id_data[position];
                intent.putExtra("Id", Id);
                startActivity(intent);

                String Age = Age_data[position];
                intent.putExtra("Age", Age);
                startActivity(intent);

            }
        });
    }


}
