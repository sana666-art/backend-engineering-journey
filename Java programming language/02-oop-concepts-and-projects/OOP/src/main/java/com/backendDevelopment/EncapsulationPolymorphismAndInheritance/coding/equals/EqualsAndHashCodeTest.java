package com.backendDevelopment.EncapsulationPolymorphismAndInheritance.coding.equals;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        Person person1 = new Person("Sana", 31, "001");
        Person person2 = new Person("Sana", 30, "001");

        if (person1.equals(person2)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not equal");
        }
    }
}
