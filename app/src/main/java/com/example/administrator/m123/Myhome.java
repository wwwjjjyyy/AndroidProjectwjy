package com.example.administrator.m123;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
public class Myhome extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getSupportActionBar() !=null){
            getSupportActionBar().hide();
        }
        setContentView(R.layout.myhome);
    }
}
