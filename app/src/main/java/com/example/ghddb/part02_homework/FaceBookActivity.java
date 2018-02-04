package com.example.ghddb.part02_homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FaceBookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face_book);
    }

    public void okClick(View view) {
        Toast.makeText(this, R.string.okBtnClick, Toast.LENGTH_SHORT).show();
    }
}
