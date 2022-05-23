public class Lavadora {
    boolean estado;
    boolean apertura;
    int programa;
    Deposito detergente, suavizante;

    public Lavadora() {
        this.estado = false;
        this.apertura = true;
        this.programa = 0;
        this.detergente = new Deposito("detergente", 3.0f);
        this.suavizante = new Deposito("suavizante", 5.0f);

    }

    public Deposito getDetergente() {
        return detergente;
    }

    public Deposito getSuavizante() {
        return suavizante;
    }

    public boolean getEstado() {
        return estado;
    }

    public int getPrograma() {
        return programa;
    }

    public Lavadora setEstado() {
        if (estado == false && getDetergente().getRestante() >= 0.8f && getSuavizante().getRestante() >= 0.5f) {
            estado = true;
            return this;
        } else {
            estado = false;
            return this;
        }
    }

    public Lavadora setApertura() {
        if (programa == 0) {
            apertura = true;
            return this;
        }
        return this;
    }

    public Lavadora setCierre() {
        apertura = false;
        return this;
    }

    public Lavadora setPrograma(int programa) {
        if (estado == false) {
            this.programa = programa;
            return this;
        }
        return this;
    }

    public Lavadora nextPrograma() {
        if (estado != false) {
            if (programa == 4) {
                programa = 0;
                estado = false;
                return this;
            } else {
                programa++;
                this.detergente.setQuitar(0.4f);
                this.suavizante.setQuitar(0.2f);
                return this;
            }
        }
        return this;
    }

}