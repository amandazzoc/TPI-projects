/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example2;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        int soma = num1 + num2;
        int subt = num1 - num2;
        int mult = num1 * num2;
        double div = num1 / num2;
                
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subt);
        System.out.println("Multiplicação: " + mult);
        System.out.println("Divisão: " + div);
        
    }
    
}
