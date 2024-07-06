package com.clinic.booking.repo;

import com.clinic.booking.entity.SlotBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlotBookingRepo extends JpaRepository<SlotBooking, Integer> {
}