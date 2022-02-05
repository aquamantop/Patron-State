package pg;

public class Main {
    public static void main(String[] args) {
        Semaforo s1 = new Semaforo();

        s1.mostrarAviso();
        s1.cambiarEstado();
        s1.mostrarAviso();
        s1.cambiarEstado();
        s1.mostrarAviso();


    }
}
