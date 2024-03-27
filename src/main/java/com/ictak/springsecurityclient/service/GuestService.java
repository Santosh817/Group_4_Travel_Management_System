package com.ictak.springsecurityclient.service;

import com.ictak.springsecurityclient.entity.Guest;

import java.util.List;

public interface GuestService {

    Guest saveGuest(Guest guest);

    List<Guest> getAllguests();

    void deleteGuest(Long guestId);

    Guest getguestById(Long guestId);

    Guest updateGuest(Long guestId, Guest guest);
}
