package Classes;

import javax.swing.plaf.synth.ColorType;

import Enumerators.CarType;
import Enumerators.FuelType;
import Enumerators.GearType;
import GB_S.CarApp1.Interfaces.CarWash;
import GB_S.CarApp1.Interfaces.FuelStation;

public class Sedan extends Car implements FuelStation, CarWash{

    public Sedan(String make, String model, CarType bodyType, int numberWheels, 
            FuelType fuelType, GearType gearType,
            ColorType bodyColor, int engineCap) 
            {
        super(make, model, bodyType, numberWheels, fuelType, gearType, 
                bodyColor, engineCap);
        
    }


    @Override
    public void fuel() {
        
    }

    @Override
    public void wipHeadlights() {
        
    }

    @Override
    public void wipMirrors() {
        
    }

    @Override
    public void wipWindshield() {
        
    }
    
}
