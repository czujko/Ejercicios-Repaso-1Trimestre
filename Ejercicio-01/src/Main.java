import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("mspaint.exe");
        ProcessBuilder pb2 = new ProcessBuilder("notepad.exe");
        ProcessBuilder pb3 = new ProcessBuilder("calc.exe");
        try {
            Process p = pb.start();
            Process p2 = pb2.start();
            Process p3 = pb3.start();
            p.waitFor();
            System.out.println("Paint terminado");
            p2.waitFor();
            System.out.println("Notepad terminado");
            p3.waitFor();
            System.out.println("Calc terminado");
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
