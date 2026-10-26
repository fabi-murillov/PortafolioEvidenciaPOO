public class Administrador extends Empleado {

    // Constructor
    public Administrador(String nombre, String apellidos) {
        super(nombre, apellidos, "Administración");
    }

    public Empleado contratarEmpleado(String nombre, String apellidos, String puesto) {
        Empleado nuevoEmpleado = new Empleado(nombre, apellidos, puesto);
        System.out.println("Se ha contratado a: " + nombre + " " + apellidos + " (" + puesto + ")");
        return nuevoEmpleado;
    }

    public Pastelero contratarPastelero(String nombre, String apellidos) {
        Pastelero nuevoPastelero = new Pastelero(nombre, apellidos);
        System.out.println("Se ha contratado a: " + nombre + " " + apellidos + " (Pastelero)");
        return nuevoPastelero;
    }
}
