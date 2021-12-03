public class Hilo extends Thread {
    private int[] arr;
    private int victima;

    public Hilo(int[] arr, int victima) {
        this.arr = arr;
        this.victima = victima;
    }
    //run() recorre el array y elimina el elemento que coincida con el valor victima
    public void run() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == victima) {
                arr[i] = 0;
                System.out.println(getName() +"==> Detectado " + victima + " en la posicion " + i + ": ha sido eliminado");
            } else {
                System.out.println(getName() + "==> No hay polizones en la posicion " + i);
            }
        }
    }
}
