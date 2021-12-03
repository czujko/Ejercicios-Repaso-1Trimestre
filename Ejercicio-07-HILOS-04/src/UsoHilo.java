public class UsoHilo {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arr2 = new int[10];

        //rellena con aleatorios de 1 a 5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 5) + 1;
            arr2[i] = (int) (Math.random() * 5) + 1;
        }

        Hilo hilo = new Hilo(arr,3);
        Hilo hilo2 = new Hilo(arr2,3);

        hilo.start();
        hilo2.start();

        while (hilo.isAlive() || hilo2.isAlive()) {
        }



    }
}
