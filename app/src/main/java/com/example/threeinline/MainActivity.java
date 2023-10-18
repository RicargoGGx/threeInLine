package com.example.threeinline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button salirj, iniciarJuegoj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciarJuegoj = (Button) findViewById(R.id.retry);
        iniciarJuegoj.setOnClickListener(this);
        salirj = (Button) findViewById(R.id.exit);


    }

    @Override
    public void onClick(View v) {

    }
}