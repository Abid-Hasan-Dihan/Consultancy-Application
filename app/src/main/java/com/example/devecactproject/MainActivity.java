package com.example.devecactproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button signInMainbtn, createAcbtn;
    private TextView registerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        signInMainbtn = findViewById(R.id.signInMainId);
        createAcbtn = findViewById(R.id.createAcMainId);
        registerText = findViewById(R.id.registerMainID);

        signInMainbtn.setOnClickListener(this);
        createAcbtn.setOnClickListener(this);
        registerText.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view.getId()==R.id.signInMainId){

            Intent intent = new Intent(MainActivity.this,WelcomeBackActivity.class);
            startActivity(intent);

        }else if (view.getId()==R.id.createAcMainId){

            Intent intent = new Intent(MainActivity.this,AccountInformation_Activity.class);
            startActivity(intent);

        }else if (view.getId()==R.id.registerMainID){

            Intent intent = new Intent(MainActivity.this,HomeActivity.class);
            startActivity(intent);

        }

    }
}