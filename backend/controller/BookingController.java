package trippy.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import trippy.backend.config.JwtUtil;
import trippy.backend.dto.BookingRequest;
import trippy.backend.model.Booking;
import trippy.backend.service.BookingService;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingService service;

    @Autowired
    private JwtUtil jwt;

    @PostMapping
    public Booking createBooking(
            @RequestHeader("Authorization") String token,
            @RequestBody BookingRequest req
    ) {
        String email = jwt.extractEmail(token.substring(7));
        return service.createBooking(email, req);
    }
}