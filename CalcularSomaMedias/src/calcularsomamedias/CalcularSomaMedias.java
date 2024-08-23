/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularsomamedias;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class CalcularSomaMedias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota1 = scan.nextInt();
        int nota2 = scan.nextInt();
        int nota3 = scan.nextInt();
        double media1 = (nota1+nota2+nota3)/3;
        int nota4 = scan.nextInt();
        int nota5 = scan.nextInt();
        int nota6 = scan.nextInt();
        double media2 = (nota4+nota5+nota6)/3;
        
        double soma = media1 + media2;
        
        System.out.println("A soma das médias é: " + soma);
    }
    
}
