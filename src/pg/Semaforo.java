package pg;

public class Semaforo {
    private Estado estado;

    public Semaforo() {
        estado = new Verde(this);
    }

    public void mostrarAviso(){
        estado.mostrarAviso();
    }

    public void cambiarEstado(){
        estado.cambiarEstado();
    }


    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
