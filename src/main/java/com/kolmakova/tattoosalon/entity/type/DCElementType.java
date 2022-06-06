package com.kolmakova.tattoosalon.entity.type;

public enum DCElementType {

    BANNER("banner"),
    ADVERTISING("advertising");

    private final String elementType;

    DCElementType(String elementType) {
        this.elementType = elementType;
    }

    public String getElementType() {
        return elementType;
    }

}
