/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;
import implementaciones.Tabula;
import java.util.function.DoubleUnaryOperator;

/*
 * Archivo: PruebaTabula.java
 * Alumno: Zamudio Corona Javier Sabdiel
 * ID: 00000251925
 * Fecha de creación: 02 - Septiembre - 2025
 *
 * Descripción:
 * Clase principal que define las funciones f(x) y g(x) mediante expresiones
 * lambda y utiliza la clase Tabula para tabularlas en los intervalos indicados.
 */
public class PruebaTabula {

    public static void main(String[] args) {
        // Mensaje inicial para el usuario
        System.out.println("Programa de Tabulación de Funciones");
        System.out.println("===================================");

        Tabula t = new Tabula();

        // Definición de las funciones usando expresiones lambda
        DoubleUnaryOperator f = (x) -> 4*Math.pow(x, 3) - 6*Math.pow(x, 2) + 7*x - 2.3;
        DoubleUnaryOperator g = (x) -> x * Math.abs(Math.cos(x)) - 5;

        // Tabulación de las funciones con los intervalos especificados
        t.tabula(f, 0.0, 1.0, 0.1);
        t.tabula(g, -3.0, -2.0, 0.1);
        t.tabula(g, 2.0, 3.0, 0.1);

        // Mensaje final
        System.out.println("Fin de la ejecución del programa.");
    }
    
}
