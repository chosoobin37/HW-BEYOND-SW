package com.sixcandoit.plrecipe_place.feature.place.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


public class PlaceDTO {
    private String placeName;
    private String placeLocation;
    private String placePhoneNum;
    private int placeCategoryId;

    public PlaceDTO() {
    }

    public PlaceDTO(String placeName, String placeLocation, String placePhoneNum, int placeCategoryId) {
        this.placeName = placeName;
        this.placeLocation = placeLocation;
        this.placePhoneNum = placePhoneNum;
        this.placeCategoryId = placeCategoryId;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceLocation() {
        return placeLocation;
    }

    public void setPlaceLocation(String placeLocation) {
        this.placeLocation = placeLocation;
    }

    public String getPlacePhoneNum() {
        return placePhoneNum;
    }

    public void setPlacePhoneNum(String placePhoneNum) {
        this.placePhoneNum = placePhoneNum;
    }

    public int getPlaceCategoryId() {
        return placeCategoryId;
    }

    public void setPlaceCategoryId(int placeCategoryId) {
        this.placeCategoryId = placeCategoryId;
    }

    @Override
    public String toString() {
        return "PlaceDTO{" +
                "placeName='" + placeName + '\'' +
                ", placeLocation='" + placeLocation + '\'' +
                ", placePhoneNum='" + placePhoneNum + '\'' +
                ", placeCategoryId=" + placeCategoryId +
                '}';
    }
}
