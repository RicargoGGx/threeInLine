package com.example.threeinline;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button salirj, iniciarJuegoj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciarJuegoj = (Button) findViewById(R.id.startGame);
        iniciarJuegoj.setOnClickListener(this);
        salirj = (Button) findViewById(R.id.exit);
        salirj.setOnClickListener(this);
        salirj.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View salir){
                System.exit(0);
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.startGame:
                Intent segundaVentana = new Intent(MainActivity.this, Juego.class);
                startActivity(segundaVentana);
        }
    }
}