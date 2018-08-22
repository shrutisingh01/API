package com.articleaggregator;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class PasswordActivity extends AppCompatActivity {

    private EditText passwordEmail;
    private Button resetPassword;
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);

        passwordEmail = (EditText)findViewById(R.id.etPasswordEmail);
        resetPassword = (Button)findViewById(R.id.etPasswordReset);
        mAuth = FirebaseAuth.getInstance();


        resetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               String userEmail = passwordEmail.getText().toString().trim();

               if(userEmail.equals("")){

                   Toast.makeText(PasswordActivity.this,"Please enter your registered email ID", Toast.LENGTH_SHORT).show();
               }else{

                   mAuth.sendPasswordResetEmail(userEmail).addOnCompleteListener(new OnCompleteListener<Void>() {
                       @Override
                       public void onComplete(@NonNull Task<Void> task) {

                           if(task.isSuccessful()){

                               Toast.makeText(PasswordActivity.this,"Password reset email sent!", Toast.LENGTH_SHORT).show();
                               finish();
                               startActivity(new Intent(PasswordActivity.this,MainActivity.class));
                           }

                           else{

                               Toast.makeText(PasswordActivity.this,"Error in sending password reset email", Toast.LENGTH_SHORT).show();

                           }

                       }
                   });
               }

            }
        });

    }
}
