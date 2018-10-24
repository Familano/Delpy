package com.example.maming.delpy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.TextView;


public class ActQuestion1 extends AppCompatActivity {
    String score="0";
    private RadioGroup radioGroup;
    private TextView page;
    private Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_question1);

        radioGroup = (RadioGroup) findViewById(R.id.AQuest1_RadioGroup);

        page = (TextView)findViewById(R.id.AQuest1_TxtPage);
        nextButton = (Button) findViewById(R.id.AQuest1_ButtonNext);
    }

    public void NextPage (View view){
        ActSaveScore actSaveScore = new ActSaveScore(this);
        actSaveScore.execute("17","Q01",score);
        //saveScore();
        Intent intent = new Intent(ActQuestion1.this, ActQuestion2.class);
        startActivity(intent);
    }

    public void onRadioButton(View view) {
        Boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.AQuest1_RadioButtonAns0:
                if (checked)
                    score="0";
                break;
            case R.id.AQuest1_RadioButtonAns1:
                if (checked)
                    score="1";
                break;
            case R.id.AQuest1_RadioButtonAns2:
                if (checked)
                    score="2";
                break;
            case R.id.AQuest1_RadioButtonAns3:
                if (checked)
                    score="3";
                break;
        }
    }
}
