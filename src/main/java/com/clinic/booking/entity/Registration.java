package com.clinic.booking.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="hospital")
@NoArgsConstructor
@Getter
@Setter
public class Registration {

    private int id;

    @OneToOne
    private User user;


}
