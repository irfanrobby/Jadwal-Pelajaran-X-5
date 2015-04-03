package com.irfanrobby.jadwalpelajaran;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button senin = (Button) findViewById(R.id.button1);
        final Button selasa = (Button) findViewById(R.id.button2);
        final Button rabu = (Button) findViewById(R.id.button3);
        final Button kamis = (Button) findViewById(R.id.button4);
        final Button jumat = (Button) findViewById(R.id.button5);
        final Button sabtu = (Button) findViewById(R.id.button6);


        senin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent Senin = new Intent(MainActivity.this, Senin.class);
                startActivity(Senin);
            }
        });

        selasa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent selasa = new Intent(MainActivity.this, Selasa.class);
                startActivity(selasa);
            }
        });

        rabu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent rabu = new Intent(MainActivity.this, Rabu.class);
                startActivity(rabu);
            }
        });

        kamis.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent kamis = new Intent(MainActivity.this, Kamis.class);
                startActivity(kamis);
            }
        });

        jumat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent jumat = new Intent(MainActivity.this, Jumat.class);
                startActivity(jumat);
            }
        });

        sabtu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent sabtu = new Intent(MainActivity.this, Sabtu.class);
                startActivity(sabtu);
            }
        });

    }
}