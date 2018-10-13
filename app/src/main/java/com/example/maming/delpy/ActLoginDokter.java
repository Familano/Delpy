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

public class ActLoginDokter extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_logindokter);
        final Button pasienButton = (Button) findViewById(R.id.ALDok_BtnPasien);
        final Button dokterButton = (Button) findViewById(R.id.ALDok_BtnDokter);
        final EditText emailLogin = (EditText) findViewById(R.id.ALDok_TxfEmail);
        final EditText passLogin = (EditText)findViewById(R.id.ALDok_TxfPassword);
        final Button loginButton = (Button) findViewById(R.id.ALDok_BtnLogin);
        final TextView lupaPass = (TextView)findViewById(R.id.ALDok_TxtLupaPassword);
        final Button daftarButton = (Button) findViewById(R.id.ALDok_BtnDaftar);

        // Function for button Pasien when onClick
        pasienButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActLoginDokter.this, ActLoginPasien.class);
                startActivity(intent);
            }
        });

        // Function for button Dokter when onClick
        dokterButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActLoginDokter.this, ActLoginDokter.class);
                startActivity(intent);
            }
        });

        // Function for button Login when onClick
        loginButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String emaillogin = String.valueOf(emailLogin.getText());
                String passlogin = String.valueOf(passLogin.getText());
                lupaPass.setText("Email " + emaillogin + " Pass " + passlogin);
            }
        });

        // Function for button Daftar when onClick
        daftarButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                setContentView(R.layout.act_registerdokter);
            }
        });
    }
}
