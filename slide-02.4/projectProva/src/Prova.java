
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class Prova {
    private String nome;
    private double pontos;
    private String nivel;
    Scanner scan = new Scanner(System.in);

    public Prova() {
        this("", 0, "");
    }

    public Prova(String nome, double pontos, String nivel) {
        this.nome = nome;
        this.pontos = pontos;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPontos() {
        return pontos;
    }

    public void setPontos(double pontos) {
        this.pontos = pontos;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    public void nivelProva(){
        System.out.println("Digite seu nome:");
        setNome(scan.next());
        
        System.out.println("Digite seus pontos: ");
        setPontos(scan.nextDouble());
        
        if(getPontos() <= 100){
            setNivel("nível 1");
        }else if(getPontos() > 100 && getPontos() < 200){
            setNivel("nível 2");
        }else{
            setNivel("nível 3");
        }
    }
    
    public void listarResultado(){
        System.out.println("------------------");
        System.out.println("Nome: " + getNome());
        System.out.println("Pontos: " + getPontos());
        System.out.println("------------------");
        System.out.println("Nível: " + getNivel());
    }
}
