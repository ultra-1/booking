package com.clinic.booking.repo;

import com.clinic.booking.entity.Slot;
import com.clinic.booking.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlotRepo extends JpaRepository<Slot, Integer> {
}
