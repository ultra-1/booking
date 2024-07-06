package com.clinic.booking.repo;

import com.clinic.booking.entity.DoctorAvailability;
import com.clinic.booking.entity.Slot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorAvailabilityRepo extends JpaRepository<DoctorAvailability, Integer> {
}
