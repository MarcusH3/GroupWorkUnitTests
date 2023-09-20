package com.example.groupworkunittests;

public class GroupWorkUnitTestsApplication {
    public static void main(String[] args) {

        Lights lights = Lights.builder()
                .lightsOn(true)
                .halfLight("LED")
                .build();

        Car car = Car.builder()
                .make("Tesla")
                .model("Model S")
                .lights(lights)
                .build();

        System.out.println(car);
    }
}
