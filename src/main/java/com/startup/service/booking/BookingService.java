package com.startup.service.booking;
import com.startup.entity.booking.Booking;
import com.startup.service.IService;

import java.util.Set;

public interface BookingService extends IService<Booking, String> {

    Set<Booking> getAll();
}