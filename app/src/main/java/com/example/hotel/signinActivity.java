package com.example.hotel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class signinActivity extends AppCompatActivity {

    EditText enterUsername = null,enterPassword = null;
    Button submit;
    String txtUser,txtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);



        //sign in code check username and password
        submit = (Button) findViewById(R.id.submitBtn);
        enterUsername = (EditText) findViewById(R.id.usernameTxtLogin);
        enterPassword = (EditText) findViewById(R.id.passwordTxtLogin);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Users> us = Users.listAll(Users.class);
                String user,pass;
                txtUser = enterUsername.getText()+"";
                txtPass = enterPassword.getText()+"";

                for(Users i:us){
                    user = i.getUserName();
                    pass = i.getPassword();

                    if( user.equals(txtUser) && pass.equals(txtPass) ){
                        Intent intent = new Intent(signinActivity.this,hotel.class);
                        intent.putExtra("username",i.getUserName()+"");
                        startActivity(intent);
                    }

                }
            }
        });


        //go to sign up page
        final TextView signUp = (TextView) findViewById(R.id.gotoSignUp);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signinActivity.this,signupActivity.class);
                startActivity(intent);
            }
        });

    }
}
