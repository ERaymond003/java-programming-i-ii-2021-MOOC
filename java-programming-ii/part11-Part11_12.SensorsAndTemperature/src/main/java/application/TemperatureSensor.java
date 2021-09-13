
package application;

import java.util.Random;


public class TemperatureSensor implements Sensor {
    
    private int value;
    
    public TemperatureSensor() {
        this.value = 0;
    }
    
    public boolean isOn() {
        if (this.value == 1) {
            return true;
        }
        return false;
    }
    
    public void setOn() {
        this.value = 1;
    }
    
    public void setOff() {
        this.value = 0;
    }
    
    public int read() {
        if (this.isOn() == true) {
            int returnInt = new Random().nextInt(61);
            return returnInt - 30;
        }
        throw new IllegalStateException("sensor is off.");
    }
}
