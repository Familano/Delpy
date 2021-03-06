package com.example.maming.delpy;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

public class ActMainActivity extends AppCompatActivity {

    private static final int CODE_GET_REQUEST = 1024;
    private static final int CODE_POST_REQUEST = 1025;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_splashscreen);
        final int SPLASH_DISPLAY_LENGTH = 2000;
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Patient Login-Activity. */
                Intent mainIntent = new Intent(ActMainActivity.this, ActLoginPasien.class);
                ActMainActivity.this.startActivity(mainIntent);
                ActMainActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }

    private class PerformNetworkRequest extends AsyncTask<Void, Void, String> {
        String url;
        HashMap<String, String> params;
        int requestCode;

        PerformNetworkRequest(String url, HashMap<String, String> params, int requestCode){
            this.url = url;
            this.params = params;
            this.requestCode = requestCode;
        }

        protected void onPreExecute(){
            super.onPreExecute();
        }

        protected void onPostExecute(String s){
            super.onPostExecute(s);
            try{
                JSONObject object = new JSONObject(s);
                if(!object.getBoolean("error")){
                    Toast.makeText(getApplicationContext(), object.getString("message"), Toast.LENGTH_LONG);
                }
            } catch (JSONException e){
                e.printStackTrace();
            }
        }

        protected String doInBackground(Void... voids){
            RequestHandler requestHandler = new RequestHandler();

            if(requestCode == CODE_POST_REQUEST) return requestHandler.sendPostRequest(url, params);
            if(requestCode == CODE_GET_REQUEST) return requestHandler.sendGetRequest(url);
            return null;
        }
    }

    /* Function needed for Login */
    public void loginPasien(HashMap<String, String> params){
        PerformNetworkRequest request = new PerformNetworkRequest(APIPasien.URL_LOGIN_PASIEN, params, CODE_POST_REQUEST);
        request.execute();
    }
    /* Function needed for Save Score */
    public void saveScore(HashMap<String, String> params){
        PerformNetworkRequest request = new PerformNetworkRequest(APITest.URL_S_SCORE, params, CODE_POST_REQUEST);
        request.execute();
    }
}