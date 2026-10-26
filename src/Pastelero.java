public class Pastelero extends Empleado {

    private CarneManipulacion carne;
    private Receta receta;

    // Métodos
    // Constructor
    public Pastelero(String nombre, String apellidos) {
        super(nombre, apellidos, "Pastelero");
        carne = null;
        receta = null;
    }

    // Getters
    public CarneManipulacion getCarne() { return carne; }

    public Receta getReceta() { return receta; }

    public void sacarCarne(String numero, String institucion, String fechaEmision, byte anios) {
        this.carne = new CarneManipulacion(numero, institucion, fechaEmision, anios);
    }

    public void trabajarConCarne() {
        if (!tieneCarneVigente()) {
            System.out.println(getNombreCompleto() + " no puede trabajar, ya que su carné "
                + "de manipulación no está vigente.");
        } else {
            super.trabajar();
        }
    }

    public void aprenderReceta(Receta receta) { this.receta = receta; }

    public void practicarReceta() {
        if (receta == null) {
            System.out.println(getNombreCompleto() + " no conoce ninguna receta para practicar.");
        } else {
            System.out.println(getNombreCompleto() + " prepara la receta de " + receta.getNombre()
                + " (" + receta.getMinutosPreparacion() + " min).");
        }
    }

    public void hornear(Horno horno, Producto producto) {
        if (horno == null) {
            System.out.println(getNombreCompleto() + " no puede hornear sin un horno.\n");
        } else if (!tieneCarneVigente()) {
            System.out.println(getNombreCompleto() + " no puede hornear, ya que su carné de "
                + "manipulación no está vigente.\n");
        } else {
            System.out.println(getNombreCompleto() + " intenta hornear " + producto.getNombre() + ".");
            horno.hornear(producto.getTipo());
        }
    }

    private boolean tieneCarneVigente() { return carne != null && carne.estaVigente(); }
}
