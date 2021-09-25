package com.hotelmanagementsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HotelInfo {
    public static List getHotelInfo(){
        Scanner in=new Scanner(System.in);
        List<Hotel> list=new ArrayList<>();
        HashMap<String ,Hotel> map=new HashMap<>();
        System.out.println("No of Details you want to enter");
        int number=in.nextInt();
        for (int i=0;i<number;i++) {
            System.out.println("Enter the Hotel Name");
            in.nextLine();
            String name = in.nextLine();
            System.out.println("Enter the No of Rooms Available");
            int roomAvailable = in.nextInt();
            System.out.println("Enter the Location");
            String location = in.next();
            System.out.println("Enter the Hotel Rating");
            int rating = in.nextInt();
            System.out.println("Enter the Price per Room");
            int pricePerRoom = in.nextInt();
            System.out.println("-----------------------");
            Hotel hotel = new Hotel();
            hotel.setHotelName(name);
            hotel.setRoomsAvailable(roomAvailable);
            hotel.setLocation(location);
            hotel.setRating(rating);
            hotel.setPricePerRoom(pricePerRoom);
            list.add(hotel);
            if(map.get(name)==null){
                map.put(name,hotel);
            }
        }
        return list;
    }
}
