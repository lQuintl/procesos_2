/*------------------------------------------------------------------*/
/* Program Assignment: Program 2 - PSP 0.1                          */
/* Name: Rodriguez Quintero Luis Rodolfo                            */
/* Date: 6/Nov/2025                                                 */
/* Description: Clase que cuenta o analiza líneas del código fuente.*/
/*------------------------------------------------------------------*/

import java.io.*;

public // Esta es la definición de la clase principal o auxiliar.
class OutPut {
    public // Método que realiza una tarea o proceso específico.
void writeData(// Declaración de una variable o atributo del programa.
String outFile, // Declaración de una variable o atributo del programa.
String outText) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outFile))) {
            bw.write(outText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
