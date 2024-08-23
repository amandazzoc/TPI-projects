/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularquadrado;

import java.util.Scanner;
/**
 *
 * @author fatec-dsm2
 */
public class calcularQuadrado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numero = scan.nextInt();
        
        double quadrado = Math.pow(numero, 2);
        
        System.out.println("O quadrado do " + numero + " é: " + quadrado);
    }
}
