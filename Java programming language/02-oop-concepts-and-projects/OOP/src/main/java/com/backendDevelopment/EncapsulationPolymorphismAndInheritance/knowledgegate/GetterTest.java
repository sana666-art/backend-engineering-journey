package com.backendDevelopment.EncapsulationPolymorphismAndInheritance.knowledgegate;

import com.backendDevelopment.EncapsulationPolymorphismAndInheritance.gettersetter.Car;

public class GetterTest {
    public static void main(String[] args) {
        Car car = new Car("Red", "Maurti",
                3, 8000);
        car.setColor("Blue");
        //System.out.printf("%s %s", car.getColor(), car.getModel());
    }
}
