package com.example.maming.delpy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActQuestion18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_question18);

        final TextView page = (TextView)findViewById(R.id.AQuest18_TxtPage);
        final Button nextButton = (Button) findViewById(R.id.AQuest18_ButtonNext);
        final Button prevButton = (Button) findViewById(R.id.AQuest18_ButtonPrev);
        //untuk menuju pertanyaan berikutnya(19)
        nextButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActQuestion18.this, ActQuestion19.class);
                startActivity(intent);
            }
        });
        //untuk menuju pertanyaan sebelumnya(17)
        prevButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActQuestion18.this, ActQuestion17.class);
                startActivity(intent);
            }
        });
    }
}
