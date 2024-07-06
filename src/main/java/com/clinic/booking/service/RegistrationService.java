package com.clinic.booking.service;

import com.clinic.booking.dto.PatientDTO;
import com.clinic.booking.repo.RegistrationRepo;
import com.clinic.booking.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class RegistrationService {

    @Autowired
    private RegistrationRepo registrationRepo;

    @Autowired
    private UserRepo userRepo;


    public void registerAccount() {
        //check if existing email or phone
        //return response accordingly
    }

    public PatientDTO getPatientDetails() {

        //check patient by email and return if exists
        return null;
    }

    public String addPatient(PatientDTO patientDTO) {
       return null;
    }



    public void editPatientDetails() {

    }
}
