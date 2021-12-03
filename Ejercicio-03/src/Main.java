import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("ipconfig", "/all");
            pb.redirectOutput(ProcessBuilder.Redirect.to(new File("ipconfig.txt")));

            Process p = pb.start();
            p.waitFor();

            System.out.println("Resultado almacenado en ipconfig.txt");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        try {
            ProcessBuilder pb = new ProcessBuilder("ipconfig", "/all");
            Process p = pb.start();
            InputStream is = p.getInputStream();
            int i;
            while ((i = is.read()) != -1)
                System.out.print((char) i);
            is.close();

            p.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
