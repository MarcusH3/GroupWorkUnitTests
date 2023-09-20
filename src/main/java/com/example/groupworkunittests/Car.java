package com.example.groupworkunittests;

import lombok.Builder;
import lombok.ToString;

@ToString
@Builder
public class Car {

    private final String make;
    private final String model;

    private final Lights lights;
    private final Engine engine;

    private int currentSpeed = 0;
    private int maxSpeed = 180;

    public void accelerate(int speedIncreaseBy) {
        if (engine.isEngineOn()) {
            if (currentSpeed >= 0 && currentSpeed + speedIncreaseBy <= maxSpeed) {
                currentSpeed += speedIncreaseBy;
                System.out.println("Car accelerated. Current speed: " + currentSpeed + " km/h");
            } else if (currentSpeed < 0) {
                currentSpeed -= speedIncreaseBy;
                System.out.println("Car is moving backward. Current speed: " + currentSpeed + " km/h");
            } else {
                System.out.println("Cannot accelerate beyond the max speed.");
            }
        } else {
            System.out.println("Cannot accelerate when engine is off.");
        }
    }

    public void handBreak(int speedDecreaseBy) {
        if (engine.isEngineOn()) {
            if (currentSpeed > 0 && currentSpeed - speedDecreaseBy >= 0) {
                currentSpeed -= speedDecreaseBy;
                System.out.println("Car decelerated. Current speed: " + currentSpeed + " km/h");
            } else if (currentSpeed <= 0) {
                currentSpeed += speedDecreaseBy;
                System.out.println("Car is moving forward from reverse. Current speed: " + currentSpeed + " km/h");
            } else {
                System.out.println("Cannot decelerate when the decrease speed is more than the current speed.");
            }
        } else {
            System.out.println("Cannot decelerate when the engine is off.");
        }
    }

    public void startEngine() {
        engine.setEngineOn(true);
    }
    public void stopEngine() {
        engine.setEngineOn(false);
        lights.setLightsOn(false);
        currentSpeed = 0;

    }
    public void switchWarningLights(boolean state){
        lights.setWarningLightOn(state);
    }
    public void switchlights(boolean state){
        if(engine.isEngineOn()) {
            lights.setLightsOn(state);
        } else {
            System.out.println("Cannot switch lights when engine is off");
        }
    }
}