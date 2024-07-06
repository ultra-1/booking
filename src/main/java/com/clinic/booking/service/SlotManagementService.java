package com.clinic.booking.service;

import com.clinic.booking.dto.SlotDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SlotManagementService {

    public List<SlotDTO> getSlotAvailability(String startDate, String endDate, int doctorId) {
        return null;
    }

    public void updateBooking(int slotId, int patientId, int doctorId, String bookingStatus) {

    }

    public void createSlots(String startDate, String endDate) {

    }

    public void updateDoctorAvailability(int doctorId, Map<Integer, String> slotIdStatus) {

    }
}
