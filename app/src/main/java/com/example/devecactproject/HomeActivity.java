package com.example.devecactproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class HomeActivity extends AppCompatActivity {

    private LinearLayout uniList1;
    private Button submitHomeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.home_title);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.consult_red)));
        getWindow().setStatusBarColor(ContextCompat.getColor(HomeActivity.this,R.color.consult_red));

        setContentView(R.layout.activity_home);


        submitHomeBtn = findViewById(R.id.submitHomeBtnId);
        uniList1 = findViewById(R.id.university1);

        submitHomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                academicInfo();
            }
        });
        uniList1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewUniversity();
            }
        });

    }

    public void viewUniversity(){

        Intent intent = new Intent(this,ViewUniversity_Activity.class);
        startActivity(intent);

    }

    public void academicInfo(){
        Intent intent = new Intent(this,SubmitAcademicInfo_Activity.class);
        startActivity(intent);

    }

}