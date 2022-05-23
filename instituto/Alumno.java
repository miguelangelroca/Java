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

    public Alumno matricular(Asignatura asignatura) {
        asignaturas.put(asignatura, new Nota());
        asignatura.anyadir(this);
        return this;
    }

    public Float getNota(Asignatura asignatura, int trimestre) {
        return asignaturas.get(asignatura).getNota(trimestre);
    }

    public Float getMedia(Asignatura asignatura) {
        Nota nota = asignaturas.get(asignatura);
        float sum = 0.0f;
        int tamanyo = 0;
        for (float valor : nota.iterar()) {
            sum += valor;
            tamanyo++;
        }
        return sum / tamanyo;
    }

    public boolean getAprobada(Asignatura asignatura) {
        Nota datos = asignaturas.get(asignatura);
        for (float valor : datos.iterar()) {
            if (valor >= 5) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public Alumno setNota(Asignatura asignatura, float nuevaNota, int trimestre) {
        asignaturas.get(asignatura).setNota(nuevaNota, trimestre);
        return this;

    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nGrupo: " + grupo;
    }
}
