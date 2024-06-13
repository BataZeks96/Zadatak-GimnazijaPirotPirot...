package com.example.zad3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvGimnazija;
    TextView tvOdeljenje;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvGimnazija=(TextView)findViewById(R.id.Gimnazija);
        tvOdeljenje=(TextView)findViewById(R.id.Odeljenje);
    }
    public void odeljenjeClick(View view){
        tvOdeljenje.setText(tvOdeljenje.getText()+" III5");
    }

    public void gimnazijaClick(View view){
        tvGimnazija.setText(tvGimnazija.getText()+" Pirot");
    }
}