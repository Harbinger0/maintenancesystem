package com.startup.service.booking.impl;
import com.startup.entity.booking.Booking;
import com.startup.repository.booking.BookingRepository;
import com.startup.service.booking.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository repository;

    @Override
    public Set<Booking> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public Booking create(Booking booking) {
        return this.repository.save(booking);
    }

    @Override
    public Booking read(String s) {
        return this.repository.findById(s).orElse(null);
    }

    @Override
    public Booking update(Booking booking) {
        if (this.repository.existsById(booking.getBookingId())){
            return this.repository.save(booking);
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        this.repository.deleteById(s);
        if(this.repository.existsById(s)) return false;
        else return true;
    }
}
