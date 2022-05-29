package com.aitmazh.gender_recognition_system;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * @author Zhasmina Aitmagambetova
 */
public class DocAuthActivity extends AppCompatActivity {
    private ImageView imageView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_auth);
    }

    public void passToAuthPage(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void passToFaceCheckPage(View view) {
        Intent i = new Intent(this, FaceCheckActivity.class);
        startActivity(i);
    }
}