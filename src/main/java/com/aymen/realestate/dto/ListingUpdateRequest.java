package com.aymen.realestate.dto;

public class ListingUpdateRequest {
    private String name;
    private String description;
    private String address;
    private Integer bedrooms;
    private Integer bathrooms;
    private Double price;
    private Boolean parking;
    private Boolean furnished;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    public Integer getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(Integer bathrooms) {
        this.bathrooms = bathrooms;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean isParking() {
        return parking;
    }

    public void setParking(Boolean parking) {
        this.parking = parking;
    }

    public Boolean isFurnished() {
        return furnished;
    }

    public void setFurnished(Boolean furnished) {
        this.furnished = furnished;
    }
}