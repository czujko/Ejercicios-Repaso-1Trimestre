import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class UsaHilo {
    public static void main(String[] args) {
        double[] arr = new double[1000];
        double[] arr2 = new double[1000];
        double[] arr3 = new double[1000];

        double media = 0;
        double media2 = 0;
        double media3 = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 1000;
            arr2[i] = Math.random() * 1000;
            arr3[i] = Math.random() * 1000;
        }

        Hilo hilo = new Hilo("Hilo 1");
        Hilo hilo2 = new Hilo("Hilo 2");
        Hilo hilo3 = new Hilo("Hilo 3");

        hilo.setArray(arr);
        hilo2.setArray(arr2);
        hilo3.setArray(arr3);

        hilo.start();
        hilo2.start();
        hilo3.start();

        while (hilo.isAlive() || hilo2.isAlive() || hilo3.isAlive()) {
        }

        media = Math.round(hilo.getMedia() * 100) / 100.0;
        media2 = Math.round(hilo2.getMedia() * 100) / 100.0;
        media3 = Math.round(hilo3.getMedia() * 100) / 100.0;


        System.out.println("Media Hilo 1: " + media);
        System.out.println("Media Hilo 2: " + media2);
        System.out.println("Media Hilo 3: " + media3);

        HashMap<String, Double> map = new HashMap<>();
        map.put("Hilo 1", media);
        map.put("Hilo 2", media2);
        map.put("Hilo 3", media3);

        ordenDecreciente(map);
        ordenCreciente(map);
    }

    public static void ordenDecreciente(HashMap<String, Double> map) {
        System.out.println("\nOrden decreciente:");
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }

    public static void ordenCreciente(HashMap<String, Double> map) {
        System.out.println("\nOrden creciente:");
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
                .forEach(System.out::println);
    }
}
