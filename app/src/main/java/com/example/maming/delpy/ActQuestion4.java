package com.example.maming.delpy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActQuestion4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_question4);

        final TextView page = (TextView)findViewById(R.id.AQuest4_TxtPage);
        final Button nextButton = (Button) findViewById(R.id.AQuest4_ButtonNext);
        final Button prevButton = (Button) findViewById(R.id.AQuest4_ButtonPrev);
        //untuk menuju pertanyaan berikutnya(5)
        nextButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActQuestion4.this, ActQuestion5.class);
                startActivity(intent);
            }
        });
        //untuk menuju pertanyaan sebelumnya(3)
        prevButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActQuestion4.this, ActQuestion3.class);
                startActivity(intent);
            }
        });
    }
}
