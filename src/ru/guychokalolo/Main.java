package ru.guychokalolo;

import ru.guychokalolo.sealed.Human;
import ru.guychokalolo.sealed.Student;
import ru.guychokalolo.status.Status;
import ru.guychokalolo.teacher.Teacher;
import ru.guychokalolo.transport.Bus;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args){
        Student student = new Student("Kevin", 15, 42.5, "Mathematics",Status.NO_MARRIED);
        student.setName("Patrick");
        System.out.println(student.getName());

        Status status = Status.MARRIED;
        switch (status){
            case MARRIED -> {
                System.out.println("I am married");
                break;
            }
            case NO_MARRIED -> {
                System.out.println("i am not married");
                break;
            }
        }

        Bus bus = new Bus("Blue",4, 3, "BWM");
        System.out.println (bus.getInfoTransport());

        Teacher teacher = new Teacher("John", "Allan", 26, "E301", 2);
        Teacher teacher2 = new Teacher("John", "Allan", 26, "E301", 2);
        Teacher teacher3= new Teacher("Bob", "James", 26, "I207", 1);

        System.out.printf("teacher.equals(teacher2)? %s%n", teacher.equals(teacher2));
        System.out.printf("teacher.equals(teacher2)? %s%n", teacher2.equals(teacher3));
        System.out.println(teacher);
        System.out.println(teacher2);
        System.out.println(teacher.hashCode());
        System.out.println(teacher3.hashCode());
    }
}

