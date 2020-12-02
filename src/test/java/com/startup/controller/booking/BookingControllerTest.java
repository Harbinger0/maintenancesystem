package com.startup.controller.booking;

import com.startup.entity.booking.Booking;
import com.startup.factory.booking.BookingFactory;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookingControllerTest {

    private static Booking booking = BookingFactory.createBooking("1111",
            "1112",
            "1113",
            "1114");
    private static String SECURITY_USERNAME = "user";
    private static String SECURITY_PASSWORD = "3585";

    @Autowired
    private TestRestTemplate restTemplate = new TestRestTemplate();
    private String baseUrl = "http://localhost:8080/booking";

    @Test
    public void a_create(){
        String url = baseUrl + "create";
        System.out.println("URL: " + url + "\n" + "Booking: " + booking);
        ResponseEntity<Booking> postResponse = restTemplate
                .withBasicAuth(SECURITY_USERNAME, SECURITY_PASSWORD)
                .postForEntity(url, booking, Booking.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        booking = postResponse.getBody();
        System.out.println("saved Booking: " + postResponse);
        assertEquals(booking.getBookingId(),postResponse.getBody().getBookingId());

    }

    @Test
    public void b_read(){
        String url = baseUrl + "read/" + booking.getBookingId();
        System.out.println("URL: " + url);
        ResponseEntity<Booking> response = restTemplate
                .withBasicAuth(SECURITY_USERNAME, SECURITY_PASSWORD)
                .getForEntity(url, Booking.class);
        booking = response.getBody();
        assertEquals(booking.getMaintenanceId(), response.getBody().getMaintenanceId());


    }

    @Test
    public void c_update(){
        Booking updated = new Booking.Builder().setBookingId("2221")
                .setMaintenanceId("2222")
<<<<<<< Updated upstream
                .setUser("2223")
=======
                .setUserId("2223")
>>>>>>> Stashed changes
                .setAddress("2224")
                .setPhone("2225")
                .build();
        String url = baseUrl + "update";
        System.out.println("URL: " + url);
        System.out.println("post booking: " + updated);
        ResponseEntity<Booking> response = restTemplate
                .withBasicAuth(SECURITY_USERNAME,SECURITY_PASSWORD)
                .postForEntity(url, updated, Booking.class);
        System.out.println(response);
        System.out.println(response.getBody());


    }

    @Test
    public void d_getAll(){
        String url = baseUrl + "all";
        System.out.println("URL: " + url);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate
                .withBasicAuth(SECURITY_USERNAME, SECURITY_PASSWORD)
                .exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println(response);
        System.out.println(response.getBody());
    }

    @Test
    public void e_delete(){
        String url = baseUrl + "delete/" + booking.getBookingId();
        System.out.println("URL: " + url);
        restTemplate
                .withBasicAuth(SECURITY_USERNAME, SECURITY_PASSWORD)
                .delete(url);
    }
}
