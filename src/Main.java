public class Main {

    public static void main(String[] args) {

        // Productos
        Pastel tresLeches = new Pastel("Pastel de tres leches", 12);
        PastelPersonalizado boda = new PastelPersonalizado("Pastel de boda", 20, "flores de azúcar");
        Galleta chips = new Galleta("Galletas con chispas", 12);

        tresLeches.mostrarDetalle();
        System.out.println("  Precio: " + (long) tresLeches.calcularPrecio()
            + " | Preparación: " + tresLeches.calcularMinutosPreparacion() + " min");

        boda.mostrarDetalleCompleto();
        System.out.println("  Precio: " + (long) boda.calcularPrecioFinal()
            + " | Preparación: " + boda.calcularMinutosTotales() + " min");

        chips.mostrarDetalle();
        System.out.println("  Precio: " + (long) chips.calcularPrecio()
            + " | Preparación: " + chips.calcularMinutosPreparacion() + " min");
        System.out.println();

        // Personal
        Administrador carla = new Administrador("Carla", "Mora");
        Pastelero maria = carla.contratarPastelero("María", "Rojas");
        Pastelero luis = carla.contratarPastelero("Luis", "Vargas");
        Empleado cajero = carla.contratarEmpleado("Andrés", "Solís", "Cajero");
        System.out.println();

        // María saca su carné vigente y Luis aún no tiene carné
        maria.sacarCarne("CM-100245", "Ministerio de Salud", "2025-03-15", (byte) 2);

        carla.trabajar();
        maria.trabajarConCarne();
        luis.trabajarConCarne();
        cajero.trabajar();
        System.out.println("Salario semanal de " + maria.getNombreCompleto() + ": "
            + (long) maria.calcularSalario());
        System.out.println();

        // Una misma receta compartida
        Receta receta = new Receta("Pastel de tres leches", "Pasteles", 90);
        maria.aprenderReceta(receta);
        luis.aprenderReceta(receta);
        maria.practicarReceta();
        luis.practicarReceta();
        System.out.println("¿Comparten la misma receta? " + (maria.getReceta() == luis.getReceta()));
        System.out.println();

        // El horno solo admite productos de tipo "pastel"
        Horno horno = new Horno("Rational", "SCC-101", 300, "pastel");
        maria.hornear(horno, tresLeches);
        maria.hornear(horno, boda);     
        maria.hornear(horno, chips);
        luis.hornear(horno, tresLeches);
    }
}
