package com.example.hotel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class moreInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_info);

        // read information from last page
        read();

        //click for resereve
        final Button finall = (Button) findViewById(R.id.reserveButton);
        finall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(moreInfoActivity.this,reserveActivity.class);
                startActivity(intent);
            }
        });

    }
    public void read(){
        String hotelId = null;
        String hotelName = null;
        String hotelRate = null;
        String hotelProvince = null;
        String hotelCity = null;
        boolean wifi = false;
        boolean parking = false;
        boolean seaSide = false;
        String description = null;
        ArrayList<String> phone = new ArrayList<>();
        String address = null;
        String email = null;

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            if(extras.containsKey("hotelId")){
                hotelId =  extras.getString("hotelId");
            }
            if(extras.containsKey("hotelName")){
                hotelName =  extras.getString("hotelName");
            }
            if(extras.containsKey("hotelRate")){
                hotelRate =  extras.getString("hotelRate");
            }
            if(extras.containsKey("hotelProvince")){
                hotelProvince =  extras.getString("hotelProvince");
            }
            if(extras.containsKey("hotelCity")){
                hotelCity =  extras.getString("hotelCity");
            }

            if(extras.containsKey("wifi")){
                wifi =  extras.getBoolean("wifi");
            }
            if(extras.containsKey("parking")){
                parking =  extras.getBoolean("parking");
            }
            if(extras.containsKey("seaSide")){
                seaSide =  extras.getBoolean("seaSide");
            }

            if(extras.containsKey("Phone1")){
                phone.add(extras.getString("Phone1"));
            }
            if(extras.containsKey("Phone2")){
                phone.add(extras.getString("Phone2"));
            }
            if(extras.containsKey("Phone3")){
                phone.add(extras.getString("Phone3"));
            }

            if(extras.containsKey("Address")){
                address =  extras.getString("Address");
            }
            if(extras.containsKey("Email")){
                email =  extras.getString("Email");
            }
            if(extras.containsKey("description")){
                description =  extras.getString("description");
            }


        }
        TextView id = (TextView) findViewById(R.id.hotelId);
        id.setText(hotelId);
        TextView name = (TextView) findViewById(R.id.hotelName);
        name.setText(hotelName);
        TextView province = (TextView) findViewById(R.id.province);
        province.setText(hotelProvince);
        TextView city = (TextView) findViewById(R.id.city);
        city.setText(hotelCity);

        RatingBar rate = (RatingBar) findViewById(R.id.hotelRating);
        rate.setRating((float)Integer.parseInt(hotelRate));

        CheckBox w = (CheckBox) findViewById(R.id.wifiCheck);
        w.setChecked(wifi);
        CheckBox p = (CheckBox) findViewById(R.id.parkingCheck);
        p.setChecked(parking);
        CheckBox s = (CheckBox) findViewById(R.id.seaSideCheck);
        s.setChecked(seaSide);


        //phone number
        TextView ph1 = (TextView) findViewById(R.id.phone1);
        ph1.setText(phone.get(0));
        TextView ph2 = (TextView) findViewById(R.id.phone2);
        ph2.setText(phone.get(1));
        TextView ph3 = (TextView) findViewById(R.id.phone3);
        ph3.setText(phone.get(2));


        TextView ad = (TextView) findViewById(R.id.address1);
        ad.setText(address);
        TextView mail = (TextView) findViewById(R.id.email1);
        mail.setText(email);


        TextView des = (TextView) findViewById(R.id.descriptionTxtView);
        des.setText(description);





    }

}
