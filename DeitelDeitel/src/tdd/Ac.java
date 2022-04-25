package tdd;

public class Ac {
    public int temperature;
    private String name;

    private boolean isOn;

    public Ac(String name) {
        this.name = name;
    }


    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public int getTemperature () {
        return temperature;
    }
    public void increaseTemperature() {
        if (temperature == 0 && temperature <= 30) {
            temperature = temperature + 1;
        }
    }

    public void decreaseTemperature(){
        if (temperature == 30){
            temperature = temperature -1;
        } else if (temperature == 16) {
            temperature = temperature;
        }
    }
}









