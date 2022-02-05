package pg;

public class Verde implements Estado{
    private Semaforo s;

    public Verde(Semaforo s){
        this.s = s;
        System.out.println("Semaforo en verde");
    }


    @Override
    public void mostrarAviso() {
        System.out.println("Avanzar");
    }

    @Override
    public void cambiarEstado() {
        s.setEstado(new Amarillo(s));
    }
}
