import java.util.HashSet;
import java.util.Set;

public class Asignatura {
    private String denominacion;
    private int numTrimestres;
    private Set<Alumno> alumnos;

    public Asignatura(String denominacion, int numTrimestres) {
        this.denominacion = denominacion;
        this.numTrimestres = numTrimestres;
        alumnos = new HashSet<Alumno>();
    }

    public boolean anyadir(Alumno alumno) {
        alumnos.add(alumno);
        return true;
    }

    @Override
    public String toString() {
        return "Nombre: " + denominacion + "\nTrimestres: " + numTrimestres;
    }
}
