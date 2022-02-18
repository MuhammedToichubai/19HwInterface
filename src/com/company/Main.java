package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        1. Уй-булолор квартирада, общежитиеде жана гостиницада жашашат
//        2. Квартирада жашагандар ком услуга толошот
//        3. Общежитие менен гостиницада жашагандар аренда толошот
//        4. Уй-булолор бир канча адамдан турушат
//        5. Кайсы жерде канча адам жашаганын консольго чыгарыныз
//        6. Жашоо демек озунун адресин корсотуу

        Person family1 = new Person( 5);
        Person family2 = new Person(3);
        Person family3 = new Person(12);

        Person[] people1 = {family1};
        Person[] people2 = {family2};
        Person[] people3 = {family3};

        Apartment apartment = new Apartment("Lenina 39", people1);
        System.out.println(apartment);
        apartment.payUtility();

        Dormitory dormitory = new Dormitory("Shushara 76", people2);
        System.out.println(dormitory);
        dormitory.payRent();

        Hotel hotel = new Hotel("Kurmanjan-Datka 109", people3);
        System.out.println(hotel);
        hotel.payRent();
    }
}


