package com.hotelmanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInfo {
    public static List getUserInfo(List<Hotel> hotel) {
        List<User> booking = new ArrayList<User>();
        Scanner in = new Scanner(System.in);
        System.out.println("No of Booking ");
        int noOfBooking = in.nextInt();
        for (int j = 1; j <= noOfBooking; j++) {
            int userId = j;
            System.out.println("Enter User Name");
            in.nextLine();
            String name = in.nextLine();
            System.out.println("Enter Hotel Name");
            String hotelName = in.nextLine();
            System.out.println("Enter the Number of Room");
            int room = in.nextInt();
            int noOfRoomAvailable = 0;
            int bookingCost = 0;
            User user = new User();
            user.setUserName(name);
            user.setUserId(userId);
            user.setHotelName(hotelName);
            user.setNoOfRoom(room);
            for (int i = 0; i < hotel.size(); i++) {
                Hotel list = hotel.get(i);
                String hotName = list.getHotelName();
                if (hotName.equals(hotelName)) {
                    noOfRoomAvailable = list.getRoomsAvailable();
                    if (room > noOfRoomAvailable) {
                        System.out.println("Only " + noOfRoomAvailable + " Available.Exitting");
                        break;
                    } else {
                        int price = list.getPricePerRoom();
                        bookingCost = price * room;
                        list.setRoomsAvailable(noOfRoomAvailable-room);
                    }
                }
            }
            if(bookingCost>0) {
                user.setBookingCost(bookingCost);
                booking.add(user);
            }

        }
        return booking;
    }
}
