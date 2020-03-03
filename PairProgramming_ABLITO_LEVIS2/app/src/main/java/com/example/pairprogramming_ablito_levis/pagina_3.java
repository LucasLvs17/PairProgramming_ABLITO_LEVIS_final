package com.example.pairprogramming_ablito_levis;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.LinearLayout;


public class pagina_3 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina_3);


    }

    public void pagina_1(View view){
        startActivity(new Intent(this, MainActivity.class));
    }

    public void pagina_2(View view){
        startActivity(new Intent(this, pagina_2.class));
    }
}
