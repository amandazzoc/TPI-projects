
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
        Triangulo triang = new Triangulo();
        
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite:\n1- Inserir dados triangulo\n2- Calcular área do triangulo\n3- Mostrar área triangulo\n0- Sair"));
            switch(op){
                case 1:
                    triang.inserirDadosTriangulo();
                    break;
                case 2:
                    triang.calcularArea();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "A area do triangulo é de: " + triang.mostrarAreaTriangulo());
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida!");
                    break;
            }
        }while(op != 0);
    }
    
}
