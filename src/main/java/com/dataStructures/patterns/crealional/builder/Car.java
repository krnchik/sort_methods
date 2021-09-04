package com.dataStructures.patterns.crealional.builder;

public class Car {

    public enum CarBody {SUV, SEDAN, COUPE}
    public enum Transmission {MANUAL, AUTO, ROBOT}

    private Transmission transmission;
    private CarBody carBody;
    private String mark;
    private int maxSpeed;
    private int seatCount;
    private boolean gpsMode;

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }

    public void setGpsMode(boolean gpsMode) {
        this.gpsMode = gpsMode;
    }

    @Override
    public String toString() {
        return "Car{" +
                "transmission=" + transmission +
                ", carBody=" + carBody +
                ", mark='" + mark + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", seatCount=" + seatCount +
                ", gpsMode=" + gpsMode +
                '}';
    }
}
