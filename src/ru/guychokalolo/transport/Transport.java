package ru.guychokalolo.transport;

abstract class Transport {
    protected String name;
    protected String color;
    protected int wheel;
    protected int numberOfPersons;

    public Transport(String color, int wheel, int numberOfPersons, String name) {
        this.color = color;
        this.wheel = wheel;
        this.numberOfPersons = numberOfPersons;
        this.name = name;
    }

    public abstract String getInfoTransport();

}
