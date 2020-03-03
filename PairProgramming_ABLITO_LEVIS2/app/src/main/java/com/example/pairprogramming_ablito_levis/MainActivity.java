package com.example.pairprogramming_ablito_levis;



import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;
import android.widget.ArrayAdapter;
import android.app.Activity;
import java.util.List;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;



public class MainActivity extends ListActivity {

   private static final int SHOW_SUBACTIVITY = 1;
    ListView list;
   /* ArrayAdapter<String> test;
    public List<String> listl = new ArrayList<>();*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       list = this.getListView();
        //initializeList(listl);
        //Listener list
        //final ListView list = findViewById(R.id.list);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("6");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
        list.setAdapter(arrayAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = (String) list.getItemAtPosition(position);
                Bundle bundle = new Bundle();
                bundle.putInt("position", position);
                bundle.putString("name", item);
                Intent intent = new Intent(getApplicationContext(), pagina_4.class);
                intent.putExtras(bundle);
                startActivityForResult(intent, SHOW_SUBACTIVITY);
            }
        });


    }


    public void pagina_2(View view){
        startActivity(new Intent(this, pagina_2.class));
    }

   public void pagina_3(View view){

        startActivity(new Intent(this, pagina_3.class));
    }

    public void pagina_4(View view){
        startActivity(new Intent(this, pagina_4.class));
    }


}
