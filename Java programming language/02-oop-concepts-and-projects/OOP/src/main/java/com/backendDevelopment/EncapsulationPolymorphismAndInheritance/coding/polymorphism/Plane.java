package com.backendDevelopment.EncapsulationPolymorphismAndInheritance.coding.polymorphism;

class Plane extends Vehicle {
    @Override
    public void start() {
        System.out.println("Plane is taking off");
    }
}
