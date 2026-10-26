public class Producto {

    private String nombre;
    private String tipo;
    private double pesoGramos;

    // Métodos
    // Constructor
    public Producto(String nombre, String tipo, double pesoGramos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.pesoGramos = pesoGramos;
    }

    public void describir() {
        System.out.println("Producto: " + nombre + " (" + pesoGramos + " g)");
    }

    // Getters
    public String getNombre() { return nombre; }

    public String getTipo() { return tipo; }

    public double getPesoGramos() { return pesoGramos; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }

    public void setPesoGramos(double pesoGramos) { this.pesoGramos = pesoGramos; }

    // toString
    public String toString() {
        return "Nombre: " + nombre + "\nTipo: " + tipo + "\nPeso: " + pesoGramos + " g\n";
    }
}
