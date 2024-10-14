package com.example.backend.services;

import com.example.backend.beans.GlobalErrorHandlerBean;
import com.example.backend.beans.GlobalResponseHandlerBeans;
import com.example.backend.entites.HotelEntity;
import com.example.backend.repositorys.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelService {

    @Autowired
    HotelRepository hotelRepository;

    public HotelEntity createHotel(HotelEntity hotel){
        return hotelRepository.save(hotel);
    }

    public List<HotelEntity> getAllHotels(){
        return hotelRepository.findAll();
    }
    public Object updateHotel(HotelEntity hotel, Long id){
        Optional<HotelEntity> optional = hotelRepository.findById(id);
        if(optional.isPresent()){
            HotelEntity hotelEntity = optional.get();
            hotelEntity.setName(hotel.getName());
            hotelEntity.setEmail(hotel.getEmail());
            hotelEntity.setRoomPrice(hotel.getRoomPrice());
            hotelEntity.setImageUrl(hotel.getImageUrl());
            hotelEntity.setPool(hotel.getPool());
            hotelEntity.setCity(hotel.getCity());
            hotelEntity.setDescription(hotel.getDescription());
            hotelEntity.setWifi(hotel.getWifi());
            hotelEntity.setGym(hotel.getGym());
            hotelEntity.setRating(hotel.getRating());
            return hotelRepository.save(hotelEntity);
        }
        return "hotel not found";
    }

    public Object deletedHotel(Long id){
        hotelRepository.deleteById(id);
        return "Hotel deleted";
    }
}
