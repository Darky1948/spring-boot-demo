package com.example.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.HotelBooking;

/**
 * https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html
 * @author viguierkristen
 *
 */
@Repository
public interface BookingRepository extends JpaRepository<HotelBooking, Long> {

	/**
	 * Basé sur les convetions de JPA
	 * https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html
	 * Permet de généré des requêtes !! (boilerplate code)
	 * 
	 * @param price
	 * @return La liste d'hôtels correspondant à la clause :)
	 */
	public List<HotelBooking> findByPricePerNightLessThan(double price);
}
