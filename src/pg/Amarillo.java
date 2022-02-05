package pg;

public class Amarillo implements Estado{
    private Semaforo s;

    public Amarillo(Semaforo s){
        this.s = s;
        System.out.println("Semaforo en amarillo");
    }

    @Override
    public void mostrarAviso() {
        System.out.println("Precaución");
    }

    @Override
    public void cambiarEstado() {
        s.setEstado(new Rojo(s));
    }
}
