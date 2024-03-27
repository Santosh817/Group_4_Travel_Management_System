package com.ictak.springsecurityclient.controller;

import com.ictak.springsecurityclient.entity.Guest;
import com.ictak.springsecurityclient.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GuestController {

    @Autowired
    private GuestService guestService;

    @PostMapping("/guest")
    public Guest saveGuest(@RequestBody Guest guest){
        return guestService.saveGuest(guest);
    }

    @GetMapping("/guest/")
    public List<Guest> getAllguests(){
        return guestService.getAllguests();
    }

    @GetMapping("/guest/{id}")
    public Guest getguestById(@PathVariable("id") Long guestId){
        return guestService.getguestById(guestId);
    }

    @PutMapping("/guest/{id}")
    public Guest updateGuest(@PathVariable("") Long guestId, @RequestBody Guest guest){
        return guestService.updateGuest(guestId, guest);
    }

    @DeleteMapping("/guest/{id}")
    public String deleteGuest(@PathVariable("") Long guestId){
        guestService.deleteGuest(guestId);
        return "Deleted Successfully";
    }
}
