package com.example.maming.delpy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActQuestion10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_question10);

        final TextView page = (TextView)findViewById(R.id.AQuest10_TxtPage);
        final Button nextButton = (Button) findViewById(R.id.AQuest10_ButtonNext);
        final Button prevButton = (Button) findViewById(R.id.AQuest10_ButtonPrev);
        //untuk menuju pertanyaan berikutnya(11)
        nextButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActQuestion10.this, ActQuestion11.class);
                startActivity(intent);
            }
        });
        //untuk menuju pertanyaan sebelumnya(9)
        prevButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActQuestion10.this, ActQuestion9.class);
                startActivity(intent);
            }
        });
    }
}
