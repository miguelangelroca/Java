public class Deposito {
    String nombre;
    float capacidad;
    float llenado;

    public Deposito(String nombre, float capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.llenado = 0.0f;
    }

    public float getapacidad() {
        return capacidad;
    }

    public float getRestante() {
        return llenado;
    }

    public Deposito setLlenar(float litros) {
        if (llenado + litros >= capacidad) {
            llenado = capacidad;
            return this;
        } else {
            llenado += litros;
            return this;
        }
    }

    public Deposito setQuitar(float litros) {
        if (llenado - litros <= llenado) {
            this.setVaciar();
            return this;
        } else {
            llenado -= litros;
            return this;
        }
    }

    public Deposito setVaciar() {
        llenado = 0.0f;
        return this;
    }
}
