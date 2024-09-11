/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularsoma;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class CalcularSoma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
