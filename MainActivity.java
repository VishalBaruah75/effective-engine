package com.example.vishal.phonesicalcapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //The phone function then completes the connection of MainActivity class file with Phonebook class file with intent abstraction.
    public void phone(View v)
    {
        Intent intent= new Intent(MainActivity.this,Phonebook.class);
        startActivity(intent);
    }
    //The calc function then completes the connection of MainActivity class file with Calculator class file with intent abstraction.
    public void calc(View v) {
        Intent intent= new Intent(MainActivity.this,Calculator.class);
        startActivity(intent);
    }
    //The interest function then completes the connection of MainActivity class file with SimpleInterest class file with intent abstraction.
    public void interest(View v) {
        Intent intent = new Intent(MainActivity.this,SimpleInterest.class);
        startActivity(intent);
    }
}
