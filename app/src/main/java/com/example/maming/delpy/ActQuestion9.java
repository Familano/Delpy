package com.example.maming.delpy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActQuestion9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_question9);

        final TextView page = (TextView)findViewById(R.id.AQuest9_TxtPage);
        final Button nextButton = (Button) findViewById(R.id.AQuest9_ButtonNext);
        final Button prevButton = (Button) findViewById(R.id.AQuest9_ButtonPrev);
        //untuk menuju pertanyaan berikutnya(10)
        nextButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActQuestion9.this, ActQuestion10.class);
                startActivity(intent);
            }
        });
        //untuk menuju pertanyaan sebelumnya(8)
        prevButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActQuestion9.this, ActQuestion8.class);
                startActivity(intent);
            }
        });
    }
}
