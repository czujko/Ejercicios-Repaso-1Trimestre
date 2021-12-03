public class Hilo extends Thread {
    private double[] array;
    private double media;
    private double suma;
    private boolean hecho;

    public Hilo(String nombre) {
        this.array = new double[1000];
        this.media = 0;
        this.hecho = false;
    }

    public void run() {
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        media = suma / array.length;
        hecho = true;
    }

    public double[] getArray() {
        return array;
    }

    public double getMedia() {
        return media;
    }

    public boolean isHecho() {
        return hecho;
    }

    public void setHecho(boolean hecho) {
        this.hecho = hecho;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public void setArray(double[] array) {
        this.array = array;
    }
}
