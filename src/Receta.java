public class Receta {

    private String nombre;
    private String categoria;
    private int minutosPreparacion;

    // Constructor
    public Receta(String nombre, String categoria, int minutosPreparacion) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.minutosPreparacion = minutosPreparacion;
    }

    // Getters
    public String getNombre() { return nombre; }

    public String getCategoria() { return categoria; }

    public int getMinutosPreparacion() { return minutosPreparacion; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }

    public void setCategoria(String categoria) { this.categoria = categoria; }

    public void setMinutosPreparacion(int minutosPreparacion) { this.minutosPreparacion = minutosPreparacion; }

    // equals(): misma receta si coinciden nombre y categoría
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Receta)) return false;
        Receta otra = (Receta) obj;
        return this.nombre.equals(otra.nombre) && this.categoria.equals(otra.categoria);
    }

    public int hashCode() { return nombre.hashCode() * 31 + categoria.hashCode(); }

    // toString()
    public String toString() {
        return "Nombre: " + nombre + "\nCategoría: " + categoria
            + "\nTiempo de preparación: " + minutosPreparacion + " min\n";
    }
}
