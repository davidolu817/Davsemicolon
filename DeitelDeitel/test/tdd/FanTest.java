package tdd;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FanTest {
    @Test
    public void fanCanBeCreated(){
        // given that I have a fan
        Fan fan = new Fan("MEM");
 // check that i have a fan
        assertNotNull(fan);
// assert that my fan is off
        assertFalse(fan.isOn());

    }

    @Test
    public void iCanTurnOnFan(){
        Fan fan = new Fan("MEM");
        assertFalse(fan.isOn());
        fan.turnOn();
        assertTrue(fan.isOn());
    }

    @Test
    public void iCanTurnOffFan(){
        Fan fan = new Fan("MEM");
        assertFalse(fan.isOn());
        fan.turnOn();
        assertTrue(fan.isOn());
        fan.turnOff();
        assertFalse(fan.isOn());
    }
    @Test
    public void iCanIncreaseMyFan(){
        Fan fan = new Fan("MEM");
        assertFalse(fan.isOn());
        fan.turnOn();
        assertTrue(fan.isOn());
        assertEquals(0, fan.getSpeed());
        fan.increaseSpeed();
        fan.increaseSpeed();
        assertEquals(2, fan.getSpeed());
//        fan.decreaseSpeed();
//        assertEquals(1, fan.getSpeed());
    }
    @Test
    public void iCanDecreaseMyFan(){
     Fan fan = new Fan("MEM");
     assertFalse(fan.isOn());
     fan.turnOn();
     assertTrue(fan.isOn());
     assertEquals(0,fan.getSpeed());
     fan.increaseSpeed();
     fan.increaseSpeed();
     assertEquals(2, fan.getSpeed());
     fan.decreaseSpeed();
     assertEquals(1, fan.getSpeed());

    }

}
