package com.example.pairprogramming_ablito_levis;

import android.os.Bundle;


import android.content.Intent;
import android.app.Activity;
import android.view.View;



public class pagina_4 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina_4);

    }

    public void pagina_2(View view){
        startActivity(new Intent(this, pagina_2.class));
    }}
