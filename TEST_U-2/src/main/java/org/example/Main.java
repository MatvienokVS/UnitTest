package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

abstract class Main {
    protected String company;
    protected String model;
    protected int yearRelease;
    protected int numWheels;
    protected int speed;

    public Main(String company, String model, int yearRelease) {
        this.company = company;
        this.model = model;
        this.yearRelease = yearRelease;
    }

    public abstract void testDrive();

    public abstract void park();

    public int getNumWheels() {
        return numWheels;
    }

    public int getSpeed() {
        return speed;
    }
}

class Car extends Vehicle {
    public Car() {
        super();
        this.numWheels = 4;
        this.speed = 0;
    }

    @Override
    public void testDrive() {
        this.speed = 60;
    }

    @Override
    public void park() {
        this.speed = 0;
    }
}

class Motorcycle extends Vehicle {
    private final int numWheels;
    private int speed;

    public Motorcycle() {
        super();
        this.numWheels = 2;
        this.speed = 0;
    }

    @Override
    public void testDrive() {
        this.speed = 75;
    }

    @Override
    public void park() {
        this.speed = 0;
    }
}

public class VehicleTest {

    @Test
    public void carIsInstanceOfVehicle() {
        Vehicle car = new Car();
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void carHas4Wheels() {
        Car car = new Car();
        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void motorcycleHas2Wheels() {
        Motorcycle motorcycle = new Motorcycle();
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void carTestDriveSetsSpeedTo60() {
        Car car = new Car();
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    public void motorcycleTestDriveSetsSpeedTo75() {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void carStopsAfterTestDriveAndPark() {
        Car car = new Car();
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void motorcycleStopsAfterTestDriveAndPark() {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}
