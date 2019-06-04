package com.example.administrator.m123;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import tool.SendGet;

import static tool.StringDeal.StringDeal;

public class MainActivity extends AppCompatActivity{
    ImageButton myhome,download,homepage,vip;
    TextView txt;
    Button btn_movie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(getSupportActionBar() !=null){
            getSupportActionBar().hide();
        }
        homepage=(ImageButton)findViewById(R.id.homepage2);
        vip=(ImageButton)findViewById(R.id.vip);
        download=(ImageButton)findViewById(R.id.download);
        myhome=(ImageButton)findViewById(R.id.myhome);
        btn_movie = (Button)findViewById(R.id.movie);

        homepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Myhome.class);
                startActivity(intent);
            }
        });
        vip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Myhome.class);
                startActivity(intent);
            }
        });
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Myhome.class);
                startActivity(intent);
            }
        });
        myhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Myhome.class);
                startActivity(intent);
            }
        });

        btn_movie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Movie.class);
                startActivity(intent);
            }
        });
    }
//    private void send(){
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    String s = SendGet.SendGet("/QueryServlet/vedio01", "vid=1");
//                    txt.setText(s);
//                    String[] ss = StringDeal(s);
//                    for(int i = 0;i < ss.length;i++){
//                        System.out.println(ss[i]);
//                        txt.append(ss[i]);
//                    }
//                } catch (Exception e) {
//                    //txt.append("出错！");
//                    e.printStackTrace();
//                }
//            }
//        }).start();
}
