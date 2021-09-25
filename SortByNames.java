package com.hotelmanagementsystem;

import java.util.Comparator;

class SortByName implements Comparator<Hotel> {

    public int compare(Hotel a, Hotel b)
    {
        return a.getHotelName().compareTo(b.getHotelName());
    }
}
