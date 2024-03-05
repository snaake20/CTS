package main;

import classes.Logger;
import classes.Student;
import classes.SustinereExamen;

class Main {
    public static void main(String[] args) {
        Logger.info("Ceva");
        Logger.warn("Altceva");
        Logger.saveToFile();

        Student student1 = new Student(1, "Eduard", "Ed@gmail.com", 2);
        Student student2 = new Student(2, "Alex", "Al@gmail.com", 2);

        SustinereExamen sustinereExamenPoo = new SustinereExamen("POO");

        sustinereExamenPoo.inregistrareStudent(student1);
        sustinereExamenPoo.inregistrareStudent(student2);
        sustinereExamenPoo.inregistrareStudent(student1);
    }
}
