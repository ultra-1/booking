package com.clinic.booking.repo;

import com.clinic.booking.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepo extends JpaRepository<Registration, Integer> {
}
