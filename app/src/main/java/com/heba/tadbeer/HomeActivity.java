package com.heba.tadbeer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.heba.tadbeer.Util.ApiCallback;
import com.heba.tadbeer.Util.ApiHelper;
import com.heba.tadbeer.Util.Tbr;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;

public class HomeActivity extends AppCompatActivity {

    ApiHelper apiHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    protected void onStart() {
        super.onStart();
        udpatePrimaryDataSets();
    }

    public void goto_page(View view){
        String tag = ((Button)view).getTag().toString();

        Intent in = null;
        switch (tag){
            case "Bills":
                in = new Intent(this, BillsActivity.class);
                break;
            case "Cards":
                in = new Intent(this, CardsActivity.class);
                break;
            case "Warranties":
                in = new Intent(this, WarrantiesActivity.class);
                break;
        }
        if(in != null){
            startActivity(in);
        }
    }

    private void udpatePrimaryDataSets(){
        apiHelper = (apiHelper == null) ? apiHelper = ((Tbr)getApplication()).getApiHelper() : apiHelper;
        apiHelper.getRetailerList(new ApiCallback() {
            @Override
            public void onSuccess(Boolean success, JSONObject data) {
                try {
                    JSONArray retailers = data.getJSONArray("Retailer");

                    for (int i=0; i < retailers.length(); i++) {
                        JSONObject retailer = retailers.getJSONObject(i);
                        //TODO add to database
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onError(Boolean success, String error) {

            }
        });
    }
}
