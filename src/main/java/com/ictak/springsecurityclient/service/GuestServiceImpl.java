package com.ictak.springsecurityclient.service;

import com.ictak.springsecurityclient.entity.Guest;
import com.ictak.springsecurityclient.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Objects;

@Service
public class GuestServiceImpl implements GuestService{

    @Autowired
    private GuestRepository guestRepository;
    @Override
    public Guest saveGuest(Guest guest) {
        return guestRepository.save(guest);
    }

    @Override
    public List<Guest> getAllguests() {
        return guestRepository.findAll();
    }

    @Override
    public void deleteGuest(Long guestId) {
        guestRepository.deleteById(guestId);

    }
    @Override
    public Guest getguestById(Long guestId) {
        return guestRepository.findById(guestId).get();
    }

    @Override
    public Guest updateGuest(@PathVariable("id") Long guestId, @RequestBody Guest guest) {
        Guest guestDB = guestRepository.findById(guestId).get();
        if (Objects.nonNull(guest.getGuestId()) && !"".equalsIgnoreCase(String.valueOf(guest.getGuestId())))
            guestDB.setGuestId(guest.getGuestId());
        if (Objects.nonNull(guest.getEmail()) && !"".equalsIgnoreCase(guest.getEmail()))
            guestDB.setEmail(guest.getEmail());
        if (Objects.nonNull(guest.getPhone()) && !"".equalsIgnoreCase(guest.getPhone()))
            guestDB.setPhone(guest.getPhone());
        return guestRepository.save(guestDB);
    }

}
