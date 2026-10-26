public class Empleado {

    // Atributos
    private String nombre;
    private String apellidos;
    private String puesto;
    public static final double HORAS_TRABAJADAS_DIA = 8;
    public static final double DIAS_TRABAJADOS_SEMANA = 6;
    public static final double PAGO_HORA = 5000;

    // Métodos
    // Constructor
    public Empleado(String nombre, String apellidos, String puesto) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.puesto = puesto;
    }

    // Getters
    public String getNombre() { return nombre; }

    public String getApellidos() { return apellidos; }

    public String getPuesto() { return puesto; }

    public String getNombreCompleto() { return nombre + " " + apellidos; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }

    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public void setPuesto(String puesto) { this.puesto = puesto; }

    public void trabajar() {
        System.out.println(getNombreCompleto() + " trabaja en el puesto " + puesto);
    }

    public double calcularSalario() {
        return HORAS_TRABAJADAS_DIA * DIAS_TRABAJADOS_SEMANA * PAGO_HORA;
    }
}
