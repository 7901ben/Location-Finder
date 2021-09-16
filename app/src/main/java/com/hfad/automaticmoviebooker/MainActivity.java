package com.hfad.automaticmoviebooker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
 Button buttonCheckYourLocation ;
 Button buttonDone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonCheckYourLocation = findViewById(R.id.buttonCheckYourLocation);
        buttonCheckYourLocation.setOnClickListener(this);
        buttonDone = findViewById(R.id.buttonDone);
        buttonDone.setOnClickListener(this);
    }//on create

    @Override
    public void onClick(View v) {
      switch (v.getId()){
          case R.id.buttonCheckYourLocation:{
              Log.i("info", "buttonCheckYourLocation works");
              Intent intent = new Intent(MainActivity.this,MapsActivity.class);
              startActivity(intent);
              break;
          }
          case R.id.buttonDone:{
              Toast.makeText(MainActivity.this,"Done",Toast.LENGTH_SHORT).show();
          break;
          }
        }
    }//on click
} // mainactivity