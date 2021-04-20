package com.model.entities;

import java.util.Date;

public class CarRental {
    private Date start;
    private Date finish;

    private Vehicle vehicle;
    private Invoice invoice;

    public CarRental() {

    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}


