public class Productor extends Thread {
    private Cola cola;

    public Productor(Cola cola) {
        this.cola = cola;
    }

    //Aleatorios de 1 a 100
    public void run() {
        while(true) {
            int num = (int) (Math.random() * 100 + 1);
            cola.put(num);
            System.out.println("Productor inserta " + num);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
