package ru.guychokalolo.transport;

public class MotorCycle extends Transport {

    public MotorCycle(String color, int wheel, int numberOfPersons, String name) {
        super(color, wheel, numberOfPersons, name);
    }

    @Override
    public String getInfoTransport() {
        return "color = " + color + ", " + "wheel = " + Integer.toString(wheel)+
                ", " + "numberOfPersons = " + Integer.toString(numberOfPersons) + ", " + "name = " +name ;
    }
}
