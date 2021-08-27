package com.example.hotel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        final EditText firstname = (EditText) findViewById(R.id.nameTxtLogin);
        final EditText surname = (EditText) findViewById(R.id.familyNameTxtLogin);
        final EditText username = (EditText) findViewById(R.id.usernameTxtlogin);
        final EditText homephone = (EditText) findViewById(R.id.homephoneTxtLogin);
        final EditText mobile = (EditText) findViewById(R.id.mobilephoneTxtLogin);
        final EditText address = (EditText) findViewById(R.id.addressTxtLogin);
        final EditText email = (EditText) findViewById(R.id.emailTxtLogin);
        final EditText birthCertification = (EditText) findViewById(R.id.certificateTxtLogin);
        final EditText password = (EditText) findViewById(R.id.passwordTxtLogin);
        final Button b = findViewById(R.id.enterBtn);

        //sign up button --> after sign up we intent u to sign in page
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Users u = new Users(firstname.getText().toString(),surname.getText().toString(),username.getText().toString(),mobile.getText().toString(),homephone.getText().toString(),address.getText().toString(),birthCertification.getText().toString(),email.getText().toString(),password.getText().toString());
                Users.save(u);


            Intent intent = new Intent(signupActivity.this,signinActivity.class);
            startActivity(intent);
            }
        });


    }

    /*public void submitClick(View v){

        //Users u = new Users(firstname.getText().toString(),surname.getText().toString(),username.getText().toString(),mobile.getText().toString(),homephone.getText().toString(),address.getText().toString(),birthCertification.getText().toString(),email.getText().toString(),password.getText().toString());
        Users u;
        u = new Users("1","1","1","1","1","1","1","1","1");
        u.save();

        Intent intent = new Intent(signupActivity.this,signinActivity.class);
        startActivity(intent);
    }*/
}
