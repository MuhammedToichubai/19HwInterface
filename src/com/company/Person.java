package com.company;

public class Person {
    private int numberPeople;

    public Person() {
    }

    public Person(int numberPeople) {
        this.numberPeople = numberPeople;
    }

    public int getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }

    @Override
    public String toString() {
        return "Family:" +
                "numberPeople: " + numberPeople;

    }


}
