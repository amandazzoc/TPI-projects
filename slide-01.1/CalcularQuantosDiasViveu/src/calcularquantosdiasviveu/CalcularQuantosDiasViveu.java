/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularquantosdiasviveu;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class CalcularQuantosDiasViveu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade = scan.nextInt();
    
        int dias = idade * 356;
    
        System.out.println("Você já viveu: " + dias + " dias");
    }
    
}
