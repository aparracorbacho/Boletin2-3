/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2.pkg3;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class Boletin23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float cambio, euros;
        System.out.println("Introduce la cantidad de euros");
        Scanner eurosTeclado = new Scanner(System.in);
        euros = eurosTeclado.nextFloat();
        System.out.println("Introduce el valor del dolar");
        Scanner cambioTeclado = new Scanner(System.in);
        cambio = cambioTeclado.nextFloat();
        System.out.println("El cambio en dólares es: "+euros*cambio);
    }
    
}
