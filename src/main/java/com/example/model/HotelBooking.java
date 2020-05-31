package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HOTEL_BOOKING")
public class HotelBooking {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE) mysql ne support pas les séquences
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String hotelName;
	
	private double pricePerNight;
	
	private int numberNights;
	

	public HotelBooking() {
	}

	public HotelBooking(long id, String hotelName, double pricePerNight, int numberNights) {
		super();
		this.id = id;
		this.hotelName = hotelName;
		this.pricePerNight = pricePerNight;
		this.numberNights = numberNights;
	}
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the hotelName
	 */
	public String getHotelName() {
		return hotelName;
	}

	/**
	 * @param hotelName the hotelName to set
	 */
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	/**
	 * @return the pricePerNight
	 */
	public double getPricePerNight() {
		return pricePerNight;
	}

	/**
	 * @param pricePerNight the pricePerNight to set
	 */
	public void setPricePerNight(double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	/**
	 * @return the numberNights
	 */
	public int getNumberNights() {
		return numberNights;
	}

	/**
	 * @param numberNights the numberNights to set
	 */
	public void setNumberNights(int numberNights) {
		this.numberNights = numberNights;
	}

}
