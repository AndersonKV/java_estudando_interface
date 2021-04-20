package com.model.services;

import com.model.entities.CarRental;

public class RentalServicel {
    private Double pricePerDay;
    private Double pricePerHour;
    private BrazilTaxService taxService;

    public RentalServicel(Double pricePerDay, Double pricePerHour, BrazilTaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        carRental.
    }
}
