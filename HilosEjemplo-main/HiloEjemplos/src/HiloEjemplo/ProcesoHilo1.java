package HiloEjemplo;

public class ProcesoHilo1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Hilo 1: Corriendo...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hilo 1 en estado Terminado. Proceso terminado en: 5 segundos. ");
    }
}
