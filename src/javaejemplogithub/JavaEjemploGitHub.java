/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejemplogithub;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class JavaEjemploGitHub {

    /**
     * Esta funcion suma tres numeros
     * @param n1 primer numero
     * @param n2 segundo numero
     * @param n3 tercer numero
     * @return devuelve la suma de los tres numeros
     */
    
    public int sumar3numeros(int n1, int n2, int n3){
        int suma = n1 + n2 + n3;
        return suma;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero");
        int numero = teclado.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(numero * i);
        }
    }
}
