package com.example.tekber_helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int naik = 0;
    Button btnhitung, btntoast, hbd;
    TextView texthasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btntoast = findViewById(R.id.btntoast);
        btnhitung = findViewById(R.id.btnhitung);
        texthasil = findViewById(R.id.texthasil);
        hbd = findViewById(R.id.hbd);

        btntoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hello Toast!", Toast.LENGTH_SHORT).show();
            }
        });

        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naik ++;
                texthasil.setText(Integer.toString(naik));
            }
        });

        hbd = (Button)findViewById(R.id.hbd);
        hbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, happybirthday.class);
                startActivity(a);
            }
        });
    }
}
