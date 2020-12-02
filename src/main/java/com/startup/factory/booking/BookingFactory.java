package com.startup.factory.booking;

import com.startup.entity.booking.Booking;
import static com.startup.util.Amr.generateId;
public class BookingFactory {

    public static Booking createBooking(String maintenanceId, String user, String address, String phone){
        return new Booking.Builder()
                .setBookingId(generateId())
                .setMaintenanceId(maintenanceId)
                .setUser(user)
                .setAddress(address)
                .setPhone(phone)
                .build();


    }
}
