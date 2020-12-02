package com.startup.factory;

import com.startup.entity.booking.Booking;
import static com.startup.util.Amr.generateId;
public class BookingFactory {

    public static Booking createBooking(String maintenanceId, String userId, String address, String phone){
        return new Booking.Builder()
                .setBookingId(generateId())
                .setMaintenanceId(maintenanceId)
                .setUserId(userId)
                .setAddress(address)
                .setPhone(phone)
                .build();


    }
}
