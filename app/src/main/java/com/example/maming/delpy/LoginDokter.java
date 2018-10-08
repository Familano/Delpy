package com.example.maming.delpy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by maming on 10/1/2018.
 */

public class LoginDokter extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logindokter);
        final Button pasienButton = (Button) findViewById(R.id.btnPasien);
        final Button dokterButton = (Button) findViewById(R.id.btnDokter);
        final EditText emailLogin = (EditText) findViewById(R.id.txfEmail);
        final EditText passLogin = (EditText)findViewById(R.id.txfPassword);
        final Button loginButton = (Button) findViewById(R.id.btnLogin);
        final TextView lupaPass = (TextView)findViewById(R.id.txtLupaPassword);
        final Button daftarButton = (Button) findViewById(R.id.btnDaftar);

        // Ini untuk tombol pasien kalau di click
        pasienButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(LoginDokter.this, MainActivity.class);
                startActivity(intent);
            }
        });
        dokterButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(LoginDokter.this, LoginDokter.class);
                startActivity(intent);
            }
        });
        loginButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String emaillogin = String.valueOf(emailLogin.getText());
                String passlogin = String.valueOf(passLogin.getText());
                lupaPass.setText("Email " + emaillogin + " Pass " + passlogin);
            }
        });
        daftarButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                setContentView(R.layout.signupdok);
            }
        });
    }
}
