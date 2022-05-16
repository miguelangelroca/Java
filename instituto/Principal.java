package instituto;

import java.util.HashMap;

public class Principal {
    public static void main(String[] args) {
        Asignatura ingles = new Asignatura("Inglés", 3);
        Asignatura mates = new Asignatura("Matemáticas", 2);
        Alumno juan = new Alumno("Juan Pérez", "1DAW").matricular(ingles).matricular(mates);
        juan.set_nota(ingles, new HashMap<Integer, Double>(1, 4.0f))
                .set_nota(ingles, new HashMap<Integer, Double>(2, 6.0f))
                .set_nota(ingles, new HashMap<Integer, Double>(3, 8.0f));
        Alumno antonio = new Alumno("Antonio García", "1DAW").matricular(mates);
        antonio.set_nota(mates, new HashMap<Integer, Double>(1, 2.5f));

        // Tests

        assert juan.get_media(ingles) == 6.0f;
        assert antonio.get_nota(mates, 2) == 0.0f;
        assert antonio.get_nota(mates, 1) == antonio.get_media(mates);
        assert juan.get_aprobada(ingles) == true;
    }
}