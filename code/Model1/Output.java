/*---------------------------------------------------------------------------*/
/* Program Assignment: Program 2 - PSP 0.1                                   */
/* Name: Rodriguez Quintero Luis Rodolfo                                     */
/* Date: 6/Nov/2025                                                          */
/* Description: Clase auxiliar que forma parte de la estructura del programa.*/
/*---------------------------------------------------------------------------*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public // Esta es la definición de la clase principal o auxiliar.
class Output {

    public // Método que realiza una tarea o proceso específico.
void write(// Declaración de una variable o atributo del programa.
String fileName, // Declaración de una variable o atributo del programa.
String text) {
        try {
            Files.writeString(Path.of(fileName), text);
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }
}
