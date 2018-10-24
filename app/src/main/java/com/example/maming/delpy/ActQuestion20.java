package com.example.maming.delpy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActQuestion20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_question20);

        final TextView page = (TextView)findViewById(R.id.AQuest20_TxtPage);
        final Button nextButton = (Button) findViewById(R.id.AQuest20_ButtonNext);
        final Button prevButton = (Button) findViewById(R.id.AQuest20_ButtonPrev);
        //untuk menuju pertanyaan berikutnya(21)
        nextButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActQuestion20.this, ActQuestion21.class);
                startActivity(intent);
            }
        });
        //untuk menuju pertanyaan sebelumnya(19)
        prevButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActQuestion20.this, ActQuestion19.class);
                startActivity(intent);
            }
        });
    }
}
