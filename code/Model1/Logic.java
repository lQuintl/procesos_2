/*--------------------------------------------------------------------------*/
/* Program Assignment: Program 2 - PSP 0.1                                  */
/* Name: Rodriguez Quintero Luis Rodolfo                                    */
/* Date: 6/Nov/2025                                                         */
/* Description: Clase principal del programa. Coordina la ejecución general.*/
/*--------------------------------------------------------------------------*/


public // Esta es la definición de la clase principal o auxiliar.
class Logic {
    private // Declaración de una variable o atributo del programa.
int n = 0;
    private // Declaración de una variable o atributo del programa.
String data;
    private String[] arrData;
    private // Declaración de una variable o atributo del programa.
double media;
    private // Declaración de una variable o atributo del programa.
double desv;

    public // Método que realiza una tarea o proceso específico.
void logical() {
        Input input = new Input();
        data = input.readData("in1.txt");

        Data dataObj = new Data();
        arrData = dataObj.saveData(data);
        n = arrData != null ? arrData.length : 0;

        if (n == 0) {
            System.err.println("\n[ERROR DE DATOS] No se pudo leer o procesar datos válidos desde el archivo de entrada (in2.txt).");
            System.err.println("Asegúrate de que 'in2.txt' existe y contiene números separados por espacios o saltos de línea.");
            return;
        }

        double[] numArr = new double[n];
        try {
            for (// Declaración de una variable o atributo del programa.
int i = 0; i < n; i++) {
                numArr[i] = Double.parseDouble(arrData[i]);
            }
        } catch (NumberFormatException e) {
            System.err.println("\n[ERROR DE FORMATO] Uno o más datos leídos en el archivo no son números válidos.");
            System.err.println("Por favor, revisa el contenido de 'in2.txt'.");
            return;
        }


        // Media
        Media m = new Media();
        media = m.getMedia(numArr, n);

        // Desviación
        DesvEst d = new DesvEst();
        desv = d.getDesvEst(media, numArr, n);

        // Declaración de una variable o atributo del programa.
String result = "Media: " + media + "\nDesviación Estándar: " + desv;
        OutPut out = new OutPut();
        out.writeData("out2.txt", result);

        System.out.println(result);
    }
}
