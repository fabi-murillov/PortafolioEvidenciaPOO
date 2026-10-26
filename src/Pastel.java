public class Pastel extends Producto {

    public static final double PRECIO_PORCION = 2500;
    public static final double GRAMOS_PORCION = 120;
    private int porciones;

    // Métodos
    // Constructor
    public Pastel(String nombre, int porciones) {
        super(nombre, "pastel", porciones * GRAMOS_PORCION);
        this.porciones = porciones;
    }

    public double calcularPrecio() {
        return porciones * PRECIO_PORCION;
    }

    public int calcularMinutosPreparacion() {
        return 45 + porciones * 5;
    }

    public void mostrarDetalle() {
        describir();
        System.out.println("  Pastel de " + porciones + " porciones");
    }

    // Getters
    public int getPorciones() { return porciones; }

    // Setters
    public void setPorciones(int porciones) { this.porciones = porciones; }
}
