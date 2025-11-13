/*------------------------------------------------------------------------------------*/
/* Program Assignment: Program 2 - PSP 0.1                                            */
/* Name: Rodriguez Quintero Luis Rodolfo                                              */
/* Date: 6/Nov/2025                                                                   */
/* Description: Clase encargada de manejar la entrada de datos del usuario o archivos.*/
/*------------------------------------------------------------------------------------*/


import java.io.*;

public // Esta es la definición de la clase principal o auxiliar.
class Input {
    private // Declaración de una variable o atributo del programa.
String data;
    private BufferedReader br = null;

    public // Declaración de una variable o atributo del programa.
String readData(// Declaración de una variable o atributo del programa.
String inFile) {
        StringBuilder sb = new StringBuilder();
        try {
            br = new BufferedReader(new FileReader(inFile));
            // Declaración de una variable o atributo del programa.
String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString().trim();
    }
}

