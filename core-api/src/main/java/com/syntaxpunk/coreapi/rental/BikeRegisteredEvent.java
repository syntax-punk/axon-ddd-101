package com.syntaxpunk.coreapi.rental;

public record BikeRegisteredEvent(String bikeId, String bikeType, String location) {

}