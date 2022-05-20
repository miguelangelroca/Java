package instituto;

import java.util.HashSet;

public class Asignatura {
    private String denominacion;
    private int numTrimestres;
    private HashSet<Alumno> alumnos;

    public Asignatura(String denominacion, int numTrimestres) {
        this.denominacion = denominacion;
        this.numTrimestres = numTrimestres;
        alumnos = new HashSet<Alumno>();
    }

    public boolean anyadir(Alumno alumno) {
        alumnos.add(alumno);
        return true;
    }
}
