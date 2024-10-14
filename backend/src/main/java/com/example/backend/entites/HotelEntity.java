package com.example.backend.entites;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.security.PrivateKey;
import java.time.LocalDateTime;

@Entity
@Table(name="hotel")
public class HotelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String name;
    private Long roomPrice;
    private String imageUrl;
    private String description;
    private Long rating;
    private String city;
    private String email;
    private Boolean wifi;
    private Boolean gym;
    private Boolean pool;

    @CreationTimestamp
    private LocalDateTime created_at;

    @UpdateTimestamp
    private LocalDateTime updated_at;

    public HotelEntity() {
    }

    public HotelEntity(Long id, Boolean pool, Boolean gym, Boolean wifi, String email, String city, Long rating, String description, String imageUrl, Long roomPrice, String name) {
        this.id = id;
        this.pool = pool;
        this.gym = gym;
        this.wifi = wifi;
        this.email = email;
        this.city = city;
        this.rating = rating;
        this.description = description;
        this.imageUrl = imageUrl;
        this.roomPrice = roomPrice;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getPool() {
        return pool;
    }

    public void setPool(Boolean pool) {
        this.pool = pool;
    }

    public Boolean getGym() {
        return gym;
    }

    public void setGym(Boolean gym) {
        this.gym = gym;
    }

    public Boolean getWifi() {
        return wifi;
    }

    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getRating() {
        return rating;
    }

    public void setRating(Long rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Long getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(Long roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HotelEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", roomPrice=" + roomPrice +
                ", imageUrl='" + imageUrl + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", wifi=" + wifi +
                ", gym=" + gym +
                ", pool=" + pool +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
