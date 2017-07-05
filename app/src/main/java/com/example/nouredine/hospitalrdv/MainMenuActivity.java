package com.example.nouredine.hospitalrdv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainMenuActivity extends AppCompatActivity {

    ImageView ivRdv, ivPatient, ivBil, ivFile, ivHelp, ivAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        ivRdv = (ImageView) findViewById(R.id.imageView);
        ivPatient = (ImageView) findViewById(R.id.imageView2);
        ivBil = (ImageView) findViewById(R.id.imageView3);
        ivFile = (ImageView) findViewById(R.id.imageView4);
        ivHelp = (ImageView) findViewById(R.id.imageView5);
        ivAbout = (ImageView) findViewById(R.id.imageView6);

        ivRdv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rdvIntent = new Intent(MainMenuActivity.this, NewRdvActivity.class);
                startActivity(rdvIntent);
                finish();
            }
        });
    }
}
