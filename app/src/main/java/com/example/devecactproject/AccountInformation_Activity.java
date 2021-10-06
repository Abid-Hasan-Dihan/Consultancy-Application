package com.example.devecactproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AccountInformation_Activity extends AppCompatActivity {

    private Button signInAccountInfo;

    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.acciynt_info_title);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.consult_red)));
        getWindow().setStatusBarColor(ContextCompat.getColor(AccountInformation_Activity.this,R.color.consult_red));

        setContentView(R.layout.activity_account_information);

        txtView = findViewById(R.id.text_viewId);

        String text = "I read and accept Terms and Service and Privacy Policy";

        SpannableString ss = new SpannableString(text);

        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {

                Toast.makeText(AccountInformation_Activity.this, "Terms and Service", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.BLUE);
                ds.setUnderlineText(false);
            }
        };
        ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {

                Toast.makeText(AccountInformation_Activity.this, "Privacy Policy", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.BLUE);
                ds.setUnderlineText(false);
            }
        };

        ss.setSpan(clickableSpan1,18,35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan2,40,54, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        txtView.setText(ss);
        txtView.setMovementMethod(LinkMovementMethod.getInstance());


        signInAccountInfo = findViewById(R.id.signInAcInfoId);
        signInAccountInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                accountInfo();

            }
        });

    }

    public void accountInfo(){

        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);
    }

}