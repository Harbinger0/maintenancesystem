package com.startup.service.booking.impl;

import com.startup.entity.booking.Booking;
import com.startup.factory.booking.BookingFactory;
import com.startup.service.booking.BookingService;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;
import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookingServiceImplTest {

    @Autowired
    private static BookingService service;
    private static Booking booking = BookingFactory.createBooking("1111",
            "1112",
            "1113",
            "1114");


    @Test
    public void d_getAll(){
        Set<Booking> bookings = service.getAll();
        assertEquals(1, bookings.size());
        System.out.println("All bookings: " + bookings);
    }

    @Test
    public void a_create(){
        Booking created = service.create(booking);
        Assert.assertEquals(booking.getBookingId(), created.getBookingId());
        System.out.println("Created: " + created);
    }

    @Test
    public void b_read(){
        Booking read = service.read(booking.getBookingId());
        System.out.println("Read: " + read);
    }

    @Test
    public void c_update(){
        Booking updated = new Booking.Builder().setBookingId("2221")
                .setMaintenanceId("2222")
<<<<<<< Updated upstream
<<<<<<< Updated upstream
                .setUser("2223")
=======
                .setUserId("2223")
>>>>>>> Stashed changes
=======
                .setUserId("2223")
>>>>>>> Stashed changes
                .setAddress("2224")
                .setPhone("2225")
                .build();
        updated = service.update(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    public void e_delete(){
        boolean deleted = service.delete(booking.getBookingId());
        Assert.assertTrue(deleted);
    }


}
