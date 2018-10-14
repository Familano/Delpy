package com.example.maming.delpy;

import android.os.AsyncTask;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

class PerformNetworkRequest  extends AsyncTask<Void, Void, String> {
        String url;
        HashMap<String, String> params;
        int requestCode;

    private static final int CODE_GET_REQUEST = 1024;
    private static final int CODE_POST_REQUEST = 1025;

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
}
