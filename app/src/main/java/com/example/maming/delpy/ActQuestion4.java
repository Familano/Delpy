package com.example.maming.delpy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.RadioButton;


public class ActQuestion4 extends AppCompatActivity {
    private String score="0";
    private String id_pertanyaan="Q04";
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_question4);

        radioGroup = (RadioGroup) findViewById(R.id.AQuest3_RadioGroup);
    }

    public void NextPage (View view){
        ActTempScore.score.put(id_pertanyaan,score);

        Intent intent = new Intent(ActQuestion4.this, ActQuestion5.class);
        startActivity(intent);
    }
    public void PrevPage (View view){
        radioGroup.check(0);

        Intent intent = new Intent(ActQuestion4.this, ActQuestion3.class);
        startActivity(intent);
    }

    public void onRadioButton(View view) {
        Boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.AQuest4_RadioButtonAns0:
                if (checked)
                    score="0";
                break;
            case R.id.AQuest4_RadioButtonAns1:
                if (checked)
                    score="1";
                break;
            case R.id.AQuest4_RadioButtonAns2:
                if (checked)
                    score="2";
                break;
            case R.id.AQuest4_RadioButtonAns3:
                if (checked)
                    score="3";
                break;
        }
    }
}
