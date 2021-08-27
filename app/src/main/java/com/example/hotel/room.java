package com.example.hotel;

import com.orm.SugarRecord;

public class room extends SugarRecord {
    String roomId;
    String roomName;
    int roomNumber;
    int roomBedCount;
    boolean specialRoom;

    public room() {
    }

    public room(String roomId, String roomName, int roomNumber, int roomBedCount, boolean specialRoom) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.roomNumber = roomNumber;
        this.roomBedCount = roomBedCount;
        this.specialRoom = specialRoom;
    }

    public String getRoomId() {
        return roomId;
    }
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomBedCount() {
        return roomBedCount;
    }
    public void setRoomBedCount(int roomBedCount) {
        this.roomBedCount = roomBedCount;
    }

    public boolean isSpecialRoom() {
        return specialRoom;
    }
    public void setSpecialRoom(boolean specialRoom) {
        this.specialRoom = specialRoom;
    }
}
