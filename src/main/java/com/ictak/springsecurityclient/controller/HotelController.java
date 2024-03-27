package com.ictak.springsecurityclient.controller;

import com.ictak.springsecurityclient.entity.Hotel;
import com.ictak.springsecurityclient.service.HotelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @PostMapping("/hotel")
    public Hotel saveHotel(@RequestBody Hotel hotel){
        return hotelService.saveHotel(hotel);
    }

    @GetMapping("/hotel/")
    public List<Hotel> getAllhotels(){
        return hotelService.getAllhotels();
    }

    @GetMapping("/hotel/{id}")
    public Hotel gethotelById(@PathVariable("id") Long hotelId){
        return hotelService.gethotelById(hotelId);
    }

    @PutMapping("/hotel/{id}")
    public Hotel updateHotel(@PathVariable("") Long hotelId, @RequestBody Hotel hotel){
        return hotelService.updateHotel(hotelId,hotel);
    }

    @DeleteMapping("/hotel/{id}")
    public String deleteHotel(@PathVariable("") Long HotelId){
        hotelService.deleteHotel(HotelId);
        return "Deleted Successfully";
    }

}
