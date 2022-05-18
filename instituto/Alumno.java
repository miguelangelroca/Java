import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Alumno {
    private String nombre;
    private String grupo;
    private Map<Asignatura, Nota> asignaturas;

    public Alumno(String nombre, String grupo) {
        this.nombre = nombre;
        this.grupo = grupo;
        asignaturas = new HashMap<Asignatura, Nota>();

    }

    public Alumno matricular(Asignatura asignatura, Nota nota) {
        asignaturas.put(asignatura, nota);
        asignatura.anyadir(this);
        return this;
    }

    public Alumno set_nota(Asignatura asignatura, Nota nota) {
        asignaturas.put(asignatura, nota);
        return this;

    }

    public double get_media(Asignatura asignatura) {
        final Nota nota;
        nota = asignaturas.get(asignatura);
        for (double valor : nota) {
            sum += valor;
        }
        return sum / tamanyo;
    }

    public double get_nota(Asignatura asignatura, Integer trimestre) {
        final Map<Integer, Double> datos;
        final Double datos_nota;
        datos = asignaturas.get(asignatura);
        datos_nota = datos.get(trimestre);
        return datos_nota;
    }

    public boolean get_aprobada(Asignatura asignatura) {
        final Collection<Double> datos;
        datos = asignaturas.get(asignatura).values();
        for (double valor : datos) {
            if (valor < 5) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}
