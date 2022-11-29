package com.google.th_baiktra3;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Detail extends AppCompatActivity {
    Button btnluungongu;
    ListView listluungonngu;
    EditText editTextngonngu;

    ArrayAdapter<String> adapter;
    ArrayList<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        btnluungongu = (Button) findViewById(R.id.btnLuu);
        listluungonngu = (ListView) findViewById(R.id.listLuu);
        editTextngonngu = (EditText) findViewById(R.id.txtnhapvidu);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        listluungonngu.setAdapter(adapter);
    }

    public void saveData(View view) {
        if (editTextngonngu.getText().toString().isEmpty()) {
            editTextngonngu.setError("Please enter text");
        } else {
            list.add(editTextngonngu.getText().toString());
            editTextngonngu.setText("");
            adapter.notifyDataSetChanged();
        }
    }
}