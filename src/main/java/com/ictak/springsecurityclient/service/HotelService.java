package com.ictak.springsecurityclient.service;

import com.ictak.springsecurityclient.entity.Hotel;

import java.util.List;

public interface HotelService {
    Hotel saveHotel(Hotel hotel);

    List<Hotel> getAllhotels();

    Hotel gethotelById(Long guestId);

    Hotel updateHotel(Long hotelId, Hotel hotel);

    void deleteHotel(Long hotelId);
}
