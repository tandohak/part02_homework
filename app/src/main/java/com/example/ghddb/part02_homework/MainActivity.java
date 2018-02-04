package com.example.ghddb.part02_homework;

import android.content.Intent;
import android.media.FaceDetector;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mOnClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()){
            case  R.id.btn01 :
                intent.setClass(this,FaceBookActivity.class);
                break;
            case  R.id.btn02 :
                intent.setClass(this,BrunchAppActivity.class);
                break;
        }

        startActivity(intent);
    }
}
