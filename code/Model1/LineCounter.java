/*------------------------------------------------------------------*/
/* Program Assignment: Program 2 - PSP 0.1                          */
/* Name: Rodriguez Quintero Luis Rodolfo                            */
/* Date: 6/Nov/2025                                                 */
/* Description: Clase que cuenta o analiza líneas del código fuente.*/
/*------------------------------------------------------------------*/

public // Esta es la definición de la clase principal o auxiliar.
class LineCounter {

    public // Declaración de una variable o atributo del programa.
int count(// Declaración de una variable o atributo del programa.
String content) {
        boolean inBlockComment = false;
        // Declaración de una variable o atributo del programa.
int count = 0;

        for (// Declaración de una variable o atributo del programa.
String line : content.split("\\R")) {
            // Declaración de una variable o atributo del programa.
String trimmed = line.trim();
            if (trimmed.isEmpty()) continue;

            if (inBlockComment) {
                if (trimmed.contains("*/")) inBlockComment = false;
                continue;
            }

            if (trimmed.startsWith("/*")) {
                if (!trimmed.contains("*/")) inBlockComment = true;
                continue;
            }

            if (trimmed.startsWith("//")) continue;
            count++;
        }
        return count;
    }
}
