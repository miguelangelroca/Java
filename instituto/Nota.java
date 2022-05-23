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

    public Float getNota(int trimestre) {
        return notas.get(trimestre);
    }

    public void setNota(float nuevaNota, int trimestre) {
        notas.put(trimestre, nuevaNota);

    }

    public Collection<Float> iterar() {
        return notas.values();
    }

}
