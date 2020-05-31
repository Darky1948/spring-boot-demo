package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.model.HotelBooking;
import com.example.persistence.BookingRepository;

@Component
public class DatabaseSeeder implements CommandLineRunner {
	
	private BookingRepository bookingRepository;
	
	@Autowired
	public DatabaseSeeder(BookingRepository bookingRepository) {
		this.bookingRepository = bookingRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		List<HotelBooking> bookings = new ArrayList<>();
		
		bookings.add(new HotelBooking(1, "Marriot", 200.50, 3));
		bookings.add(new HotelBooking(2, "Ibis", 90, 4));
		bookings.add(new HotelBooking(3, "Marriot", 140.50, 1));
		bookings.add(new HotelBooking(4, "Toto", 112, 2));
		
		bookingRepository.save(bookings);
	}

}
