package com.startup.factory.booking;

import com.startup.entity.booking.Booking;
import static com.startup.util.Amr.generateId;
public class BookingFactory {

<<<<<<< Updated upstream
<<<<<<< Updated upstream
    public static Booking createBooking(String maintenanceId, String user, String address, String phone){
        return new Booking.Builder()
                .setBookingId(generateId())
                .setMaintenanceId(maintenanceId)
                .setUser(user)
=======
=======
>>>>>>> Stashed changes
    public static Booking createBooking(String maintenanceId, String userId, String address, String phone){
        return new Booking.Builder()
                .setBookingId(generateId())
                .setMaintenanceId(maintenanceId)
                .setUserId(userId)
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
                .setAddress(address)
                .setPhone(phone)
                .build();


    }
}