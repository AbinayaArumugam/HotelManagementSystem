package com.hotelmanagementsystem;

import java.util.Comparator;

public class SortByNumberOfAvailableRooms implements Comparator<Hotel> {

    public int compare(Hotel a, Hotel b) {
        return a.getRoomsAvailable()-b.getRoomsAvailable();
    }
}
