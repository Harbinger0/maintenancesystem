package com.startup.entity.booking;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Booking implements Serializable {

    @Id
    private String bookingId;
    private String maintenanceId;
    private String user;
    private String address;
    private String phone;

    protected Booking(){

    }

    public Booking(Builder builder) {
        this.bookingId = builder.bookingId;
        this.maintenanceId = builder.maintenanceId;
        this.user = builder.user;
        this.address = builder.address;
        this.phone = builder.phone;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getMaintenanceId() {
        return maintenanceId;
    }

    public String getUser() {
        return user;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public static class Builder{
        private String bookingId;
        private String maintenanceId;
        private String user;
        private String address;
        private String phone;

        public Builder setBookingId(String bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public Builder setMaintenanceId(String maintenanceId) {
            this.maintenanceId = maintenanceId;
            return this;
        }

        public Builder setUser(String user) {
            this.user = user;
            return this;
        }

        public Builder setAddress(String addressId) {
            this.address = addressId;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder copy(Booking booking){
            this.bookingId = booking.bookingId;
            return this;
        }

        public Booking build(){
            return new Booking(this);
        }
    }

    @Override
    public String toString() {
        return "Booking{" +
                "BookingId='" + bookingId + '\'' +
                ", maintenanceId='" + maintenanceId + '\'' +
                ", user='" + user + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return bookingId.equals(booking.bookingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId);
    }

}
