package com.example.hotel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class hotel extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);


        // header for go to listReserve
        String usName = "";
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            if(extras.containsKey("username")){
                usName =  extras.getString("username");
            }
        }
        TextView headerName = findViewById(R.id.headerName);
        headerName.setText(usName + " (CLICK HERE FOR RESERVE LIST)");
        headerName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hotel.this,reserveList.class);
                startActivity(intent);
            }
        });

    }

    //Hotell clicked go to moreinformation of Hotel
    public void clickedHotel(View v){
        String id = v.getId()+"";
        switch (v.getId()){
            case R.id.moreinfo:
                Intent intent = new Intent(hotel.this,moreInfoActivity.class);
                TextView hotelName = (TextView) findViewById(R.id.textViewTitle);
                intent.putExtra("hotelName",hotelName.getText());

                intent.putExtra("hotelId","PY-9001");

                RatingBar hotelRate = (RatingBar) findViewById(R.id.RatingBar);
                intent.putExtra("hotelRate",(int)hotelRate.getRating()+"");

                TextView hotelProvince = (TextView) findViewById(R.id.location);
                intent.putExtra("hotelProvince",hotelProvince.getText());

                TextView hotelCity = (TextView) findViewById(R.id.locationCity);
                intent.putExtra("hotelCity",hotelCity.getText());

                CheckBox wifi = (CheckBox) findViewById(R.id.wifiCheckBox);
                intent.putExtra("wifi",wifi.isChecked());

                CheckBox parking = (CheckBox) findViewById(R.id.parkingCheckBox);
                intent.putExtra("parking",parking.isChecked());

                CheckBox seaSide = (CheckBox) findViewById(R.id.seaSideCheckBox);
                intent.putExtra("seaSide",seaSide.isChecked());

                intent.putExtra("description", "1 With a stay at The Westin Paris - Vendôme, you'll be centrally located in Paris, steps from Rue de Rivoli and 4 minutes by foot from Tuileries Garden. This 4-star hotel is 0.3 mi (0.5 km) from Champs-Elysees and 0.3 mi (0.6 km) from Place de la Concorde.");
                intent.putExtra("Phone1","09111212121");
                intent.putExtra("Phone2","09111212121");
                intent.putExtra("Phone3","09111212121");
                intent.putExtra("Address","Tehran - Meydan Enghelab - MArkazi - pelak 2");
                intent.putExtra("Email","gggg@dddd.com");

                startActivity(intent);
                break;
            case R.id.moreinfo2:
                intent = new Intent(hotel.this,moreInfoActivity.class);
                hotelName = (TextView) findViewById(R.id.textViewTitle2);
                intent.putExtra("hotelName",hotelName.getText());

                intent.putExtra("hotelId","PY-9002");

                hotelRate = (RatingBar) findViewById(R.id.RatingBar2);
                intent.putExtra("hotelRate",(int)hotelRate.getRating()+"");

                hotelProvince = (TextView) findViewById(R.id.location2);
                intent.putExtra("hotelProvince",hotelProvince.getText());

                hotelCity = (TextView) findViewById(R.id.locationCity2);
                intent.putExtra("hotelCity",hotelCity.getText());

                wifi = (CheckBox) findViewById(R.id.wifiCheckBox2);
                intent.putExtra("wifi",wifi.isChecked());
                parking = (CheckBox) findViewById(R.id.parkingCheckBox2);
                intent.putExtra("parking",parking.isChecked());
                seaSide = (CheckBox) findViewById(R.id.seaSideCheckBox2);
                intent.putExtra("seaSide",seaSide.isChecked());

                intent.putExtra("description", "2 With a stay at The Westin Paris - Vendôme, you'll be centrally located in Paris, steps from Rue de Rivoli and 4 minutes by foot from Tuileries Garden. This 4-star hotel is 0.3 mi (0.5 km) from Champs-Elysees and 0.3 mi (0.6 km) from Place de la Concorde.");
                intent.putExtra("Phone1","09111212121");
                intent.putExtra("Phone2","09111212121");
                intent.putExtra("Phone3","09111212121");
                intent.putExtra("Address","Tehran - Meydan Enghelab - MArkazi - pelak 2");
                intent.putExtra("Email","gggg@dddd.com");

                startActivity(intent);
                break;
            case R.id.moreinfo3:
                intent = new Intent(hotel.this,moreInfoActivity.class);
                hotelName = (TextView) findViewById(R.id.textViewTitle3);
                intent.putExtra("hotelName",hotelName.getText());

                intent.putExtra("hotelId","PY-9003");

                hotelRate = (RatingBar) findViewById(R.id.RatingBar3);
                intent.putExtra("hotelRate",(int)hotelRate.getRating()+"");

                hotelProvince = (TextView) findViewById(R.id.location3);
                intent.putExtra("hotelProvince",hotelProvince.getText());

                hotelCity = (TextView) findViewById(R.id.locationCity3);
                intent.putExtra("hotelCity",hotelCity.getText());

                wifi = (CheckBox) findViewById(R.id.wifiCheckBox3);
                intent.putExtra("wifi",wifi.isChecked());
                parking = (CheckBox) findViewById(R.id.parkingCheckBox3);
                intent.putExtra("parking",parking.isChecked());
                seaSide = (CheckBox) findViewById(R.id.seaSideCheckBox3);
                intent.putExtra("seaSide",seaSide.isChecked());

                intent.putExtra("description", "3 With a stay at The Westin Paris - Vendôme, you'll be centrally located in Paris, steps from Rue de Rivoli and 4 minutes by foot from Tuileries Garden. This 4-star hotel is 0.3 mi (0.5 km) from Champs-Elysees and 0.3 mi (0.6 km) from Place de la Concorde.");
                intent.putExtra("Phone1","09111212121");
                intent.putExtra("Phone2","09111212121");
                intent.putExtra("Phone3","09111212121");
                intent.putExtra("Address","Tehran - Meydan Enghelab - MArkazi - pelak 2");
                intent.putExtra("Email","gggg@dddd.com");

                startActivity(intent);

                break;
            case R.id.moreinfo4:
                intent = new Intent(hotel.this,moreInfoActivity.class);
                hotelName = (TextView) findViewById(R.id.textViewTitle4);
                intent.putExtra("hotelName",hotelName.getText());

                intent.putExtra("hotelId","PY-9004");

                hotelRate = (RatingBar) findViewById(R.id.RatingBar4);
                intent.putExtra("hotelRate",(int)hotelRate.getRating()+"");

                hotelProvince = (TextView) findViewById(R.id.location4);
                intent.putExtra("hotelProvince",hotelProvince.getText());

                hotelCity = (TextView) findViewById(R.id.locationCity4);
                intent.putExtra("hotelCity",hotelCity.getText());

                wifi = (CheckBox) findViewById(R.id.wifiCheckBox4);
                intent.putExtra("wifi",wifi.isChecked());
                parking = (CheckBox) findViewById(R.id.parkingCheckBox4);
                intent.putExtra("parking",parking.isChecked());
                seaSide = (CheckBox) findViewById(R.id.seaSideCheckBox4);
                intent.putExtra("seaSide",seaSide.isChecked());

                intent.putExtra("description", "4 With a stay at The Westin Paris - Vendôme, you'll be centrally located in Paris, steps from Rue de Rivoli and 4 minutes by foot from Tuileries Garden. This 4-star hotel is 0.3 mi (0.5 km) from Champs-Elysees and 0.3 mi (0.6 km) from Place de la Concorde.");
                intent.putExtra("Phone1","09111212121");
                intent.putExtra("Phone2","09111212121");
                intent.putExtra("Phone3","09111212121");
                intent.putExtra("Address","Tehran - Meydan Enghelab - MArkazi - pelak 2");
                intent.putExtra("Email","gggg@dddd.com");

                startActivity(intent);

                break;
            case R.id.moreinfo5:
                intent = new Intent(hotel.this,moreInfoActivity.class);
                hotelName = (TextView) findViewById(R.id.textViewTitle5);
                intent.putExtra("hotelName",hotelName.getText());

                intent.putExtra("hotelId","PY-9005");

                hotelRate = (RatingBar) findViewById(R.id.RatingBar5);
                intent.putExtra("hotelRate",(int)hotelRate.getRating()+"");

                hotelProvince = (TextView) findViewById(R.id.location5);
                intent.putExtra("hotelProvince",hotelProvince.getText());

                hotelCity = (TextView) findViewById(R.id.locationCity5);
                intent.putExtra("hotelCity",hotelCity.getText());

                wifi = (CheckBox) findViewById(R.id.wifiCheckBox5);
                intent.putExtra("wifi",wifi.isChecked());
                parking = (CheckBox) findViewById(R.id.parkingCheckBox5);
                intent.putExtra("parking",parking.isChecked());
                seaSide = (CheckBox) findViewById(R.id.seaSideCheckBox5);
                intent.putExtra("seaSide",seaSide.isChecked());

                intent.putExtra("description", "5 With a stay at The Westin Paris - Vendôme, you'll be centrally located in Paris, steps from Rue de Rivoli and 4 minutes by foot from Tuileries Garden. This 4-star hotel is 0.3 mi (0.5 km) from Champs-Elysees and 0.3 mi (0.6 km) from Place de la Concorde.");
                intent.putExtra("Phone1","09111212121");
                intent.putExtra("Phone2","09111212121");
                intent.putExtra("Phone3","09111212121");
                intent.putExtra("Address","Tehran - Meydan Enghelab - MArkazi - pelak 2");
                intent.putExtra("Email","gggg@dddd.com");

                startActivity(intent);

                break;

        }
    }
}
