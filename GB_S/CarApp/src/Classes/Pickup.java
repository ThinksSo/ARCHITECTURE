package Classes;

import javax.swing.plaf.synth.ColorType;

import Enumerators.CarType;
import Enumerators.FuelType;
import Enumerators.GearType;
import Interfaces.CarWash;
import Interfaces.FuelStation;

public class Pickup extends Car implements FuelStation, CarWash {

    private int loadCap;

    public Pickup(String make, String model,
            int numberWheels, FuelType fuelType, GearType gearType,
            ColorType bodyColor, int engineCap, int loadCap) {

        super(make, model, CarType.pickup, numberWheels, fuelType, gearType, bodyColor, engineCap);

        this.loadCap = loadCap;

    }

    public int getLoadCap() {
        return loadCap;
    }

    public void setLoadCap(int loadCap) {
        this.loadCap = loadCap;
    }

    @Override
    public void fuel() {

    }

    @Override
    public void wipWindshield() {

    }

    @Override
    public void wipHeadlights() {

    }

    @Override
    public void wipMirrors() {

    }

}
