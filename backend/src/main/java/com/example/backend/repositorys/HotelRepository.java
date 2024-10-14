package com.example.backend.repositorys;

import com.example.backend.entites.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<HotelEntity, Long> {
}
