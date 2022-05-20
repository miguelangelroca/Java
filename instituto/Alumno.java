package instituto;

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
        Nota nota = new Nota(0, 0.0f);
        asignaturas.put(asignatura, nota);
        asignatura.anyadir(this);
        return this;
    }

    public Alumno setNota(Asignatura asignatura, Nota nota) {
        asignaturas.put(asignatura, nota);
        return this;

    }

    public double getMedia(Asignatura asignatura) {
        Nota nota = asignaturas.get(asignatura);
        double sum = 0.0;
        int tamanyo = 0;
        for (double valor : nota.iterar()) {
            sum += valor;
            tamanyo++;
        }
        return sum / tamanyo;
    }

    public double getNota(Asignatura asignatura, Integer trimestre) {
        return asignaturas.get(asignatura).getNota(trimestre);
    }

    public boolean getAprobada(Asignatura asignatura) {
        final Nota datos;
        datos = asignaturas.get(asignatura);
        for (double valor : datos.iterar()) {
            if (valor < 5) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}
