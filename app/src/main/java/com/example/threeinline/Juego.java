package com.example.threeinline;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Juego extends AppCompatActivity implements View.OnClickListener {

    int[] matriz = new int[9];
    ImageView uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve;
    boolean ganar, ganapc,notirar = false;
    int tiradas = 0, aleatorio = 0;
    private static int tu = 0, pc = 0, empate = 0;
    TextView marcador0, marcador1, marcador2;
    int jugador = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.juego);
        uno = (ImageView)findViewById(R.id.uno);
        dos = (ImageView)findViewById(R.id.dos);
        tres = (ImageView)findViewById(R.id.tres);
        cuatro = (ImageView)findViewById(R.id.cuatro);
        cinco = (ImageView)findViewById(R.id.cinco);
        seis = (ImageView)findViewById(R.id.seis);
        siete = (ImageView)findViewById(R.id.siete);
        ocho = (ImageView)findViewById(R.id.ocho);
        nueve = (ImageView)findViewById(R.id.nueve);

        marcador0 = (TextView) findViewById(R.id.marcador0);
        marcador1 = (TextView) findViewById(R.id.marcador1);
        marcador2 = (TextView) findViewById(R.id.empatesP);

        for(int i = 0; i<= 8; i++){
            matriz[i] = 0;
        }
        uno.setOnClickListener(this);
        dos.setOnClickListener(this);
        tres.setOnClickListener(this);
        cuatro.setOnClickListener(this);
        cinco.setOnClickListener(this);
        seis.setOnClickListener(this);
        siete.setOnClickListener(this);
        ocho.setOnClickListener(this);
        nueve.setOnClickListener(this);
        borrar();
        aleatorio = (int)(8*Math.random())+1;
        actualizarmarcador();

    }
    @Override
    public void onClick(View v) {
        boolean tiro = false;
        int viewId = v.getId();

        if (viewId == R.id.uno) {
            if (matriz[0] == 0 && jugador == 1) {
                uno.setImageResource(R.drawable.x);
                matriz[0] = 1;
                tiro = true;
            }
            if (matriz[0] == 0 && jugador == 2) {
                uno.setImageResource(R.drawable.o);
                matriz[0] = 2;
                tiro = true;
            }
        } else if (viewId == R.id.dos) {
            if (matriz[1] == 0 && jugador == 1) {
                dos.setImageResource(R.drawable.x);
                matriz[1] = 1;
                tiro = true;
            }
            if (matriz[1] == 0 && jugador == 2) {
                dos.setImageResource(R.drawable.o);
                matriz[1] = 2;
                tiro = true;
            }
        } else if (viewId == R.id.tres) {
            if (matriz[2] == 0 && jugador == 1) {
                tres.setImageResource(R.drawable.x);
                matriz[2] = 1;
                tiro = true;
            }
            if (matriz[2] == 0 && jugador == 2) {
                tres.setImageResource(R.drawable.o);
                matriz[2] = 2;
                tiro = true;
            }
        } else if (viewId == R.id.cuatro) {
            if (matriz[3] == 0 && jugador == 1) {
                cuatro.setImageResource(R.drawable.x);
                matriz[3] = 1;
                tiro = true;
            }
            if (matriz[3] == 0 && jugador == 2) {
                cuatro.setImageResource(R.drawable.o);
                matriz[3] = 2;
                tiro = true;
            }
        } else if (viewId == R.id.cinco) {
            if (matriz[4] == 0 && jugador == 1) {
                cinco.setImageResource(R.drawable.x);
                matriz[4] = 1;
                tiro = true;
            }
            if (matriz[4] == 0 && jugador == 2) {
                cinco.setImageResource(R.drawable.o);
                matriz[4] = 2;
                tiro = true;
            }
        } else if (viewId == R.id.seis) {
            if (matriz[5] == 0 && jugador == 1) {
                seis.setImageResource(R.drawable.x);
                matriz[5] = 1;
                tiro = true;
            }
            if (matriz[5] == 0 && jugador == 2) {
                seis.setImageResource(R.drawable.o);
                matriz[5] = 2;
                tiro = true;
            }
        } else if (viewId == R.id.siete) {
            if (matriz[6] == 0 && jugador == 1) {
                siete.setImageResource(R.drawable.x);
                matriz[6] = 1;
                tiro = true;
            }
            if (matriz[6] == 0 && jugador == 2) {
                siete.setImageResource(R.drawable.o);
                matriz[6] = 2;
                tiro = true;
            }
        } else if (viewId == R.id.ocho) {
            if (matriz[7] == 0 && jugador == 1) {
                ocho.setImageResource(R.drawable.x);
                matriz[7] = 1;
                tiro = true;
            }
            if (matriz[7] == 0 && jugador == 2) {
                ocho.setImageResource(R.drawable.o);
                matriz[7] = 2;
                tiro = true;
            }
        } else if (viewId == R.id.nueve) {
            if (matriz[8] == 0 && jugador == 1) {
                nueve.setImageResource(R.drawable.x);
                matriz[8] = 1;
                tiro = true;
            }
            if (matriz[8] == 0 && jugador == 2) {
                nueve.setImageResource(R.drawable.o);
                matriz[8] = 2;
                tiro = true;
            }
        }

        if (tiro == true) {
            if (jugador == 1) {
                jugador = 2;
            } else {
                jugador = 1;

            }
            tiradas++;
            quiengana();
            checa();
        }

    }

    public void borrar(){
        uno.setImageResource(R.drawable.black);
        dos.setImageResource(R.drawable.black);
        tres.setImageResource(R.drawable.black);
        cuatro.setImageResource(R.drawable.black);
        cinco.setImageResource(R.drawable.black);
        seis.setImageResource(R.drawable.black);
        siete.setImageResource(R.drawable.black);
        ocho.setImageResource(R.drawable.black);
        nueve.setImageResource(R.drawable.black);
        for(int i = 0; i<= 8;i++){
            matriz[i] = 0;
        }
        ganar = false;
        ganapc = false;
        tiradas = 0;
        aleatorio = (int)(8*Math.random())+1;
    }

    public void actualizarmarcador(){
        marcador0.setText("");
        marcador1.setText("");
        marcador2.setText("");
        String text1 = String.valueOf(tu);
        String text2 = String.valueOf(pc);
        String text3 = String.valueOf(empate);
        marcador0.setText(text1);
        marcador1.setText(text2);
        marcador2.setText(text3);
    }

    public void checa(){
        if(ganar == true){
            Toast toast = Toast.makeText(this,"Ha ganado Jugador 1",Toast.LENGTH_LONG);
            toast.show();
            tu++;
            reiniciarActivity(this);
        }
        if(ganapc == true){
            Toast toast = Toast.makeText(this,"Ha ganado Jugador 2",Toast.LENGTH_LONG);
            toast.show();
            pc++;
            reiniciarActivity(this);
        }
        if(tiradas == 9 && ganar == false && ganapc == false){
            Toast toast = Toast.makeText(this,"Ha sido un empate",Toast.LENGTH_LONG);
            toast.show();
            empate++;
            reiniciarActivity(this);
        }
    }
    public static void reiniciarActivity(Activity actividad){
        Intent intent =new Intent();
        intent.setClass(actividad, actividad.getClass());
        actividad.startActivity(intent);
        actividad.finish();
    }
    public void quiengana(){
        if (matriz[0] == 1 && matriz[1] ==1 && matriz[2] == 1 ){
            ganar =true;
        }
        if (matriz[3] == 1 && matriz[4] ==1 && matriz[5] == 1 ){
            ganar =true;
        }
        if (matriz[6] == 1 && matriz[7] ==1 && matriz[8] == 1 ){
            ganar =true;
        }
        if (matriz[0] == 1 && matriz[3] ==1 && matriz[6] == 1 ){
            ganar =true;
        }
        if (matriz[1] == 1 && matriz[4] ==1 && matriz[7] == 1 ){
            ganar =true;
        }
        if (matriz[2] == 1 && matriz[5] ==1 && matriz[8] == 1 ){
            ganar =true;
        }
        if (matriz[0] == 1 && matriz[4] ==1 && matriz[8] == 1 ){
            ganar =true;
        }
        if (matriz[2] == 1 && matriz[4] ==1 && matriz[6] == 1 ){
            ganar =true;
        }
        //ganador con 9 reglas con ceros

        if (matriz[0] == 2 && matriz[1] ==2 && matriz[2] == 2 ){
            ganapc =true;
        }
        if (matriz[3] == 2 && matriz[4] ==2 && matriz[5] == 2 ){
            ganapc =true;
        }
        if (matriz[6] == 2 && matriz[7] ==2 && matriz[8] == 2 ){
            ganapc =true;
        }
        if (matriz[0] == 2 && matriz[3] ==2 && matriz[6] == 2 ){
            ganapc =true;
        }
        if (matriz[1] == 2 && matriz[4] ==2 && matriz[7] == 2 ){
            ganapc =true;
        }
        if (matriz[2] == 2 && matriz[5] ==2 && matriz[8] == 2 ){
            ganapc =true;
        }
        if (matriz[0] == 2 && matriz[4] ==2 && matriz[8] == 2 ){
            ganapc =true;
        }
        if (matriz[2] == 2 && matriz[4] ==2 && matriz[6] == 2 ){
            ganapc =true;
        }
    }
}
