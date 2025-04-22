package Controllers;

import Models.Persona;

/**
 * Controlador para manejar la lógica de operaciones sobre arrays de Persona.
 */
public class PersonaController {
    /**
     * Método para ordenar un arreglo de Persona por edad utilizando el algoritmo de
     * inserscion .
     * 
     * @param personas Array de Persona a ordenar.
     */
    public void ordenarPorEdad(Persona[] personas) {
        // Implementación del algoritmo de ordenamiento por inserción
        for (int i = 1; i < personas.length; i++) {
            Persona key = personas[i];
            int j = i - 1;
    
                // CompaRAR POR EDAD (ASCENDENTE )
            while (j >= 0 && personas[j].edad > key.edad) {
                personas[j + 1] = personas[j];
                j = j - 1;
            }
                personas[j + 1] = key;
        }
    
            // Print sorted array
            for (Persona persona : personas) {
                System.out.println(persona);
            }
        }
       /**
    }

    /**
     * Método para buscar la primera persona con una edad específica en un array de
     * Persona.
     * 
     * @param personas Array de Persona donde buscar.
     * @param edad     Edad a buscar.
     * @return La primera Persona con la edad especificada, o null si no se
     *         encuentra.
     */
    public Persona buscarPorEdad(Persona[] personas, int edad) {
        int left = 0;  
        int right = personas.length - 1;  
    
        // Asegúrate de que el arreglo esté ordenado por edad para que la búsqueda binaria funcione correctamente  
        while (left <= right) {  
            int mid = left + (right - left) / 2;  
    
            // Se asegura de que el valor de 'mid' no intente acceder a una posición nula  
            if (personas[mid] != null && personas[mid].edad == edad) {  
                return personas[mid];  
            } else if (personas[mid] != null && personas[mid].edad < edad) {  
                left = mid + 1;  
            } else {  
                right = mid - 1;  
            }  
        }  
        return null; // No se encontró ninguna coincidencia  
    }


    
}
