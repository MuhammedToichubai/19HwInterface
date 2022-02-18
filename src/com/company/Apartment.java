package com.company;

import java.util.Arrays;

public class Apartment implements UtilityServices  {
    private String address;
    Person[] people;

    public Apartment() {
    }

    public Apartment(String address, Person[] people) {
        this.address = address;
        this.people = people;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Apartment:\n" +
                "address:" + address + '\n' +
                "people:" + Arrays.toString(people);
    }

    @Override
    public void payUtility() {
        System.out.println("Pay for utilities 100 $.(платить за коммунальные услуги 100 $)");

    }


}
