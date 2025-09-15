/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;
import java.util.function.DoubleUnaryOperator;

/*
 * Archivo:Tabula.java
 * Alumno:Zamudio Corona Javier Sabdiel
 * ID:00000251925
 * Fecha de creación:02/Septiembre/2025
 *
 * Descripción:
 * Clase que implementa el método tabula, encargado de recibir una función (DoubleUnaryOperator) 
 * y evaluarla en el rango definido por [xi, xf], avanzando en pasos de tamaño incx.
 * Adicionalmente, muestra el valor máximo y mínimo que alcanza la función dentro de ese intervalo.
 */

public class Tabula {
    /**
     * Método que tabula una función en el intervalo dado, mostrando los puntos
     * (x, y) y determinando el máximo y el mínimo en el intervalo.
     *
     * @param f   Función a tabular (implementa DoubleUnaryOperator)
     * @param xi  Límite inferior
     * @param xf  Límite superior
     * @param incx Incremento en x
     */
     public String tabula(DoubleUnaryOperator f, double xi, double xf, double incx) {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("\nTabulación de la función en el intervalo [%.2f, %.2f] con incremento %.2f\n", xi, xf, incx));
        sb.append("-----------------------------------------------------\n");
        sb.append(String.format("%12s | %12s\n", "x", "y"));
        sb.append("-----------------------------------------------------\n");

        double x = xi;
        double maxY = Double.NEGATIVE_INFINITY;
        double minY = Double.POSITIVE_INFINITY;
        double maxX = xi;
        double minX = xi;
        int contador = 0; // contador de puntos

        while (x <= xf + 1e-9) {
            double y = f.applyAsDouble(x); // calcula valor de la función en x
            sb.append(String.format("%12.6f | %12.6f\n", x, y)); // agrega al resultado

            // Actualizar máximo y mínimo si corresponde
            if (y > maxY) { maxY = y; maxX = x; }
            if (y < minY) { minY = y; minX = x; }

            x += incx; // incrementar x
            contador++; // contador de número de puntos tabulados
        }

        sb.append("-----------------------------------------------------\n");
        sb.append(String.format("Máximo en (x=%.6f, y=%.6f)\n", maxX, maxY));
        sb.append(String.format("Mínimo en (x=%.6f, y=%.6f)\n", minX, minY));
        sb.append("-----------------------------------------------------\n");

        // Mensaje adicional sobre puntos tabulados
        sb.append(String.format("Se tabularon %d puntos en el intervalo [%.2f, %.2f].\n", contador, xi, xf));
        
        return sb.toString();
    }
     
     
}
