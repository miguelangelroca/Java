package instituto;

public class Principal {
    public static void main(String[] args) {
        Asignatura ingles = new Asignatura("Inglés", 3);
        Asignatura mates = new Asignatura("Matemáticas", 2);

        Alumno juan = new Alumno("Juan Pérez", "1A");
        Alumno antonio = new Alumno("Antonio García", "1A");

        antonio.matricular(mates);
        antonio.setNota(mates, new Nota(1, 2.5f));

        juan.matricular(ingles).matricular(mates);
        juan
                .setNota(ingles, new Nota(1, 4.0f))
                .setNota(ingles, new Nota(2, 6.0f))
                .setNota(ingles, new Nota(3, 8.0f));

        System.out.println(juan.getMedia(ingles));
        System.out.println(juan.getNota(ingles));
        // Tests

        // assert juan.getMedia(ingles) == 6.0f;
        // assert antonio.getNota(mates, 2) == 0.0f;
        // assert antonio.getNota(mates, 1) == antonio.getMedia(mates);
        // assert juan.getAprobada(ingles) == true;
    }
}