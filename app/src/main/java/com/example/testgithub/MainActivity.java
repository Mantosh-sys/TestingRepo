package com.example.testgithub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  String a = "Mantosh";
  String b = "Shiva";
  String c = "Ganesh";
  String D = "Kartike";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"Waoo",Toast.LENGTH_LONG).show();
    }
}