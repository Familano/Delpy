package com.example.maming.delpy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActQuestion8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_question8);

        final TextView page = (TextView)findViewById(R.id.AQuest8_TxtPage);
        final Button nextButton = (Button) findViewById(R.id.AQuest8_ButtonNext);
        final Button prevButton = (Button) findViewById(R.id.AQuest8_ButtonPrev);
        //untuk menuju pertanyaan berikutnya(9)
        nextButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActQuestion8.this, ActQuestion9.class);
                startActivity(intent);
            }
        });
        //untuk menuju pertanyaan sebelumnya(7)
        prevButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActQuestion8.this, ActQuestion7.class);
                startActivity(intent);
            }
        });
    }
}
