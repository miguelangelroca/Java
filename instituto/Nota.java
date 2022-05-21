package instituto;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Nota {

    private Map<Integer, Float> notas;

    public Nota(int trimestre, float nota) {
        notas = new HashMap<Integer, Float>(trimestre, nota);
    }

    public Nota() {
        notas = new HashMap<Integer, Float>();
    }

    public float getNota(int trimestre) {
        return notas.get(trimestre);
    }

    public Collection<Float> getNota() {
        return notas.values();
    }

    public void setNota(Nota nuevaNota) {
        notas.putAll(nuevaNota.notas);
    }

    public Collection<Float> iterar() {
        return this.notas.values();
    }

}
