package com.ictak.springsecurityclient.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String hotelId;
    private String hotelName;

    public Hotel() {
    }

    public Hotel(String hotelId, String hotelName) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
    }
}
