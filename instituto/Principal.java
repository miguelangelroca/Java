public class Principal {
    public static void main(String[] args) {
        Asignatura ingles = new Asignatura("Inglés", 3);
        Asignatura mates = new Asignatura("Matemáticas", 2);

        Alumno juan = new Alumno("Juan Pérez", "1A");
        Alumno antonio = new Alumno("Antonio García", "1A");

        antonio.matricular(mates);
        antonio.setNota(mates, 4.5f, 1);

        juan.matricular(ingles).matricular(mates);
        juan
                .setNota(ingles, 5.5f, 1)
                .setNota(ingles, 7.5f, 2)
                .setNota(ingles, 6.5f, 3);

        System.out.println(antonio.getNota(mates, 1));
        System.out.println(juan.getMedia(ingles));
        System.out.println(juan.getAprobada(ingles));

        // Tests

        assert antonio.getNota(mates, 1) == 4.5f;
        assert juan.getMedia(ingles) == 6.5f;
        assert juan.getAprobada(ingles) == true;
        assert Math.abs(antonio.getNota(mates, 1) - antonio.getMedia(mates)) < 0.000001f;
    }
}