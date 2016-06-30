package com.example.vishal.phonesicalcapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity1 extends AppCompatActivity {
//onCreate(Bundle) is where you initialize your activity.
// When Activity is started and application is not loaded, then both onCreate() methods will be called.
// But for subsequent starts of Activity , the onCreate() of application will not be called
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }
//The showme function then completes the connection of Mainactivity1 with MainActivity with intent.
// An intent is an abstract description of an operation to be performed

    public void showme(View v){
        Intent intent = new Intent(MainActivity1.this,MainActivity.class);
        startActivity(intent);

    }

}
