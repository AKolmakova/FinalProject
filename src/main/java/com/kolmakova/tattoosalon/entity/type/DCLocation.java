package com.kolmakova.tattoosalon.entity.type;

public enum DCLocation {

    LEFT_TOP("left-top"),
    LEFT_BOTTOM("left-bottom"),
    RIGHT_TOP("right-top"),
    RIGHT_BOTTOM("right-bottom");

    private final String location;

    DCLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

}
