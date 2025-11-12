/*---------------------------------------------------------------------------*/
/* Program Assignment: Program 2 - PSP 0.1                                   */
/* Name: Rodriguez Quintero Luis Rodolfo                                     */
/* Date: 6/Nov/2025                                                          */
/* Description: Clase principal del programa. Coordina la ejecución general. */
/*---------------------------------------------------------------------------*/


public // Esta es la definición de la clase principal o auxiliar.
class AppPSP {
    public static // Método que realiza una tarea o proceso específico.
void main(String[] args) {
        // Si no se pasa un argumento, usa App.java por defecto
        // Declaración de una variable o atributo del programa.
String fileName = (args.length > 0) ? args[0] : "App.java";

        Logic2 logic = new Logic2(fileName);
        logic.run();
    }
}
