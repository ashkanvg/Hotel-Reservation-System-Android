package com.example.hotel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;


//صفحع پیغام چک رزرو
public class checkReserve extends AppCompatActivity {
    String BedCount,Special;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_reserve);

        Button backHotel = findViewById(R.id.backtoHotelList);
        backHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(checkReserve.this,hotel.class);
                startActivity(intent);
            }
        });
        Button goReserve = findViewById(R.id.gotoReserveList);
        goReserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(checkReserve.this,reserveList.class);
                startActivity(intent);
            }
        });


        Bundle extras = getIntent().getExtras();
        if(extras != null){
            if(extras.containsKey("BedCount")){
                BedCount =  extras.getString("BedCount");
            }
            if(extras.containsKey("Special")){
                Special =  extras.getString("Special");
            }
        }

        TextView bedCount = findViewById(R.id.bedCount);
        bedCount.setText(BedCount+"("+Special+")");

    }
}
