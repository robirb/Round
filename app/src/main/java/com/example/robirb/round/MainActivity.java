package com.example.robirb.round;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    MyButton myButton;
    RelativeLayout root;

    RobiAdapter adapter;
    Student[] students = new Student[10];

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initItem();

        adapter = new RobiAdapter(this,students);

        root= (RelativeLayout) findViewById(R.id.root);
        recyclerView= (RecyclerView) findViewById(R.id.recyler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        //myButton=new MyButton(this);

        //root.addView(myButton);
    }

    private void initItem() {

        Student student = new Student("Sohel Ahmed","sohel.ahmed2189@gmail.com","34343",32);
        Student student1 = new Student("jrfhbkjerh Ahmed","sohel.eref@gmail.com","njmnb",43);
        Student student2 = new Student("nebmnfb Ahmed","sohel.dfdf@gmail.com","rfe",23);
        Student student3 = new Student("3e Ahmed","sohel.hukg@gmail.com","01741888888",454);
        Student student4 = new Student("Sohel Ahmed","sohel.yghbfg@gmail.com","vffvsd",64754);
        Student student5 = new Student("Sofdfhel Ahmed","sohel.ahmed2189@gmail.com","dewdwd",34);
        Student student6 = new Student("erw Ahmed","sohel.ahmed2189@gmail.com","erfgef",32);
        Student student7 = new Student("wed Ahmed","sohel.rwfe@gmail.com","elkefjlkjfe",32);
        Student student8 = new Student("sdk Ahmed","sohel.ahmed2189@gmail.com","jfh",32);
        Student student9 = new Student(",lkipo Ahmed","sohel.ahmed2189@gmail.com","01741888888",678);

        students[0]=student;
        students[1]=student1;
        students[2]=student2;
        students[3]=student3;
        students[4]=student4;
        students[5]=student5;
        students[6]=student6;
        students[7]=student7;
        students[8]=student8;
        students[9]=student9;


    }
}
