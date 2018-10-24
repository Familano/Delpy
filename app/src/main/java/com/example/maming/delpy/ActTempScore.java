package com.example.maming.delpy;

import android.support.v7.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ActTempScore extends AppCompatActivity {
    public static HashMap<String, String> score = new HashMap<String, String>();

    public void saveScore(){
        for (Map.Entry<String, String> entry : score.entrySet()) {
            ActSaveScore actSaveScore = new ActSaveScore(this);
            actSaveScore.execute("17",""+entry.getKey(),""+entry.getValue());
        }
    }
    public static void addScore(String key, String val){
        score.put(key,val);
    }
}
