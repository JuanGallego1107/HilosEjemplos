package HiloEjemplo;

public class ProcesoHilo3 implements Runnable {
    @Override
    public void run() {
        System.out.println("Hilo 3: Corriendo... ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hilo 3 en estado Terminado. Proceso terminado en: 1 segundo. ");
    }
}
