package com.startup.controller.booking;

import com.startup.entity.booking.Booking;
import com.startup.factory.booking.BookingFactory;
import com.startup.service.booking.impl.BookingServiceImpl;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Set;
@RestController
@CrossOrigin
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private BookingServiceImpl bookingService;

    @PostMapping("/create")
    @CrossOrigin(origins = "http://localhost:4200")
    public Booking create(@RequestBody Booking booking){
        Booking newBooking = BookingFactory.createBooking(booking.getMaintenanceId(),
                booking.getUser(),
                booking.getAddress(),
                booking.getPhone());
        return bookingService.create(newBooking);
    }

    @GetMapping("/read/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Booking read(@PathVariable String id){
        return bookingService.read(id);
    }

    @PostMapping("/update")
    @CrossOrigin(origins = "http://localhost:4200")
    public Booking update(@RequestBody Booking booking){
        return bookingService.update(booking);

    }

    @DeleteMapping("/delete/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public boolean delete(@PathVariable String id){
        return bookingService.delete(id);
    }

    @GetMapping("/all")
    @CrossOrigin(origins = "http://localhost:4200")
    public Set<Booking> getAll(){
        return bookingService.getAll();
    }

}
