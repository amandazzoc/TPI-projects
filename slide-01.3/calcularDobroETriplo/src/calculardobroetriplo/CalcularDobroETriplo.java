/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculardobroetriplo;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class CalcularDobroETriplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numeroUm = scan.nextInt();
        int numeroDois = scan.nextInt();
        
        int calculoUm = numeroUm * 2;
        int calculoDois = numeroDois * 3;
        
        System.out.println(numeroUm + " * 2 = " + calculoUm);
        System.out.println(numeroDois + " * 3 = " + calculoDois);
    }
    
}
