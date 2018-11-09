package com.example.maming.delpy;

import android.support.v7.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;

public class ActTempScore extends AppCompatActivity {
    public static HashMap<String, String> score = new HashMap<String, String>();

    public static void saveScore(){
        //Memangil create Mahasiswa API
        ActMainActivity req =  new ActMainActivity();
        //ActSaveScore actSaveScore = new ActSaveScore(this);
        HashMap<String,String> params = new HashMap<String,String>();
        for (Map.Entry<String, String> entry : score.entrySet()) {

            req.saveScore(params);
        }
    }
    /*public static void addScore(String key, String val){
        score.put(key,val);
    }
    */
}
