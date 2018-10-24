package com.example.maming.delpy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActQuestion6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_question6);

        final TextView page = (TextView)findViewById(R.id.AQuest6_TxtPage);
        final Button nextButton = (Button) findViewById(R.id.AQuest6_ButtonNext);
        final Button prevButton = (Button) findViewById(R.id.AQuest6_ButtonPrev);
        //untuk menuju pertanyaan berikutnya(7)
        nextButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActQuestion6.this, ActQuestion7.class);
                startActivity(intent);
            }
        });
        //untuk menuju pertanyaan sebelumnya(5)
        prevButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActQuestion6.this, ActQuestion5.class);
                startActivity(intent);
            }
        });
    }
}
