/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* int numero1 = 50;;
        int numero2 = 70;
        int soma = numero1+numero2;
        System.out.println("O valor da soma é: " + soma); */
        
        int num1, num2, soma;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        num1 = scan.nextInt();
        System.out.println("Digite o segundo número:");
        num2 = scan.nextInt();
        soma = num1 + num2;
        
        System.out.println("O valor da soma é: " + soma);
    }
    
}
