package com.example.maming.delpy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterDokter extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signupdok);
        final TextView dokterLabel = (TextView) findViewById(R.id.txtDokter);
        final EditText fullName = (EditText) findViewById(R.id.txfFullName);
        final EditText NPID = (EditText) findViewById(R.id.txfNPID);
        final EditText emailAddress = (EditText) findViewById(R.id.txfEmail);
        final EditText passWord = (EditText)findViewById(R.id.txfPassword);
        final Button daftarButton = (Button) findViewById(R.id.btnDaftar);
        daftarButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String fullname = String.valueOf(fullName.getText());
                String npid = String.valueOf(NPID.getText());
                String emailaddress = String.valueOf(emailAddress.getText());
                String password = String.valueOf(passWord.getText());
                dokterLabel.setText("fullName " + fullname +"tglLahir " + npid +"Email " + emailaddress + " Pass " + password);
            }
        });
    }
}