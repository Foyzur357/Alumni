package com.jubel.alumni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class LandingActivity extends AppCompatActivity implements View.OnClickListener {

    Button logInBtn, registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        logInBtn = findViewById(R.id.logInBtnId);
        registerBtn = findViewById(R.id.registerBtnId);

        logInBtn.setOnClickListener(this);
        registerBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.logInBtnId:
                Intent login  = new Intent(this, LoginActivity.class);
                startActivity(login);
                break;
            case R.id.registerBtnId:
                Intent register  = new Intent(this, RegisterActivity.class);
                startActivity(register);
                break;
        }
    }
}