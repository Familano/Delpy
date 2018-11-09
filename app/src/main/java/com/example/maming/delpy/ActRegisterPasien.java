package com.example.maming.delpy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;
import java.util.HashMap;

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
                String.format(tgllahir, new DateFormat());
                String emailaddress = String.valueOf(emailAddress.getText());
                String password = String.valueOf(passWord.getText());
                // pasienLabel.setText("fullName " + fullname +"tglLahir " + tgllahir +"Email " + emailaddress + " Pass " + password);
                HashMap<String, String> params = new HashMap<>();
                params.put("nama", fullname);
                params.put("tgl_lahir", tgllahir);
                params.put("email", emailaddress);
                params.put("password", password);

                RequestHandler request = new RequestHandler();
                String result = request.sendPostRequest(APIPasien.URL_REGISTER_PASIEN, params);
                pasienLabel.setText(params.toString());
            }
        });
    }
}
