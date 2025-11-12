/*------------------------------------------------------------------------------*/
/* Program Assignment: Program 2 - PSP 0.1                                      */
/* Name: Rodriguez Quintero Luis Rodolfo                                        */
/* Date: 6/Nov/2025                                                             */
/* Description: Clase que calcula la media o promedio de un conjunto de valores.*/
/*------------------------------------------------------------------------------*/


import java.lang.Math;

public // Esta es la definición de la clase principal o auxiliar.
class DesvEst {

    public // Declaración de una variable o atributo del programa.
double getDesvEst(// Declaración de una variable o atributo del programa.
double media, double[] dataList, // Declaración de una variable o atributo del programa.
int n) {
        if (n <= 1) {
            return 0.0;
        }

        // Declaración de una variable o atributo del programa.
double sum = 0;

        for (// Declaración de una variable o atributo del programa.
int i = 0; i < n; i++) {
            // Declaración de una variable o atributo del programa.
double value = dataList[i];
            sum += Math.pow(value - media, 2);
        }

        return Math.sqrt(sum / (n - 1));
    }
}
