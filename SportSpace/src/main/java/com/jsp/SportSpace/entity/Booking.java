package com.jsp.SportSpace.entity;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingID;
	
	@Column(nullable = false, unique = true)
	private LocalDateTime startTime;
	
	@Column(nullable = false, unique = true)
	private LocalDateTime endTime;
	
	private Double totalAmount;
	
	@ManyToOne
	@Autowired
	private Turf turf;
	
	//not sure about mapping
	@Autowired
	@ManyToOne
	private User user;
	
	@OneToOne(mappedBy = "booking")
	@Autowired
	private Payment payment;
}










