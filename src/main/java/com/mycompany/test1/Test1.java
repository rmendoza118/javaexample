/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.test1;
import java.util.Scanner; 
/**
 *
 * @author unkont
 */
public class Test1 {

    public static void main(String[] args) {
         int numero1;
        int numero2;
        
        System.out.println("Ingresa el primero número");
        Scanner num1 = new Scanner (System.in);
        numero1 = num1.nextInt();
        System.out.println("Ingresa el segundo número");
        Scanner num2 = new Scanner(System.in);
        numero2 = num2.nextInt();
        int suma = numero1 * numero2;
        System.out.println("La suma de los dos números es: " + suma);
        
    }
}
