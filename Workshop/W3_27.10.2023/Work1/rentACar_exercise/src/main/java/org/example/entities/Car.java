package org.example.entities;

public class Car {
    private int id;
    private String brand;
    private String model;
    private double dateOfManufacture;
    private String gearType;
    private String fuelType;
    private double dailyRentCharge;

    //constructors
    public Car() {

    }
    public Car(int id, String brand, String model, double dateOfManufacture, String gearType, String fuelType, double dailyRentCharge) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.dateOfManufacture = dateOfManufacture;
        this.gearType = gearType;
        this.fuelType = fuelType;
        this.dailyRentCharge = dailyRentCharge;
    }

    //getters, setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(double dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getDailyRentCharge() {
        return dailyRentCharge;
    }

    public void setDailyRentCharge(double dailyRentCharge) {
        this.dailyRentCharge = dailyRentCharge;
    }
}
