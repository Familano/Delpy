package com.example.maming.delpy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActRegisterPasien extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_registerpasien);
        final TextView pasienLabel = (TextView) findViewById(R.id.txtPasien);
        final EditText fullName = (EditText) findViewById(R.id.txfFullName);
        final EditText tglLahir = (EditText) findViewById(R.id.txfTglLahir);
        final EditText emailAddress = (EditText) findViewById(R.id.txfEmail);
        final EditText passWord = (EditText)findViewById(R.id.txfPassword);
        final Button daftarButton = (Button) findViewById(R.id.btnDaftar);
        daftarButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String fullname = String.valueOf(fullName.getText());
                String tgllahir = String.valueOf(tglLahir.getText());
                String emailaddress = String.valueOf(emailAddress.getText());
                String password = String.valueOf(passWord.getText());
                pasienLabel.setText("fullName " + fullname +"tglLahir " + tgllahir +"Email " + emailaddress + " Pass " + password);
            }
        });
    }
}
