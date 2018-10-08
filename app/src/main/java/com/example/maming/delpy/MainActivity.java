package com.example.maming.delpy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button pasienButton = (Button) findViewById(R.id.btnPasien);
        final Button dokterButton = (Button) findViewById(R.id.btnDokter);
        final Button loginButton = (Button) findViewById(R.id.btnLogin);
        final TextView lupaPass = (TextView)findViewById(R.id.txtLupaPassword);
        final Button daftarButton = (Button) findViewById(R.id.btnDaftar);
        pasienButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        dokterButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, LoginDokter.class);
                startActivity(intent);
            }
        });
        loginButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
               /* String emaillogin = String.valueOf(findViewById(R.id.txfEmail));
                String passlogin = String.valueOf(findViewById(R.id.txfPassword));
                lupaPass.setText("email " + emaillogin + " , password " + passlogin);*/
                Intent intent = new Intent(MainActivity.this, ActQuestion1.class);
                startActivity(intent);
            }
        });
        daftarButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, RegisterPasien.class);
                startActivity(intent);
            }
        });
    }
}
