package com.pluralsight;

public class Room
{
    // create private variables
    private String roomNumber;

    // create a constructor that takes all variables
    public Room(String roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    // create getters here (this class should not have any setters)
    public String getRoomNumber()
    {
        return roomNumber;
    }
}
