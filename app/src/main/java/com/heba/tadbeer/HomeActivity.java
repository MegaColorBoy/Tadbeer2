package com.heba.tadbeer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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
}
