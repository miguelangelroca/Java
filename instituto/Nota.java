import java.util.Map;

public class Nota {
    private Map<Integer, Float> notas;

    public Nota(int trimestre, float nota) {
        notas.put(trimestre, nota);

    }

    public float getNota(int trimestre) {
        return notas.get(trimestre);
    }

    public float getTodaNota(Alumno alumno) {
        return 0f;
    }

    public void setNota(int trimestre, float nota) {
        notas.put(trimestre, nota);
    }
}
