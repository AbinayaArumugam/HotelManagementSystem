package com.hotelmanagementsystem;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Hotel> hotel=HotelInfo.getHotelInfo();
        while (true) {
            System.out.println("----Hotel Management System----");
            System.out.println("1.Hotel Data");
            System.out.println("2.Sort Hotels by Name ");
            System.out.println("3.Sort Hotel by highest rating.");
            System.out.println("4.Hotel data for a Location");
            System.out.println("5.Sort hotels by maximum number of rooms Available");
            System.out.println("6.User Booking data");
            System.out.println("Enter your Choice");
            int choice=in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("HotelName  RoomAvailable  Location  Rating   PricePerRoom");
                   for(Hotel i:hotel){
                       System.out.println(i);
                   }
                   break;
                case 2:
                    System.out.println("Sort Hotel by Names");
                    Collections.sort(hotel,new SortByName());
                    for (Hotel i:hotel){
                        System.out.println(i);
                    }
                    break;
                case 3:
                    System.out.println("Sort by Rating");
                    Collections.sort(hotel,new SortByRating());
                    Collections.reverse(hotel);
                    for (Hotel i:hotel){
                        System.out.println(i);
                    }
                    break;
                case 4:
                    System.out.println("Hotel data for Location");
                    System.out.println("Enter the Location");
                    String location=in.next();
                    for (int i=0;i<hotel.size();i++){
                        Hotel list=hotel.get(i);
                        String loc=list.getLocation();
                        if(loc.equals(location)){
                            System.out.println(list);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Sort By Number of Rooms Available");
                    Collections.sort(hotel,new SortByNumberOfAvailableRooms());
                    for (Hotel i:hotel){
                        System.out.println(i);
                    }
                    break;
                case 6:
                    System.out.println("User Booking data");
                    List<User> booking=UserInfo.getUserInfo(hotel);
                    System.out.println("UserName   UserID   HotelName   BookingCost");
                    for (User i:booking){
                        System.out.println(i);
                    }

            }
        }
    }

}
