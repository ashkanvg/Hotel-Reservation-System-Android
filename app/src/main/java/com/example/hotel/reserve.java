package com.example.hotel;

import com.orm.SugarRecord;

import java.util.Date;

public class reserve extends SugarRecord {
    String hotelId;
    String userId;
    String roomId;
    Date startDate;
    Date endDate;

    //کلاس و دیتابیس رزرو
    public reserve(){

    }
    public reserve(String hotelId, String userId, String roomId, Date startDate, Date endDate) {
        this.hotelId = hotelId;
        this.userId = userId;
        this.roomId = roomId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getHotelId() {
        return hotelId;
    }
    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoomId() {
        return roomId;
    }
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
