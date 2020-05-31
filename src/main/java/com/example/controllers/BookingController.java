package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.HotelBooking;
import com.example.persistence.BookingRepository;

/**
 * CRUD controller sample
 * 
 * @author viguierkristen
 *
 */
@RestController
@RequestMapping(value = "/bookings")
public class BookingController {
	
	private BookingRepository bookingRepository;
	
	@Autowired
	public BookingController(BookingRepository bookingRepository) {
		this.bookingRepository = bookingRepository;
		
	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<HotelBooking> getAll() {
		return this.bookingRepository.findAll();
	}
	
	@RequestMapping(value = "/affordable/{price}", method = RequestMethod.GET)
	public List<HotelBooking> getAffordable(@PathVariable double price) {
		return this.bookingRepository.findByPricePerNightLessThan(price);
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public List<HotelBooking> create(@RequestBody HotelBooking booking) {
		this.bookingRepository.save(booking);
		
		return this.bookingRepository.findAll();
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public List<HotelBooking> remove(@PathVariable long id) {
		bookingRepository.delete(id);
		
		return this.bookingRepository.findAll();
	}
}
