/*-------------------------------------------------------------------------*/
/* Program Assignment: Program 2 - PSP 0.1                                 */
/* Name: Rodriguez Quintero Luis Rodolfo                                   */
/* Date: 6/Nov/2025                                                        */
/* Description: Clase que maneja la salida o impresión de datos en consola.*/
/*-------------------------------------------------------------------------*/


public // Esta es la definición de la clase principal o auxiliar.
class Logic2 {

    private final // Declaración de una variable o atributo del programa.
String inputFile;

    public Logic2(// Declaración de una variable o atributo del programa.
String fileName) {
        this.inputFile = fileName;
    }

    public // Método que realiza una tarea o proceso específico.
void run() {
        Input input = new Input();
        // Declaración de una variable o atributo del programa.
String content = input.readData(inputFile); // Usa tu versión de Input.java

        LineCounter lineCounter = new LineCounter();
        // Declaración de una variable o atributo del programa.
int totalLines = lineCounter.count(content);

        MethodCounter methodCounter = new MethodCounter();
        // Declaración de una variable o atributo del programa.
int totalMethods = methodCounter.count(content);

        // Declaración de una variable o atributo del programa.
String result = String.format(
            "Archivo: %s%n---------------------------------------%nLíneas Lógicas (LOC): %d%nMétodos Encontrados: %d%n",
            inputFile, totalLines, totalMethods
        );

        // Mostrar en consola
        System.out.println(result);

        // Guardar resultados
        Output output = new Output();
        output.write("output.txt", result);
    }
}
