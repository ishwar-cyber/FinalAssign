package com.example.backend.controlles;

import com.example.backend.beans.GlobalResponseHandlerBeans;
import com.example.backend.entites.HotelEntity;
import com.example.backend.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class HotelController {


    @Autowired
    HotelService hotelService;

    @PostMapping("/create")
    public ResponseEntity<Object> createHotel(@RequestBody HotelEntity hotel){
        return GlobalResponseHandlerBeans.createResponse("New Hotel Created",hotelService.createHotel(hotel), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Object> getAllHotels(){
        return GlobalResponseHandlerBeans.createResponse("Get all hotels",hotelService.getAllHotels(), HttpStatus.OK);
    }

    @PutMapping("/hotel/{id}")
    public ResponseEntity<Object> update(@RequestBody HotelEntity hotel, @PathVariable Long id){
        return GlobalResponseHandlerBeans.createResponse("Update hotel",hotelService.updateHotel(hotel,id),HttpStatus.OK);
    }

    @DeleteMapping("/hotel/{id}")
    public ResponseEntity<Object> deletedHotel(@PathVariable Long id){
        return  GlobalResponseHandlerBeans.createResponse("Deleted hotel",HttpStatus.NO_CONTENT);
    }
}
