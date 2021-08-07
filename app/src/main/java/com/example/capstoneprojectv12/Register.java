package com.example.capstoneprojectv12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

       final EditText edit_fullname = findViewById(R.id.EditTextFullName);
       final EditText edit_phonenum = findViewById(R.id.EditTextPhoneNum);
       final EditText edit_email = findViewById(R.id.EditTextRegisterEmail);
       final EditText edit_password = findViewById(R.id.EditTextPassword);
       final EditText edit_confirmpassword = findViewById(R.id.EditTextConfirmPassword);
       final EditText edit_address = findViewById(R.id.EditTextAddress);
       final EditText edit_zipcode = findViewById(R.id.EditTextZipCode);
       Button btn_register = findViewById(R.id.Btn_Register);
       CheckBox checkBox = findViewById(R.id.checkBox);

       DAOUser dao = new DAOUser();

        btn_register.setEnabled(checkBox.isChecked());

        checkBox.setOnCheckedChangeListener((arg0, isChecked) -> {
            if (isChecked){
                btn_register.setEnabled(true); // disable checkbox
            }else {
                btn_register.setEnabled(false);
            }
        });

       btn_register.setOnClickListener(v->
       {
           if (TextUtils.isEmpty(edit_fullname.getText())) {
               Toast.makeText(this, "Please Enter Your Full Name", Toast.LENGTH_SHORT).show();
           } else if (TextUtils.isEmpty(edit_phonenum.getText()) || edit_phonenum.getText().length() != 11) {
               Toast.makeText(this, "Please Enter Your Phone Number", Toast.LENGTH_SHORT).show();
           } else if (TextUtils.isEmpty(edit_email.getText())) {
               Toast.makeText(this, "Please Enter Your Email", Toast.LENGTH_SHORT).show();
           } else if (TextUtils.isEmpty(edit_password.getText())) {
               Toast.makeText(this, "Please Enter Your Password", Toast.LENGTH_SHORT).show();
           } else if (TextUtils.isEmpty(edit_confirmpassword.getText())) {
               Toast.makeText(this, "Please Enter Your Confirm Password", Toast.LENGTH_SHORT).show();
           } else if (TextUtils.isEmpty(edit_address.getText())) {
               Toast.makeText(this, "Please Enter Your Address", Toast.LENGTH_SHORT).show();
           } else if (TextUtils.isEmpty(edit_zipcode.getText())) {
               Toast.makeText(this, "Please Enter Your Zip Code", Toast.LENGTH_SHORT).show();
           } else if (!edit_password.getText().toString().trim().equals(edit_confirmpassword.getText().toString().trim())) {
               Toast.makeText(this, "The Password is Not Match", Toast.LENGTH_SHORT).show();
           } else {
               User users = new User(edit_fullname.getText().toString(), edit_phonenum.getText().toString(), edit_email.getText().toString(), edit_password.getText().toString(), edit_confirmpassword.getText().toString(), edit_address.getText().toString(), edit_zipcode.getText().toString());
               users.setPhonenum(edit_phonenum.getText().toString().trim());
               Toast.makeText(this, "" + users.getPhonenum(), Toast.LENGTH_SHORT).show();
               Toast.makeText(this, "Record is inserted", Toast.LENGTH_SHORT).show();
           }
           });
       }
}