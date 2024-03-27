package com.ictak.springsecurityclient.service;

import com.ictak.springsecurityclient.entity.Hotel;
import com.ictak.springsecurityclient.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Objects;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel saveHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllhotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel gethotelById(Long guestId) {
        return hotelRepository.findById(guestId).get();
    }

    @Override
    public Hotel updateHotel(@PathVariable("id") Long guestId, @RequestBody Hotel hotel) {
        Hotel guestDB = hotelRepository.findById(guestId).get();
        if (Objects.nonNull(hotel.getHotelId()) && !"".equalsIgnoreCase(String.valueOf(hotel.getHotelId())))
            guestDB.setHotelId(hotel.getHotelId());
        if (Objects.nonNull(hotel.getHotelName()) && !"".equalsIgnoreCase(hotel.getHotelName()))
            guestDB.setHotelName(hotel.getHotelName());
        return hotelRepository.save(guestDB);
    }

    @Override
    public void deleteHotel(Long hotelId) {
        hotelRepository.deleteById(hotelId);
    }
}
