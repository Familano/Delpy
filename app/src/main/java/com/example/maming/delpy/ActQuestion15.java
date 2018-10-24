package com.example.maming.delpy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActQuestion15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_question15);

        final TextView page = (TextView)findViewById(R.id.AQuest15_TxtPage);
        final Button nextButton = (Button) findViewById(R.id.AQuest15_ButtonNext);
        final Button prevButton = (Button) findViewById(R.id.AQuest15_ButtonPrev);
        //untuk menuju pertanyaan berikutnya(16)
        nextButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActQuestion15.this, ActQuestion16.class);
                startActivity(intent);
            }
        });
        //untuk menuju pertanyaan sebelumnya(14)
        prevButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActQuestion15.this, ActQuestion14.class);
                startActivity(intent);
            }
        });
    }
}
