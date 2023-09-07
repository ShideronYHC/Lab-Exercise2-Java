package com.example.labexercise2java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_name = findViewById(R.id.button_submit);
        TextView textView = findViewById(R.id.textView);
        EditText textViewEdit = findViewById(R.id.editTextName);
        textViewEdit.toString();

        button_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Welcome "+textViewEdit.getText().toString()+"!");
            }
        });
    }
}