package com.ictak.springsecurityclient.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long guestId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    public Guest() {
    }

    public Guest(Long guestId, String firstName, String lastName, String email, String phone) {
        this.guestId = guestId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

}
