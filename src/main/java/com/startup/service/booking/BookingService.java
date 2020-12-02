package com.startup.service.booking;
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
import com.startup.entity.booking.Booking;
import com.startup.service.IService;

import java.util.Set;

public interface BookingService extends IService<Booking, String> {

    Set<Booking> getAll();
}