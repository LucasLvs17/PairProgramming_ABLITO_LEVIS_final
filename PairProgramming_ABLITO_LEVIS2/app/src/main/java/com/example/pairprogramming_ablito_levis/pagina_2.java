package com.example.pairprogramming_ablito_levis;

        import android.os.Bundle;


        import android.content.Intent;
        import android.os.Bundle;
        import android.app.Activity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;


public class pagina_2 extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina_2);

    }
    public void pagina_3(View view){
        startActivity(new Intent(this, pagina_3.class));
    }

}
