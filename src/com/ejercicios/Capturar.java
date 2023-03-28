package com.ejercicios;

import java.util.Scanner;

public class Capturar {

    static Scanner sc = new Scanner(System.in);

    /**
     * Escribe un programa que lanza una Excepción y la capture.
     */
    public int pedirNumero() {
        int numero = 0;
        do {
            System.out.println("Ingrese el número :");
            String pedir;

            try {
                pedir = sc.nextLine();
                numero = Integer.parseInt(pedir);
                System.out.println(numero);

            } catch (Exception e) {
                System.err.println("Número erróneo, inténtalo de nuevo");
            }
        } while (numero == 0);
        return numero;
    }

    /**Escriba un programa que genere pida números por teclado y los imprima,
     * en caso de recibir un dato que no sea un número, tratará la excepción
     * producida por el Scanner y volverá a solicitar el número al usuario.
     */

    public void pedirNumerosteclado() {
        int[] numero= new int[10];
        int contador=0;
        do {
            System.out.println("Ingrese un número :");
            String pedir;
            for (int i = 0; i <numero.length ; i++) {
            try {
                pedir = sc.nextLine();
                    numero[i] = Integer.parseInt(pedir);
                    contador=i;


            } catch (Exception e) {
                System.err.println("Número erróneo, inténtalo de nuevo");
            }
            }

        } while(contador==10);
        for (int i = 0; i <numero.length ; i++) {
            System.out.println(numero[i]);
        }

    }

    /**Escribe un programa Java que pida al usuario dos números enteros y realice una división
     * entre ellos. El programa debe manejar las excepciones aritméticas que puedan surgir,
     * como la división entre cero o el desbordamiento de enteros. Si ocurre alguna excepción,
     * el programa debe imprimir un mensaje de error apropiado en la consola y volver a pedir
     * los números al usuario hasta que la división se pueda realizar correctamente.
     * Cuando la división se realiza correctamente, el programa debe imprimir el resultado
     * en la consola. El programa debe seguir pidiendo números y realizando divisiones hasta
     * que el usuario decida salir del programa.*/

    public void divisionEnteros(){
        System.out.println("Ingrese los números a dividir");
        int numero1=0;
        int numero2=0;
        double division=0;
        do {
            numero1 = sc.nextInt();
            numero2 = sc.nextInt();

            try {
                division = numero1 / numero2;
                System.out.println(division);
            } catch (ArithmeticException e) {
                System.err.println("Método de diivsión no permitido en enteros, intenta otra vez");
            }
        }while(division==0);


    }

}
