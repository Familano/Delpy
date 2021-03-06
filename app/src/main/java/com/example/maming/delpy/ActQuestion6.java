package com.example.maming.delpy;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;


public class ActQuestion6 extends AppCompatActivity {
    private String score="0";
    private String id_pertanyaan="Q06";
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_question6);

        radioGroup = (RadioGroup) findViewById(R.id.AQuest5_RadioGroup);
    }

    public void NextPage (View view){
        ActTempScore.score.put(id_pertanyaan,score);

        Intent intent = new Intent(ActQuestion6.this, ActQuestion7.class);
        startActivity(intent);
    }
    public void PrevPage (View view){
        radioGroup.check(0);

        Intent intent = new Intent(ActQuestion6.this, ActQuestion5.class);
        startActivity(intent);
    }

    public void onRadioButton(View view) {
        Boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.AQuest6_RadioButtonAns0:
                if (checked)
                    score="0";
                break;
            case R.id.AQuest6_RadioButtonAns1:
                if (checked)
                    score="1";
                break;
            case R.id.AQuest6_RadioButtonAns2:
                if (checked)
                    score="2";
                break;
            case R.id.AQuest6_RadioButtonAns3:
                if (checked)
                    score="3";
                break;
        }
    }
}
