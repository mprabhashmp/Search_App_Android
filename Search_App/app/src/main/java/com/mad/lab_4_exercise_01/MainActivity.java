package com.mad.lab_4_exercise_01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    Button search;
    EditText textInput;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        search = (Button) findViewById(R.id.search);
        textInput = (EditText) findViewById(R.id.textInput);

        search.setOnClickListener(view -> {
            String input=textInput.getText().toString();
            Intent i = new Intent(Intent.ACTION_VIEW,(Uri.parse(input)));
            startActivity(i);
        });
    }
}