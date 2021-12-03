public class UsoProCon {
    public static void main(String[] args) {
        Cola cola = new Cola();

        Productor p1 = new Productor(cola);
        Consumidor c1 = new Consumidor(cola);

        p1.start();
        c1.start();
    }
}
