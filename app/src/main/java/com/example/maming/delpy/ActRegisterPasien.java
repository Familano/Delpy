package com.example.maming.delpy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ActRegisterPasien extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_registerpasien);
        final TextView pasienLabel = (TextView) findViewById(R.id.ARPas_TxtPasien);
        final EditText fullName = (EditText) findViewById(R.id.ARPas_TxfFullName);
        final EditText tglLahir = (EditText) findViewById(R.id.ARPas_TxfTglLahir);
        final EditText emailAddress = (EditText) findViewById(R.id.ARPas_TxfEmail);
        final EditText passWord = (EditText)findViewById(R.id.ARPas_TxfPassword);
        final Button daftarButton = (Button) findViewById(R.id.ARPas_BtnDaftar);
        daftarButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String fullname = String.valueOf(fullName.getText());
                String tgllahir = String.valueOf(tglLahir.getText());
                String emailaddress = String.valueOf(emailAddress.getText());
                String password = String.valueOf(passWord.getText());
                //pasienLabel.setText("fullName " + fullname +"tglLahir " + tgllahir +"Email " + emailaddress + " Pass " + password);

                //POST data Register
                ApiPasienRequest pasienRequest = RetroServer.getClient().create(ApiPasienRequest.class);
                Call<ModelResponseRegister> registerPasien = pasienRequest.register(fullname,tgllahir,emailaddress,password);
                registerPasien.enqueue(new Callback<ModelResponseRegister>() {
                    @Override
                    public void onResponse(Call<ModelResponseRegister> call, Response<ModelResponseRegister> response) {
                        Log.v("RegisterData", "On Response");
                        if (response.code()==200){
                            ModelResponseRegister responseRegister = response.body();
                            if (responseRegister.getError()){
                                // event ketika gagal
                                Toast.makeText(ActRegisterPasien.this, "Gagal Registrasi : " + responseRegister.getMessage(), Toast.LENGTH_SHORT).show();
                            }else{
                                // event ketika berhasil
                                Intent intent = new Intent(ActRegisterPasien.this, ActQuestion1.class);
                                startActivity(intent);
                            }
                        }else{
                            Toast.makeText(ActRegisterPasien.this, "Gagal Registrasi : " + response.message(), Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<ModelResponseRegister> call, Throwable t) {
                        Log.v("LoginData", "On Failure");
                        Toast.makeText(ActRegisterPasien.this, "Gagal menghubungkan ke server", Toast.LENGTH_SHORT).show();
                    }
                });
                //END
            }
        });
    }
}
