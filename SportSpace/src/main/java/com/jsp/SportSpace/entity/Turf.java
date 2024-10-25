package com.jsp.SportSpace.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Turf {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int turfId;
	
	@Column(nullable = false)
	private String turfName;
	
	@Column(nullable = false)
	private String location;
	
	@Column(nullable = false)
	private Double pricePerHour;
	
	@Column(nullable = false)
	private int capacity;
	
	@Column(nullable = false)
	private boolean isAvailable;
	
	@Autowired
	@OneToMany(mappedBy = "turf")
	private List<Booking> bookings;
	
	@Autowired
	@OneToMany(mappedBy = "turf")
	private List<TimeSlot> timeslots;
	
	@Autowired
	@ManyToOne
	private TurfOwner turfOwner;
}









