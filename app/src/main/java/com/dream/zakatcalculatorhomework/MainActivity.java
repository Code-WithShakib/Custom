package com.dream.zakatcalculatorhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnclick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


 // Remove the status bar.........................................................

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

// status bar end........................................................................


// splash screen code start......................................................................

        /****** Create Thread that will sleep for 5 seconds****/
        Thread background = new Thread() {
            public void run() {
                try {
                    // Thread will sleep for 5 seconds
                    sleep(5*1000);

                    // After 5 seconds redirect to another intent
                    Intent i=new Intent(getBaseContext(),Home_Page_Activity.class);
                    startActivity(i);

                    //Remove activity
                    finish();
                } catch (Exception e) {
                }
            }
        };
        // start thread
        background.start();

// splash screen code end......................................................................

     // butoon on click listener start now.....................................................


        btnclick=findViewById(R.id.btnclick);

        btnclick.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Intent int1 = new Intent(MainActivity.this, Home_Page_Activity.class);
        startActivity(int1);

    }
});


 // button on click listener end now.....................................................................




    }
}