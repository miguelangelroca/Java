package instituto;

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

    public Alumno matricular(Asignatura asignatura) {
        asignaturas.put(asignatura, new Nota());
        asignatura.anyadir(this);
        return this;
    }

    public Alumno setNota(Asignatura asignatura, Integer trimestre, Float nota) {
        asignaturas.values(asignatura).setNota(trimestre, nota);
        return this;

    }

    public double getMedia(Asignatura asignatura) {
        return 0.0;
    }

    public double getNota(Asignatura asignatura, Integer trimestre) {
        return asignaturas.values(asignatura).getNota(trimestre);
    }

    public boolean getAprobada(Asignatura asignatura) {
        return false;
    }
}
