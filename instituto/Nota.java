package instituto;

import java.util.Collection;
import java.util.Map;

public class Nota {
    private Map<Integer, Float> notas;

    public Nota(int trimestre, float nota) {
        notas.put(trimestre, nota);

    }

    public float getNota(int trimestre) {
        return notas.get(trimestre);
    }

    public void setNota(int trimestre, float nota) {
        notas.put(trimestre, nota);
    }

    public Collection<Float> iterar() {
        return notas.values();
    }

}
