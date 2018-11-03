package com.example.maming.delpy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ActLoginPasien extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_loginpasien);
        final Button pasienButton = (Button) findViewById(R.id.ALPas_BtnPasien);
        final Button dokterButton = (Button) findViewById(R.id.ALPas_BtnDokter);
        final EditText emailLogin = (EditText) findViewById(R.id.ALPas_TxfEmail);
        final EditText passLogin = (EditText)findViewById(R.id.ALPas_TxfPassword);
        final Button loginButton = (Button) findViewById(R.id.ALPas_BtnLogin);
        final TextView lupaPass = (TextView)findViewById(R.id.ALPas_TxtLupaPassword);
        final Button daftarButton = (Button) findViewById(R.id.ALPas_BtnDaftar);

        // Function for button Pasien when onClick
        pasienButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActLoginPasien.this, ActLoginPasien.class);
                startActivity(intent);
            }
        });

        // Function for button Dokter when onClick
        dokterButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActLoginPasien.this, ActLoginDokter.class);
                startActivity(intent);
            }
        });

        // Function for button Login when onClick
        loginButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String emaillogin = String.valueOf(emailLogin.getText());
                String passlogin = String.valueOf(passLogin.getText());

                ApiPasienRequest pasienRequest = RetroServer.getClient().create(ApiPasienRequest.class);
                final Call<ModelResponseLogin> userCall = pasienRequest.login(emaillogin,passlogin);
                userCall.enqueue(new Callback<ModelResponseLogin>() {
                    @Override
                    public void onResponse(Call<ModelResponseLogin> call, Response<ModelResponseLogin> response) {
                        Log.v("LoginData", "On Response");
                        Intent intent = new Intent(ActLoginPasien.this, ActHomePasien.class);
                        startActivity(intent);
                    }
                    @Override
                    public void onFailure(Call<ModelResponseLogin> call, Throwable t) {
                        Log.v("LoginData", "On Failure");
                        Intent intent = new Intent(ActLoginPasien.this, ActRegisterPasien.class);
                        startActivity(intent);
                    }
                });

            }
        });

        // Function for button Daftar when onClick
        daftarButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActLoginPasien.this, ActRegisterPasien.class);
                startActivity(intent);
            }
        });
    }
}
