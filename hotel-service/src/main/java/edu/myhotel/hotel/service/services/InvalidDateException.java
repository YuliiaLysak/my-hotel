package edu.myhotel.hotel.service.services;

import java.time.LocalDate;

public class InvalidDateException extends RuntimeException {

    public InvalidDateException(String message) {
        super(message);
    }
}
