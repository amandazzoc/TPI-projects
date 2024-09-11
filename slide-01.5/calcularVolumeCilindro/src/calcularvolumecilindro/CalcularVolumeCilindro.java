/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularvolumecilindro;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class CalcularVolumeCilindro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o raio do cilindro");
        double raio = scan.nextDouble();
        System.out.println("Digite a altura do cilindro");
        double altura = scan.nextDouble();
        
        double volume = 3.14159 * raio * raio * altura;
        
        System.out.println("O volume do cilindro é :" + volume );
    }
    
}
