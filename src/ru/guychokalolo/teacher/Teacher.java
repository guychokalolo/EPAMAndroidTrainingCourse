package ru.guychokalolo.teacher;

import java.util.Objects;

public class Teacher {
    private String name;
    private String surName;
    private int age;
    private String _class;
    private int stage;

    public Teacher(String name, String surName, int age, String _class, int stage){
        this.name = name;
        this.surName = surName;
        this.age = age;
        this._class = _class;
        this.stage = stage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;
        Teacher teacher = (Teacher) o;
        return name.equals(teacher.name) &&
                surName.equals(surName) &&
                age==age && _class.equals(_class)
                && stage==stage;
    }

    @Override
    public int hashCode() {
        int hash = 28;
        int result = 1;
        result = hash * result +((name==null)? 0 : name.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", _class='" + _class + '\'' +
                ", stage=" + stage +
                '}';
    }
}
