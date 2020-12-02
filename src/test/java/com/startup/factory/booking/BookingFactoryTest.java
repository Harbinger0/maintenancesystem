package com.startup.factory.booking;

import com.startup.entity.booking.Booking;
import org.junit.Assert;
import org.junit.Test;

public class BookingFactoryTest {

    @Test
    public void createBooking(){
        Booking booking = BookingFactory.createBooking("1111",
                "1111",
                "1111",
                "021254989");
        Assert.assertNotNull(booking.getBookingId());

        System.out.println(booking);
    }
}
