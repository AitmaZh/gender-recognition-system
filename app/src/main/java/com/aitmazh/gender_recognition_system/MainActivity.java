package com.aitmazh.gender_recognition_system;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * @author Zhasmina Aitmagambetova
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void passToFaceCheckPage(View view) {
        Intent i = new Intent(this, FaceCheckActivity.class);
        startActivity(i);
    }
    public void passToAuthPage(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}