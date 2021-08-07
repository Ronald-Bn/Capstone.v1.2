package com.example.capstoneprojectv12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayUser extends AppCompatActivity {

    TextView setTextFullName, setTextPhoneNum, setTextEmail, setTextPassword, setTextAddress, setTextZipCode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_user);

        Intent intent = getIntent();
        String str = intent.getStringExtra("phone");
        setTextFullName = findViewById(R.id.SetTextFullName);
        setTextPhoneNum = findViewById(R.id.SetTextPhoneNum);
        setTextEmail = findViewById(R.id.SetTextEmail);
        setTextPassword = findViewById(R.id.SetTextPassword);
        setTextAddress = findViewById(R.id.SetTextAddress);
        setTextZipCode = findViewById(R.id.SetTextZipCode);

        User user = new User();
        String phone = user.getPhonenum();
        Toast.makeText(this, ""+ str, Toast.LENGTH_SHORT).show();
        setTextFullName.setText(user.getFullname());
        setTextPhoneNum.setText(user.getPhonenum());

    }
}