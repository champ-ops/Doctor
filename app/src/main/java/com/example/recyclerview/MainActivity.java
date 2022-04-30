package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.github.javafaker.Faker;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[],s2[];

    int[] images = {R.drawable.d1,R.drawable.d2,R.drawable.d3,
            R.drawable.d4,R.drawable.d5,R.drawable.d6,
            R.drawable.d9,R.drawable.d8,R.drawable.d7,
            R.drawable.d10,R.drawable.d11};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_doctors);

        s1 = getResources().getStringArray(R.array.names);
        s2 = getResources().getStringArray(R.array.roles);

        DoctorAdapter doctorAdapter = new DoctorAdapter(this,s1,s2,images);
        recyclerView.setAdapter(doctorAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

     }

     public void click(View view){
        ImageButton callButton = findViewById(R.id.phoneCall);
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+996555555555"));
        startActivity(intent);
     }

}