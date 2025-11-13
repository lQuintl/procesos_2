/*------------------------------------------------------------------------*/
/* Program Assignment: Program 2 - PSP 0.1                                */
/* Name: Rodriguez Quintero Luis Rodolfo                                  */
/* Date: 6/Nov/2025                                                       */
/* Description: Clase que analiza o cuenta métodos definidos en el código.*/
/*------------------------------------------------------------------------*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public // Esta es la definición de la clase principal o auxiliar.
class MethodCounter {

    public // Declaración de una variable o atributo del programa.
int count(// Declaración de una variable o atributo del programa.
String content) {
        // Declaración de una variable o atributo del programa.
String regex = "(public|private|protected)?\\s+[\\w<>\\[\\]]+\\s+\\w+\\s*\\([^)]*\\)\\s*\\{";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);

        // Declaración de una variable o atributo del programa.
int count = 0;
        while (matcher.find()) count++;
        return count;
    }
}
