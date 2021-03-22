package com.example.awewewe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText igemail;
    EditText sandi;
    Button Masuk;
    Button masukfb;
    Button daftar;
    Button pelajariselengkapnya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        igemail = (EditText)findViewById(R.id.igemail);
        sandi = (EditText)findViewById(R.id.sandi);
        Masuk = (Button)findViewById(R.id.Masuk);
        daftar = (Button)findViewById(R.id.daftar);
        masukfb = (Button)findViewById(R.id.masukfb);
        pelajariselengkapnya = (Button)findViewById(R.id.pelajariselengkapnya);
        Masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = igemail.getText().toString();
                String password = sandi.getText().toString();
                if (email.equalsIgnoreCase("alifsyahputra@gmail.com")
                        && password.equalsIgnoreCase("2012tidakjadikiamat")){
                    Toast.makeText(MainActivity.this, "Sukses Login", Toast.LENGTH_SHORT).show();
                    Intent move = new Intent(MainActivity.this , login.class);
                    startActivity(move);
                }else {
                    Toast.makeText(MainActivity.this, "Gagal Login euy , coba di cek lagi !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        masukfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move = new Intent(MainActivity.this , fb.class);
                startActivity(move);
            }
        });
        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move = new Intent(MainActivity.this , daftar.class);
                startActivity(move);
            }
        });
        pelajariselengkapnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move = new Intent(  MainActivity.this , pelajariselngkapnya.class);
                startActivity(move);
            }
        });
    }
}