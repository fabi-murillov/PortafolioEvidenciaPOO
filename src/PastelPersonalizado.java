public class PastelPersonalizado extends Pastel {

    public static final double RECARGO_DISENO = 0.25;
    public static final int MINUTOS_DISENO = 30;
    private String diseno;

    // Métodos
    // Constructor
    public PastelPersonalizado(String nombre, int porciones, String diseno) {
        super(nombre, porciones);
        this.diseno = diseno;
    }

    public double calcularPrecioFinal() {
        return calcularPrecio() * (1 + RECARGO_DISENO);
    }

    public int calcularMinutosTotales() {
        return calcularMinutosPreparacion() + MINUTOS_DISENO;
    }

    public void mostrarDetalleCompleto() {
        mostrarDetalle();
        System.out.println("  Diseño personalizado: " + diseno);
    }

    // Getters
    public String getDiseno() { return diseno; }

    // Setters
    public void setDiseno(String diseno) { this.diseno = diseno; }
}
