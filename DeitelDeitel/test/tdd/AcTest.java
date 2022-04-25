package tdd;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertNotNull;


public class AcTest {

    @Test
    public void acCanBeCreated(){
        //given that I have an ac
        Ac semi = new Ac("LG");
        // check that I have an ac
        assertNotNull(semi);
        //assert that my ac is off
        assertFalse(semi.isOn());
    }


    @Test
    public void iCanTurnOnAc(){
        Ac semi = new Ac("LG");
        assertFalse(semi.isOn());
        semi.turnOn();
        assertTrue(semi.isOn());

    }
    @Test
    public void iCanTurnOffAc(){
        Ac semi = new Ac("LG");
        assertFalse(semi.isOn());
        semi.turnOn();
        assertTrue(semi.isOn());
        semi.turnOff();
        assertFalse(semi.isOn());
    }

    @Test
    public void iCanIncreaseTemperature(){
        Ac semi = new Ac("LG");
        assertFalse(semi.isOn());
        semi.turnOn();
        assertTrue(semi.isOn());
        assertEquals(0,semi.getTemperature());

    }

    @Test
    public void iCanDecreaseTemperature(){
        Ac semi = new Ac("LG");
        assertFalse(semi.isOn());
        semi.turnOn();
        assertTrue(semi.isOn());
        assertEquals(0,semi.getTemperature());

    }
}


