package HiloEjemplo;

public class ProcesoHilo2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Hilo 2 : Corriendo...");
        try {
            Thread.sleep(3000);
            System.out.println("Hilo 2 en estado Terminado.Proceso terminado en: 3 segundos.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}