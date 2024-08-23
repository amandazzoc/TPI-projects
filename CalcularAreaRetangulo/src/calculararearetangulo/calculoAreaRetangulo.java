/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculararearetangulo;

import java.util.Scanner;
/**
 *
 * @author fatec-dsm2
 */
public class calculoAreaRetangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double ladoRetanguloA = scan.nextDouble();
        double ladoRetanguloB = scan.nextDouble(); 
        
        double area = ladoRetanguloA * ladoRetanguloB;
        double perimetro = 2*ladoRetanguloA + 2*ladoRetanguloB;
        
        System.out.println("A area do retângulo é: "+ area + " e o perimetro é: "+ perimetro);
    }
}
