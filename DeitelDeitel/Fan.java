package tdd;

public class Fan {
    private String name;
    private boolean isOn ;
    private int speed = 0;

    public Fan(String name){
        this.name = name;
    }

   public boolean isOn(){
       return isOn ;
   }

    public void turnOn() {
    isOn = true;
    }



    public void turnOff() {
        isOn = false;
    }

    public void increaseSpeed() {
        speed= speed +1;
    }

    public int getSpeed() {
        return speed;
    }

    public void decreaseSpeed() {
        speed= speed -1;
    }
}
