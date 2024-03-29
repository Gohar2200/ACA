package com.vehicle;

public class Vehicle {
    private int maxSpeed;
    private double maxWeight;
    private int enginePower;
    private float engineVolume;
    private String vinCode;
    private int sitCount;
    private short yearOfProduction;
    private String brand;
    private String mark;
    //OwnerPassportNumber need to add object
    private String color;

    public enum FuelType{
        Gas,Petrol,Diesel,Electricity
    }
    public enum SubType{
        Truck,Passenger,Military
    }

//    public Vehicle(){
//
//    }

    public Vehicle(int maxSpeed, double maxWeight, int enginePower, float engineVolume, String vinCode, int sitCount, short yearOfProduction, String brand, String mark, String color) {
        this.maxSpeed = maxSpeed;
        this.maxWeight = maxWeight;
        this.enginePower = enginePower;
        this.engineVolume = engineVolume;
        this.vinCode = vinCode;
        this.sitCount = sitCount;
        this.yearOfProduction = yearOfProduction;
        this.brand = brand;
        this.mark = mark;
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getVinCode() {
        return vinCode;
    }

    public void setVinCode(String vinCode) {
        this.vinCode = vinCode;
    }

    public int getSitCount() {
        return sitCount;
    }

    public void setSitCount(int sitCount) {
        this.sitCount = sitCount;
    }

    public short getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(short yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        System.out.println("Test AM");
    }
}
