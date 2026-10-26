public class Galleta extends Producto {

    public static final double PRECIO_UNIDAD = 600;
    public static final double GRAMOS_UNIDAD = 40;
    private int unidades;

    // Métodos
    // Constructor
    public Galleta(String nombre, int unidades) {
        super(nombre, "galleta", unidades * GRAMOS_UNIDAD);
        this.unidades = unidades;
    }

    public double calcularPrecio() {
        return unidades * PRECIO_UNIDAD;
    }

    public int calcularMinutosPreparacion() {
        return 25;
    }

    public void mostrarDetalle() {
        describir();
        System.out.println("  Paquete de " + unidades + " galletas");
    }

    // Getters
    public int getUnidades() { return unidades; }

    // Setters
    public void setUnidades(int unidades) { this.unidades = unidades; }
}
