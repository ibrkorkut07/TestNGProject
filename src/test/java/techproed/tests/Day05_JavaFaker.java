package com.myfirstproject;

import com.github.javafaker.Faker;
import org.junit.Test;

public class Day05_JavaFaker {
    @Test
    public void fakerTest(){
        // DDT Data Driven Testing
        // Test Data Generator
        // Generally for negative test cases

        // Java faker we can create all test data like username, name, password, mail, address,zip code
        // mock data

        Faker faker = new Faker();
        // THe first condition is creating an object

        System.out.println("First Name = " + faker.name().firstName());
        System.out.println("Last Name = " + faker.name().lastName());
        System.out.println("Full Name = " + faker.name().fullName());

        System.out.println("Username= " + faker.name().username());
        System.out.println("Password= " + faker.internet().password());
        System.out.println("Title = " + faker.name().title());
        System.out.println("email adress = " + faker.internet().emailAddress());

        System.out.println("Zip Code = " + faker.number().digits(5));
        System.out.println("City = " + faker.address().city());
        System.out.println("Full Adress = " + faker.address().fullAddress());
    }
}