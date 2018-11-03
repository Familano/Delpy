package com.example.maming.delpy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ActRegisterDokter extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_registerdokter);
        final TextView dokterLabel = (TextView) findViewById(R.id.ARDok_TxtDokter);
        final EditText fullName = (EditText) findViewById(R.id.ARDok_TxfFullName);
        final EditText NPID = (EditText) findViewById(R.id.ARDok_TxfNPID);
        final EditText emailAddress = (EditText) findViewById(R.id.ARDok_TxfEmail);
        final EditText passWord = (EditText)findViewById(R.id.ARDok_TxfPassword);
        final Button daftarButton = (Button) findViewById(R.id.ARDok_BtnDaftar);
        daftarButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String fullname = String.valueOf(fullName.getText());
                String npid = String.valueOf(NPID.getText());
                String emailaddress = String.valueOf(emailAddress.getText());
                String password = String.valueOf(passWord.getText());
                //dokterLabel.setText("fullName " + fullname +"tglLahir " + npid +"Email " + emailaddress + " Pass " + password);

                ApiDokterRequest dokterRequest = RetroServer.getClient().create(ApiDokterRequest.class);
                Call<ModelResponseRegister> registerDokter = dokterRequest.getResponse(fullname,npid,emailaddress,password);
                registerDokter.enqueue(new Callback<ModelResponseRegister>() {
                    @Override
                    public void onResponse(Call<ModelResponseRegister> call, Response<ModelResponseRegister> response) {
                        Log.v("RegisterData", "On Response");
                        Intent intent = new Intent(ActRegisterDokter.this, ActHomePasien.class);
                        startActivity(intent);
                    }

                    @Override
                    public void onFailure(Call<ModelResponseRegister> call, Throwable t) {
                        Log.v("RegisterData", "On Failure");
                    }
                });
            }
        });
    }
}