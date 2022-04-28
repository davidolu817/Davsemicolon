package tdd;

public class Bike {
    private int decreaseSpeed;
    private String name;
    private boolean isOn ;

    public int getSpeed() {
        return speed;
    }

    private  int speed;

    public Bike(String name) {
        this.name = name;
    }

    public boolean isOn() { return isOn ;
    }

    public void turnOn() { isOn = true;
    }


    public void turnOff() { isOn = false;
    }

    public int acceleration() {
        speed = speed +1;
        return speed;
    }

    public int acceleration2() {
        speed = speed + 2;
        return speed;
    }

    public int acceleration3() {
        speed = speed + 3;
    return speed;
    }

    public int acceleration4() {
        speed = speed + 4;
   return  speed;
    }



    public int decelerateSpeed() {
        speed = speed -1;
        return speed;
    }
    public int decelerateSpeedGear2(){
        speed = speed -2;
        return speed;
    }
    public int decelerateSpeedGear3(){
        speed = speed -3;
                return speed;
    }
    public int decelerateSpeedGear4(){
        speed = speed -4;
        return speed;
    }

}
