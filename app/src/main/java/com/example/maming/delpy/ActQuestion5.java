package com.example.maming.delpy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActQuestion5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_question5);

        final TextView page = (TextView)findViewById(R.id.AQuest5_TxtPage);
        final Button nextButton = (Button) findViewById(R.id.AQuest5_ButtonNext);
        final Button prevButton = (Button) findViewById(R.id.AQuest5_ButtonPrev);
        //untuk menuju pertanyaan berikutnya(6)
        nextButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActQuestion5.this, ActQuestion6.class);
                startActivity(intent);
            }
        });
        //untuk menuju pertanyaan sebelumnya(4)
        prevButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActQuestion5.this, ActQuestion4.class);
                startActivity(intent);
            }
        });
    }
}
