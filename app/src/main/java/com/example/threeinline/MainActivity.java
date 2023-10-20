package com.example.threeinline;

import androidx.appcompat.app.AppCompatActivity;

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

        iniciarJuegoj = findViewById(R.id.startGame);
        iniciarJuegoj.setOnClickListener(this);
        salirj = findViewById(R.id.exit);
        salirj.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.startGame) {
            Intent segundaVentana = new Intent(MainActivity.this, Juego.class);
            startActivity(segundaVentana);
        } else if (v.getId() == R.id.exit) {
            finish();
        }
    }

}
