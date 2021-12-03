public class Consumidor extends Thread {
    private Cola cola;

    public Consumidor(Cola cola) {
        this.cola = cola;
    }

    //run() Eleva al cubo el elemento de la cola
    public void run() {
        while (true) {
            int elemento = cola.get();
            System.out.println("El cubo es: " + Math.pow(elemento, 3));
        }
    }
}
