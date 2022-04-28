package tdd;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BikeTest {

    @Test
    public void bikeCanBeCreated() {
        //given that I have a Bike
        Bike bike = new Bike("DAV");
        // check that I have a bike
        assertNotNull(bike);
        //assert that my fan is off
        assertFalse(bike.isOn());

    }

    @Test
    public void iCanTurnOnBike() {
        Bike bike = new Bike("DAV");
        assertFalse(bike.isOn());
        bike.turnOn();
        assertTrue(bike.isOn());
    }

    @Test
    public void iCanTurnOffBike() {
        Bike bike = new Bike("DAV");
        assertFalse(bike.isOn());
        bike.turnOn();
        assertTrue(bike.isOn());
        bike.turnOff();
        assertFalse(bike.isOn());
    }

    @Test
    public void iCanAccelerateMyBike() {
        Bike bike = new Bike("DAV");
        assertFalse(bike.isOn());
        bike.turnOn();
        assertTrue(bike.isOn());
        bike.acceleration();
        bike.acceleration();
        assertEquals(2, bike.getSpeed());
    }

    @Test
    public void iCanAccelerateGearTwo() {
        Bike bike = new Bike("DAV");
        assertFalse(bike.isOn());
        bike.turnOn();
        assertTrue(bike.isOn());
        bike.turnOff();
        bike.acceleration2();
        assertEquals(2, bike.getSpeed());

    }

    @Test
    public void iCanAccelerateGearThree() {
        Bike bike = new Bike("DAV");
        assertFalse(bike.isOn());
        bike.turnOn();
        assertTrue(bike.isOn());
        bike.turnOff();
        bike.acceleration3();
        assertEquals(3, bike.getSpeed());

    }

    @Test
    public void iCanAccelerateGearFour() {
        Bike bike = new Bike("DAV");
        assertFalse(bike.isOn());
        bike.turnOn();
        assertTrue(bike.isOn());
        bike.turnOff();
        bike.acceleration4();
        assertEquals(4, bike.getSpeed());


    }

    @Test
    public void iCanDecelerateGearOne() {
        Bike bike = new Bike("DAV");
        assertFalse(bike.isOn());
        bike.turnOn();
        assertTrue(bike.isOn());
        bike.turnOff();
        bike.acceleration4();
        assertEquals(4, bike.getSpeed());
        bike.decelerateSpeed();
        bike.decelerateSpeed();
        assertEquals(1, bike.decelerateSpeed());

    }

    @Test
    public void iCanDecelerateGearTwo() {
        Bike bike = new Bike("DAV");
        assertFalse(bike.isOn());
        bike.turnOn();
        assertTrue(bike.isOn());
        bike.turnOff();
        bike.acceleration4();
        assertEquals(4, bike.getSpeed());
        bike.decelerateSpeed();
        bike.decelerateSpeed();
        assertEquals(1, bike.decelerateSpeed());
        bike.decelerateSpeedGear2();
        assertEquals(-3, bike.decelerateSpeedGear2());
    }

    @Test
    public void iCanDecelerateGearThree() {
        Bike bike = new Bike("DAV");
        assertFalse(bike.isOn());
        bike.turnOn();
        assertTrue(bike.isOn());
        bike.turnOff();
        bike.acceleration4();
        assertEquals(4, bike.getSpeed());
        bike.decelerateSpeed();
        bike.decelerateSpeed();
        assertEquals(1, bike.decelerateSpeed());
        bike.decelerateSpeedGear2();
        assertEquals(-3, bike.decelerateSpeedGear2());
        bike.decelerateSpeedGear3();
        assertEquals(-9, bike.decelerateSpeedGear3());

    }
    @Test
    public void iCanDecelerateGearFour() {
        Bike bike = new Bike("DAV");
        assertFalse(bike.isOn());
        bike.turnOn();
        assertTrue(bike.isOn());
        bike.turnOff();
        bike.acceleration4();
        assertEquals(4, bike.getSpeed());
        bike.decelerateSpeed();
        bike.decelerateSpeed();
        assertEquals(1, bike.decelerateSpeed());
        bike.decelerateSpeedGear2();
        assertEquals(-3, bike.decelerateSpeedGear2());
        bike.decelerateSpeedGear3();
        assertEquals(-9, bike.decelerateSpeedGear3());
        bike.decelerateSpeedGear4();
        assertEquals(-17,bike.decelerateSpeedGear4());
    }

}