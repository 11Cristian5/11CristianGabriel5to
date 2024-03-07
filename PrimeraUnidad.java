/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeraunidad;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class PrimeraUnidad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creamos un objeto Scanner para leer
        System.out.println("Ingresa un numero: ");
        //Pedimos al usuario que ingrese un número
        int a = sc.nextInt();
        //se lee el numero ingresado por el usuario
        if (a % 2 == 0) {
            //Comprobamos si el número es par o impar
            System.out.println("Es par");
            //Si es par, imprimimos "Es par"
        } else {
            //si no 
            System.out.println("No es par");
            //Si no es par, imprimimos "No es par"
        }
        
    }
}
