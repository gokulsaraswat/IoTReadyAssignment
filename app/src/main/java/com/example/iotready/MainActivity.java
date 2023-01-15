package com.example.iotready;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String Data[] = { "plu" , "chicken" , "curry cut tare" , "mrp" , "weight" ,"price" };
    String Values[] = {  "1" , "" , "5" ,  "299.0" ,"0" , "0"};

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.dataList);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter( getApplicationContext(), Data , Values);
        listView.setAdapter(customBaseAdapter);
    }
}