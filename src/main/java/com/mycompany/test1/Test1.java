/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.test1;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author unkont
 */
public class Test1 {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        while(!salir){
           System.out.println("1. suma 2 numeros");
           System.out.println("2. bucle for ");
           System.out.println("3. blucke while");
           System.out.println("4. Salir");
           System.out.println("Escribe una de las opciones: ");
           opcion = sn.nextInt();

                switch(opcion){
                       case 1:
                           int numero1;
                            int numero2;
                            System.out.println("Ingresa num1");
                            Scanner num1 = new Scanner (System.in);
                            numero1 = num1.nextInt();
                            System.out.println("Ingresa num2");
                            Scanner num2 = new Scanner(System.in);
                            numero2 = num2.nextInt();
                            int suma = numero1 * numero2;
                            System.out.println("La suma de los dos números es: " + suma);
                           break;
                       case 2:
                            Scanner sc = new Scanner(System.in);
                            int D;
                            System.out.print("for número dimension: ");
                            D = sc.nextInt();
                            for (int i=1;i<=D;i++){
                                System.out.println(" F ");
                            } 
                           break;
                        case 3:
                            Scanner sc1 = new Scanner(System.in);
                            int N; //variable que contiene el número de asteriscos a mostrar
                            int contador = 0; //variable para contar los asteriscos que se han mostrado                               
                            System.out.print("for número dimension: ");
                            N = sc1.nextInt(); //leemos el número total de asteriscos a mostrar

                            while (contador < N){ //inicio del bucle while                                                            
                                   System.out.print(" W ");
                                   contador++;
                            }  //fin del bucle while
                            
                           break;
                        case 4:
                           salir=true;
                           break;
                        default:
                           System.out.println("Solo números entre 1 y 4");
                   }
                }
        }    
    }
}
