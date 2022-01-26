package com.example.firebase_authentication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ResetPassword extends AppCompatActivity {

      /*This is reset password activity

        here firebase reset password codes.
    */

    private EditText registeredEmailEditText;
    private TextView resetInfoTextView;
    private Button resetPassButton;
    private FirebaseAuth mAuth;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        registeredEmailEditText = findViewById(R.id.registeredEmailEditTextId);
        resetPassButton = findViewById(R.id.resetPassButtonId);
        resetInfoTextView = findViewById(R.id.resetInfoTextView);
        progressBar = findViewById(R.id.progressbarId);
        mAuth = FirebaseAuth.getInstance();

        resetPassButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resetPassword();

            }
        });



    }

    private void resetPassword() {

        String email = registeredEmailEditText.getText().toString();
        progressBar.setVisibility(View.VISIBLE);

        mAuth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {

                if (task.isSuccessful()){
                    progressBar.setVisibility(View.GONE);
                    resetInfoTextView.setVisibility(View.VISIBLE);
                    Toast.makeText(getApplicationContext(), "Password Reset Email ", Toast.LENGTH_SHORT).show();
                    resetInfoTextView.setText("Check your email. Reset Password Has Been Sent On "+email);
                    resetPassButton.setEnabled(false);

                }else {
                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(getApplicationContext(), "Something Went Wrong ", Toast.LENGTH_SHORT).show();

                }

            }
        });

    }
}