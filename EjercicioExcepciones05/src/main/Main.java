/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random aleatorio = new Random();
        int numSecreto = aleatorio.nextInt(10) + 1;
        System.out.println("-------------------");
        System.out.println("Numero secreto: " + numSecreto);
        int cantIntentos = 0;
        System.out.println("-------------------");
        System.out.println("Adivina el número!!!");
        
        boolean salir = true;

        do {
            try {
                System.out.println("Ingresa un numero:");
                int num = leer.nextInt();

                if (num == numSecreto) {
                    System.out.println("Felicitaciones!!! ACERTASTE!!!");
                    salir = false;
                } else if (num < numSecreto) {
                    System.out.println("El numero a adivinar es MAYOR");
                } else {
                    System.out.println("El numero a adivinar es MENOR");
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Debes ingresar un número entero");
                leer.nextLine();
            } finally {
                cantIntentos++;
                System.out.println("Intentos: " + cantIntentos);
            }
        } while (salir);

    }
}
