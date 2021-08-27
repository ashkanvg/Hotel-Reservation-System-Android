package com.example.hotel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class reserveActivity extends AppCompatActivity {
    TextView availableRoom;
    RadioButton B1 , B2 , B3;
    CheckBox specialRoom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve);


        // reserve activitiy for reserve
        final Button f = (Button) findViewById(R.id.finishReservebtn);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                availableRoom  = findViewById(R.id.availableRoom);
                B1 = findViewById(R.id.oneBed);
                B2 = findViewById(R.id.twoBed);
                B3 = findViewById(R.id.threeBed);
                specialRoom = findViewById(R.id.spRoom);

                String BedCount ="";
                if(B1.isChecked()){
                    BedCount = B1.getText().toString();
                }else if(B2.isChecked()){
                    BedCount = B2.getText().toString();
                }else if(B3.isChecked()){
                    BedCount = B3.getText().toString();
                }

                if(!availableRoom.getText().toString().equals("0")){
                    Intent intent = new Intent(reserveActivity.this,checkReserve.class);
                    if(!BedCount.equals("")){
                        intent.putExtra("BedCount",BedCount);
                    }if(specialRoom.isChecked()){
                        intent.putExtra("Special","Special");
                    }else{
                        intent.putExtra("Special","notSpecial");

                    }

                    if(!BedCount.equals("")){
                        TextView id = findViewById(R.id.hotelIdMore);
                        reserve r = new reserve(id.getText().toString()," ","0",null,null);
                        r.save();
                        startActivity(intent);
                    }else{
                        Toast.makeText(reserveActivity.this, "Enter BEd Count", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
    }
}
