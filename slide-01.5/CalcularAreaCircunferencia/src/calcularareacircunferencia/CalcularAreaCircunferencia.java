/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularareacircunferencia;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class CalcularAreaCircunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o raio do circulo:");
        double raio = scan.nextDouble();
        
        double area = (3.14 * (raio * raio));
        
        System.out.println("A área da circunferência é: " + area);
        
    }
    
}
