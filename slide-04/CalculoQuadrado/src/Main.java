
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quadrado quad = new Quadrado();
        int op;
        double ladoA;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Escolha:\n1-Calcular area do quadrado"
                    + "\n2-Calcular perimetro quadrado"
                    + "\n3-Mostrar valores"
                    + "\n0-Sair"));
            
            switch(op){
                case 1:
                    ladoA = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado A do quadrado: "));
                    quad.calcularArea(ladoA);
                    break;
                case 2:
                    ladoA = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado A do quadrado: "));
                    quad.calcularPerimetro(ladoA);
                    break;
                case 3:
                    quad.mostrarValores();
                    break;
                case 0: 
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Número Incorreto!");
                    break;
            }
            
        }while(op != 0);
    }
    
}
