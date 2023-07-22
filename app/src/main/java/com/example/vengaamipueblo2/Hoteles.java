package com.example.vengaamipueblo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hoteles extends AppCompatActivity {

    Button botonhotel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);

        botonhotel=findViewById(R.id.botonvermashoteles);
        botonhotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hoteles.this,ListaHoteles.class);
                startActivity(intent);
            }
        });
    }
}