
import Models.Persona;


public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona("Juan",25),
            new Persona("Maria",30),
            new Persona("Carlos",22),
            new Persona("Ana",28),
            new Persona("Luis",35),
            new Persona("Sofia",27),
            new Persona("Miguel",40),
            new Persona("Laura",32),
            new Persona("Pedro",29),
            new Persona("Elena",26),

        };

        /// TODO: GENERAR INSTNACIA DE CONTROLLE Y ORDENAR EL METODO DESPUES BUSCAR POR
        /// LA EDAD

    };
    Controlador controlador = new Controlador();

    // Imprimir el arreglo original  
    System.out.println("Arreglo original:");
    imprimirArreglo(personas);

    // Ordenar el arreglo por edad  
    controlador.ordenarPorEdad(personas);
    System.out.println("\nArreglo ordenado por edad:");
    imprimirArreglo(personas);

    // Buscar por edad 40  
    Persona resultado40 = controlador.buscarPorEdad(personas, 40);
    if (resultado40 != null) {
        System.out.println("\nEncontrado (edad 40): " + resultado40);
    } else {
        System.out.println("\nNo se encontró a nadie con la edad 40.");
    }

    // Buscar por edad 99  
    Persona resultado99 = controlador.buscarPorEdad(personas, 99);
    if (resultado99 != null) {
        System.out.println("Encontrado (edad 99): " + resultado99);
    } else {
        System.out.println("No se encontró a nadie con la edad 99.");
    }
}

    public static void imprimirArreglo(Persona[] personas) {
    for (Persona p : personas) {
        System.out.println(p);
    }
}
