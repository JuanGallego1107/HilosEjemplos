package HiloEjemplo;

public class HilosProcesos {
    public static void main(String[] args) {
        Thread hilo1 = new Thread(new ProcesoHilo1());
        Thread hilo2 = new Thread(new ProcesoHilo2());
        Thread hilo3 = new Thread(new ProcesoHilo3());

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
