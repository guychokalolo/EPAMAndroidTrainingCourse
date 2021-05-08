package ru.guychokalolo.sealed;


import ru.guychokalolo.status.Status;

public final class Student extends Human  {

    private String name;
    private int age;
    private Double sumPoints;
    private String optionSchool;
    private Status status;

    public Student(String name, int age, Double sumPoints, String optionSchool, Status status) {
        this.name = name;
        this.age = age;
        this.sumPoints = sumPoints;
        this.optionSchool = optionSchool;
        this.status = status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
