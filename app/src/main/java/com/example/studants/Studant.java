package com.example.studants;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Studant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studant);

        String Name = getIntent().getStringExtra("Name");
        TextView myText = (TextView) findViewById(R.id.name1);
        myText.setText(Name);

        String Id = getIntent().getStringExtra("Id");
        TextView myText1= (TextView) findViewById(R.id.id1);
        myText1.setText(Id);

        String Age = getIntent().getStringExtra("Age");
        TextView myText2= (TextView) findViewById(R.id.age1);
        myText2.setText(Age);
    }
}
