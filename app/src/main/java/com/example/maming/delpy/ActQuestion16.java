package com.example.maming.delpy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActQuestion16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_question16);

        final TextView page = (TextView)findViewById(R.id.AQuest16_TxtPage);
        final Button nextButton = (Button) findViewById(R.id.AQuest16_ButtonNext);
        final Button prevButton = (Button) findViewById(R.id.AQuest16_ButtonPrev);
        //untuk menuju pertanyaan berikutnya(17)
        nextButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActQuestion16.this, ActQuestion17.class);
                startActivity(intent);
            }
        });
        //untuk menuju pertanyaan sebelumnya(15)
        prevButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActQuestion16.this, ActQuestion15.class);
                startActivity(intent);
            }
        });
    }
}
