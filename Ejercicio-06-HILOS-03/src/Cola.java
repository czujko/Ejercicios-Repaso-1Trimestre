public class Cola {
    private int numero;
    private boolean ocupado = false;

    public synchronized void put(int numero) {
        while (ocupado) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.numero = numero;
        ocupado = true;
        notifyAll();
    }

    public synchronized int get() {
        while (!ocupado) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        ocupado = false;
        notifyAll();
        return numero;
    }
}
