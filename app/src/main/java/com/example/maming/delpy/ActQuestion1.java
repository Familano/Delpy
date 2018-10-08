package com.example.maming.delpy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActQuestion1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_question1);

        final TextView page = (TextView)findViewById(R.id.AQuest1_TxtPage);
        final Button nextButton = (Button) findViewById(R.id.AQuest1_ButtonNext);

        //untuk menuju pertanyaan berikutnya(2)
        nextButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActQuestion1.this, ActQuestion2.class);
                startActivity(intent);
            }
        });
    }
}
