package com.example.maming.delpy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActQuestion19 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_question19);

        final TextView page = (TextView)findViewById(R.id.AQuest19_TxtPage);
        final Button nextButton = (Button) findViewById(R.id.AQuest19_ButtonNext);
        final Button prevButton = (Button) findViewById(R.id.AQuest19_ButtonPrev);
        //untuk menuju pertanyaan berikutnya(20)
        nextButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActQuestion19.this, ActQuestion20.class);
                startActivity(intent);
            }
        });
        //untuk menuju pertanyaan sebelumnya(18)
        prevButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ActQuestion19.this, ActQuestion18.class);
                startActivity(intent);
            }
        });
    }
}
