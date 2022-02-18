package com.company;

import java.util.Arrays;

public class Dormitory implements Rent {
    private String address;
    Person[] family;

    public Dormitory() {
    }

    public Dormitory(String address, Person[] family) {
        this.address = address;
        this.family = family;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person[] getFamily() {
        return family;
    }

    public void setFamily(Person[] family) {
        this.family = family;
    }


    @Override
    public String toString() {
        return "Dormitory:\n" +
        "address:" + address + '\n' +
                "family:" + Arrays.toString(family);
    }

    @Override
    public void payRent() {
            System.out.println("Pay rent 400 $.(платить за аренду 400 $.) ");


    }

}
