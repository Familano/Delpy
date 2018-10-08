package com.example.maming.delpy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActQuestion3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_question3);

        final TextView page = (TextView)findViewById(R.id.AQuest3_TxtPage);
        final Button nextButton = (Button) findViewById(R.id.AQuest3_ButtonNext);
        final Button prevButton = (Button) findViewById(R.id.AQuest3_ButtonPrev);
        //untuk menuju pertanyaan berikutnya(4)
        nextButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActQuestion3.this, ActQuestion4.class);
                startActivity(intent);
            }
        });
        //untuk menuju pertanyaan sebelumnya(2)
        prevButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActQuestion3.this, ActQuestion2.class);
                startActivity(intent);
            }
        });
    }
}
