package com.aitmazh.gender_recognition_system;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * @author Zhasmina Aitmagambetova
 */
public class SignUpActivity extends AppCompatActivity {

    EditText suInsertEmail;
    EditText suInsertPassword;
    EditText suCheckPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        suInsertEmail = (EditText) findViewById(R.id.insertEmail);
        suInsertPassword = (EditText) findViewById(R.id.insertPassword);
        suCheckPassword = (EditText) findViewById(R.id.checkPassword);
    }

    public void passToAuthPage(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}