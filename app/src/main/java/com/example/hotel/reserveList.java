package com.example.hotel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class reserveList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve_list);


        //لیست رزرو ها
        String Result = "";
        List<reserve> re = reserve.listAll(reserve.class);
        for(reserve r:re){
            Result += r.getHotelId();
        }

        TextView reserveList = findViewById(R.id.reserveListEnd);
        reserveList.setText(Result);
    }
}
