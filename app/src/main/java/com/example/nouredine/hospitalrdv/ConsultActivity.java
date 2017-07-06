package com.example.nouredine.hospitalrdv;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ConsultActivity extends AppCompatActivity {

    String[] elmts = {"08-07-2017 | 08H45","08-07-2017 | 08H45","08-07-2017 | 08H45","08-07-2017 | 08H45", "08-07-2017 | 09H30", "08-07-2017 | 10H00", "08-07-2017 | 08H30", "08-07-2017 | 15H30", "08-07-2017 | 16H30", "08-07-2017 | 09H00"};
    DBHandler db = new DBHandler(this);

    ListView lv_consult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consult);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        lv_consult = (ListView) findViewById(R.id.lv_cons);
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.list_element_apearence, R.id.tv_list_title, elmts);
        lv_consult.setAdapter(adapter);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rdvIntent = new Intent(ConsultActivity.this, NewRdvActivity.class);
                startActivity(rdvIntent);
                finish();
            }
        });



    }

}
