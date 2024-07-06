package com.clinic.booking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hospital")
public class Hospital {

    @Id
    private int id;

    private String name;

    private String address;

    private int pincode;
}
