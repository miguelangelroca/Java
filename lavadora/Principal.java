public class Principal {
    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora();
        lavadora.getDetergente().setLlenar(2.0f);
        lavadora.getSuavizante().setLlenar(1.0f);

        assert lavadora.setCierre().setPrograma(3).setEstado().nextPrograma().getPrograma() == 4;
        assert lavadora.setCierre().setPrograma(3).setEstado().nextPrograma().getDetergente().getRestante() - 1.6f < 0.00001f;
        assert lavadora.setPrograma(3).setEstado().nextPrograma().getPrograma() == 3;
        assert lavadora.setCierre().setPrograma(3).nextPrograma().getPrograma() == 3;
    }
}
