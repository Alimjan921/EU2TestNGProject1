package com.cybertek;

import com.github.javafaker.Faker;

public class FirstClass {

    public static void main(String[] args) {
        System.out.println("Hello world");
        //type Faker and hid enter
        Faker faker = new Faker();
        System.out.println(faker.university().name());
        System.out.println(faker.food().dish());
        System.out.println(faker.business().creditCardNumber());
        System.out.println("***************");
        System.out.println(faker.overwatch().location());


    }
}
