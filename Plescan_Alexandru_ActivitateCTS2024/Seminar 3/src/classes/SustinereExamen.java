package classes;

import java.util.HashMap;
import java.util.Map;

public class SustinereExamen {
    private String name;

    private Map<Integer, Student> listaStudenti = new HashMap<>();

    public SustinereExamen(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Map<Integer, Student> getListaStudenti() {
        return listaStudenti;
    }

    public void inregistrareStudent(Student student) {
        if (listaStudenti.containsKey(student.getId())) {
            System.out.printf("Studentul %s a sustinut deja examenul%n", student.getNume());
            return;
        }
        listaStudenti.put(student.getId(), student);
        System.out.printf("Studentul %s sustine acum examenul%n", student.getNume());
    }
}
