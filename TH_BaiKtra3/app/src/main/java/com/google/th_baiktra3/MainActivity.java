package com.google.th_baiktra3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Model> items = new ArrayList<>();
    Adapter adapter;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listPhepTinh);

        items.add(new Model("Việt Nam","Đông Nam Á",R.drawable.img));
        items.add(new Model("Anh ","Châu Âu",R.drawable.img_1)) ;
        items.add(new Model("Nga","Châu Âu",R.drawable.img_2)) ;
        items.add(new Model("Pháp","Châu Âu",R.drawable.img_3)) ;
        items.add(new Model("Đức","Châu Âu",R.drawable.img_4));
        items.add(new Model("Mỹ","Châu Mỹ",R.drawable.img_5));


        adapter = new Adapter(MainActivity.this,items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, Detail.class);
                intent.putExtra("thuchien",i);
                startActivity(intent);
            }
        });
    }
}