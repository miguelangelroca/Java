import java.util.Collection;
import java.util.HashSet;

public class Asignatura {
    private String denominacion;
    private int numTrimestres;
    private Collection<Alumno> alumnos;

    public Asignatura(String denominacion, int numTrimestres) {
        this.denominacion = denominacion;
        this.numTrimestres = numTrimestres;
        alumnos = new HashSet<Alumno>();
    }

    public boolean anyadir(Alumno alumno) {
        alumnos.add(alumno);
        return true;
    }

    public void set_nota(Asignatura asignatura, double nota, String trimestre) {

    }
}
