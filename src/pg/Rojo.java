package pg;

public class Rojo implements Estado{
    private Semaforo s;

    public Rojo(Semaforo s){
        this.s = s;
        System.out.println("Semaforo en rojo");
    }

    @Override
    public void mostrarAviso() {
        System.out.println("Detenerse");
    }

    @Override
    public void cambiarEstado() {
        s.setEstado(new Verde(s));
    }
}
