package instituto;

import java.util.HashMap;

public class Principal {
    public static void main(String[] args) {
        Asignatura ingles = new Asignatura("Inglés", 3);
        Asignatura mates = new Asignatura("Matemáticas", 2);
        Alumno juan = new Alumno("Juan Pérez", "1DAW").matricular(ingles).matricular(mates);
        juan.setNota(ingles, 1, 4.0f)
                .setNota(ingles, 2, 6.0f)
                .setNota(ingles, 3, 8.0f);
        Alumno antonio = new Alumno("Antonio García", "1DAW").matricular(mates);
        antonio.setNota(mates, 1, 2.5f);

        // Tests

        assert juan.getMedia(ingles) == 6.0f;
        assert antonio.getNota(mates, 2) == 0.0f;
        assert antonio.getNota(mates, 1) == antonio.getMedia(mates);
        assert juan.getAprobada(ingles) == true;
    }
}