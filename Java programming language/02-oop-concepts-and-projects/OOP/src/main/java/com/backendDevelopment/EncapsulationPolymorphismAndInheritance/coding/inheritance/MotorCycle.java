package com.backendDevelopment.EncapsulationPolymorphismAndInheritance.coding.inheritance;

import com.backendDevelopment.EncapsulationPolymorphismAndInheritance.coding.TwoWheeler;

public class MotorCycle extends TwoWheeler {
    public double petrolCapacity;

    public void start() {
        System.out.println("Starting");
    }
}
