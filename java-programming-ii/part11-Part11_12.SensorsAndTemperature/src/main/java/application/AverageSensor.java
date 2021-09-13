/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eric R Smith
 */
public class AverageSensor implements Sensor{
    
    
    private ArrayList<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor() {
        
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    public boolean isOn() {
        for(Sensor sensor : this.sensors) {
            if (sensor.isOn() == false) {
                return false;
            }
        }
        return true;
    }
    
    public void setOn() {
        for(Sensor sensor : this.sensors) {
            sensor.setOn();
        }
    }
    
    public void setOff() {
        for(Sensor sensor : this.sensors) {
            sensor.setOff();
        }
    }
    
    public int read() {
        if (this.sensors.size() == 0 || this.isOn() == false) {
            throw new IllegalStateException("No sensors, or a sensor is off");
        }
        int sum = 0;
        int count = 0;
        
        for (Sensor sensor : this.sensors) {
            sum += sensor.read();
            count++;
        }
        int average = sum / count;
        this.readings.add(average);
        return average;
    }
    
    public List<Integer> readings() {
        return this.readings;
    }
}
