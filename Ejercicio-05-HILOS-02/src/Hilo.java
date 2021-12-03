public class Hilo extends Thread {
    private String texto;

    public Hilo(String texto) {
        this.texto = texto;
    }

    public void run() {
        String[] palabras = texto.split(" ");
        for (String palabra : palabras) {
            System.out.print(" " + palabra);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
