
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
        // TODO code application logic here
        Eleitores eleit = new Eleitores();
        
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite\n1-Inserir quantidade de votos\n2-Calcular total de eleitores\n3-Calcular percentual de votos\n4-Mostrar percentual de votos\n0-sair"));
            
            switch(op){
                case 1:
                    eleit.inserirQtdVotos();
                    break;
                case 2:
                    eleit.calcularTotalEleitores();
                    break;
                case 3:
                    eleit.calcularPercentualVotos();
                    break;
                case 4:
                    eleit.mostrarPercentualVotos();
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Valor indisponível");
                    break;
            }
        }while(op != 0);
    }
    
}
