package Classes;

import javax.swing.plaf.synth.ColorType;

import Enumerators.CarType;
import Enumerators.FuelType;
import Enumerators.GearType;

public abstract class Car {
    private String make;
    private String model;
    private CarType bodyType;
    private int numberWheels;
    private FuelType fuelType;
    private GearType gearType;
    private ColorType bodyColor;
    private int engineCap;

    public Car(String make, String model, CarType bodyType,
            int numberWheels, FuelType fuelType, GearType gearType,
            ColorType bodyColor, int engineCap) {
        this.make = make;
        this.model = model;
        this.bodyType = bodyType;
        this.numberWheels = numberWheels;
        this.fuelType = fuelType;
        this.gearType = gearType;
        this.bodyColor = bodyColor;
        this.engineCap = engineCap;
    }

    public void movement() {

    }

    public void maintenance() {

    }

    public boolean trnLights() {
        return true;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarType getBodyType() {
        return bodyType;
    }

    public void setBodyType(CarType bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public GearType getGearBoxType() {
        return gearType;
    }

    public void setGearBoxType(GearType gearBoxType) {
        this.gearType = gearBoxType;
    }

    public ColorType getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(ColorType bodyColor) {
        this.bodyColor = bodyColor;
    }

    public int getEngineCap() {
        return engineCap;
    }

    public void setEngineCap(int engineCap) {
        this.engineCap = engineCap;
    }

    public boolean turnWhappers() {
        return true;
    }

}
