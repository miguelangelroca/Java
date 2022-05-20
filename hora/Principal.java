package hora;

public class Principal {
    public static void main(String[] args) {
        Hora nuevo = new Hora(20, 59, 17);
        nuevo.ver_hora();
        nuevo.inc();
        nuevo.ver_hora();
        nuevo.inc();
        nuevo.ver_hora();
        nuevo.inc();
        nuevo.ver_hora();
    }
}

class Hora {

    int hora, minutos, valor, segundos;
    String format_hora;

    public Hora(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void inc() {
        if (this.minutos == 59) {
            this.minutos = 00;
            this.set_hora(this.hora + 1);
        } else {
            this.minutos += 1;
        }
    }

    public boolean set_hora(int valor) {
        if (valor >= 0 || valor <= 23) {
            this.hora = valor;
            return true;
        } else {
            if (valor < 0) {
                System.out.println("El valor de la hora no puede ser negativo.");
            } else {
                this.hora = 00;
            }
            return false;
        }
    }

    public boolean set_minutos(int valor) {

        if (valor >= 0 || valor <= 59) {
            this.minutos = valor;
            return true;
        } else {
            if (valor < 0) {
                System.out.println("El valor de los minutos no puede ser negativo.");
            } else {
                this.minutos = 00;
            }
            return false;
        }
    }

    public boolean set_segundos(int valor) {

        if (valor >= 0 || valor <= 59) {
            this.segundos = valor;
            return true;
        } else {
            if (valor < 0) {
                System.out.println("El valor de los segundos no puede ser negativo.");
            } else {
                this.segundos = 00;
            }
            return false;
        }
    }

    public void ver_hora() {
        format_hora = String.format("%02d:%02d:%02d", this.hora, this.minutos, this.segundos);
        System.out.println(format_hora);
    }
}
