package com.example.devecactproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeBackActivity extends AppCompatActivity {

    private Button signInWelcomebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.welcomeback_title);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.consult_red)));
        getWindow().setStatusBarColor(ContextCompat.getColor(WelcomeBackActivity.this,R.color.consult_red));
        setContentView(R.layout.activity_welcome_back);


        signInWelcomebtn = findViewById(R.id.signInWelBackId);
        signInWelcomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeActivity();
            }
        });

    }

    public void HomeActivity(){

        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);

    }

}