import java.time.LocalDate;
public class CarneManipulacion {

    private String numero;
    private String institucion;
    private LocalDate fechaEmision;
    private LocalDate fechaVencimiento;

    // Constructor
    public CarneManipulacion(String numero, String institucion, String fechaEmision, byte anios) {
        this.numero = numero;
        this.institucion = institucion;
        this.fechaEmision = LocalDate.parse(fechaEmision);
        this.fechaVencimiento = this.fechaEmision.plusYears(anios);
    }

    // Getters
    public String getNumero() { return numero; }

    public String getInstitucion() { return institucion; }

    public LocalDate getFechaEmision() { return fechaEmision; }

    public LocalDate getFechaVencimiento() { return fechaVencimiento; }

    // Setters
    public void setNumero(String numero) { this.numero = numero; }

    public void setInstitucion(String institucion) { this.institucion = institucion; }

    public void setFechaEmision(LocalDate fechaEmision) { this.fechaEmision = fechaEmision; }

    public void setFechaVencimiento(LocalDate fechaVencimiento) { this.fechaVencimiento = fechaVencimiento; }

    // equals()
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof CarneManipulacion)) return false;
        return this.numero.equals(((CarneManipulacion) obj).numero);
    }

    public int hashCode() { return numero.hashCode(); }

    // toString()
    public String toString() {
        return "Número: " + numero + "\nInstitución: " + institucion
            + "\nFecha de emisión: " + fechaEmision
            + "\nFecha de vencimiento: " + fechaVencimiento + "\n";
    }

    public boolean estaVigente() {
        return LocalDate.now().isBefore(fechaVencimiento);
    }
}
