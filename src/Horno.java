import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Horno {

    private BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    private String marca;
    private String modelo;
    private double temperaturaMaxima;
    private String[] productos;

    // Constructor
    public Horno(String marca, String modelo, double temperaturaMaxima, int cantidadProductos) {
        this.marca = marca;
        this.modelo = modelo;
        this.temperaturaMaxima = temperaturaMaxima;
        this.productos = new String[cantidadProductos];
    }

    public Horno(String marca, String modelo, double temperaturaMaxima, String... productos) {
        this.marca = marca;
        this.modelo = modelo;
        this.temperaturaMaxima = temperaturaMaxima;
        this.productos = productos;
    }

    // Getters
    public String getMarca() { return marca; }

    public String getModelo() { return modelo; }

    public double getTemperaturaMaxima() { return temperaturaMaxima; }

    public String[] getProductos() { return productos; }

    // Setters
    public void setMarca(String marca) { this.marca = marca; }

    public void setModelo(String modelo) { this.modelo = modelo; }

    public void setTemperaturaMaxima(double temperaturaMaxima) { this.temperaturaMaxima = temperaturaMaxima; }

    // equals()
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Horno)) return false;
        Horno otro = (Horno) obj;
        return this.marca.equals(otro.marca) && this.modelo.equals(otro.modelo);
    }

    public int hashCode() { return marca.hashCode() * 31 + modelo.hashCode(); }

    // toString()
    public String toString() {
        return "Marca: " + marca + "\nModelo: " + modelo
            + "\nTemperatura máxima: " + temperaturaMaxima + " °C"
            + "\nProductos: " + Arrays.toString(productos);
    }

    public void definirProductos() throws IOException {
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Ingrese el producto " + (i + 1) + ": ");
            productos[i] = entrada.readLine();
        }
    }

    public void hornear(String tipoProducto) {
        for (int i = 0; i < productos.length; i++) {
            if (tipoProducto.equals(productos[i])) {
                System.out.println("El horno " + marca + " " + modelo + " hornea productos de tipo: " + tipoProducto + ".\n");
                return;
            }
        }
        System.out.println("El horno " + marca + " " + modelo + " no puede hornear productos de tipo: " + tipoProducto + ".\n");
    }
}
