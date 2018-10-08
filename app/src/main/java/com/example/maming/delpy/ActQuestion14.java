package com.example.maming.delpy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActQuestion14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_question14);

        final TextView page = (TextView)findViewById(R.id.AQuest14_TxtPage);
        final Button nextButton = (Button) findViewById(R.id.AQuest14_ButtonNext);
        final Button prevButton = (Button) findViewById(R.id.AQuest14_ButtonPrev);
        //untuk menuju pertanyaan berikutnya(15)
        nextButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActQuestion14.this, ActQuestion15.class);
                startActivity(intent);
            }
        });
        //untuk menuju pertanyaan sebelumnya(13)
        prevButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActQuestion14.this, ActQuestion13.class);
                startActivity(intent);
            }
        });
    }
}
