/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        try {
            //InputMismatchException:
//            System.out.println("Ingrese un numero");
//            int num = leer.nextInt();
//            System.out.println("Dato ingresado: "+num);

            //ArithmeticException:
//            System.out.println("Division: 10/0");
//            int div = 10/0;

            //NumberFormatException:
            System.out.println("Ingrese un numero:");
            String numString = leer.next();
            int num = Integer.parseInt(numString);
            System.out.println("Numero: "+num);
            
        } catch (InputMismatchException e) {
            System.out.println("Error: el dato ingresado no coincide con el requerido(int). " + e);
        } catch (NumberFormatException e) {
            System.out.println("Error: el dato ingresado no puede ser convertido a un entero. " + e);
        } catch (ArithmeticException e) {
            System.out.println("Error: la division no se puede realizar. " + e);
        }

    }
}
