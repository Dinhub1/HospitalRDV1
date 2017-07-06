package com.example.nouredine.hospitalrdv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    Button btnConnect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnConnect = (Button) findViewById(R.id.button);

        btnConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rdvIntent = new Intent(LoginActivity.this, MainMenuActivity.class);
                startActivity(rdvIntent);
            }
        });

    }
}
