package com.dream.zakatcalculatorhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Home_Page_Activity extends AppCompatActivity {

    ImageView zakatsom,zakathisab;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

    zakatsom=findViewById(R.id.zakatsom);
    zakathisab=findViewById(R.id.zakathisa);



   zakatsom.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {


           Intent mainIntent = new Intent(Home_Page_Activity.this, Zakat_somporke.class);
           startActivity(mainIntent);


       }
   });

        zakathisab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent mainIntent = new Intent(Home_Page_Activity.this, Zakat_hisab.class);
                startActivity(mainIntent);


            }
        });





    }
}