
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
public class OlimpiadaMatematica {
    private String nome;
    private String endereco;
    private double media;
    private double notamenor;
    private double notamaior;
    Scanner scan = new Scanner(System.in);

    public OlimpiadaMatematica() {
        this("", "", 0, 0, 0);
    }

    public OlimpiadaMatematica(String nome, String endereco, double media, double notamenor, double notamaior) {
        this.nome = nome;
        this.endereco = endereco;
        this.media = media;
        this.notamenor = notamenor;
        this.notamaior = notamaior;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getNotamenor() {
        return notamenor;
    }

    public void setNotamenor(double notamenor) {
        this.notamenor = notamenor;
    }

    public double getNotamaior() {
        return notamaior;
    }

    public void setNotamaior(double notamaior) {
        this.notamaior = notamaior;
    }
    
    public void calcularMedia(){
        System.out.println("Digite seu nome: ");
        setNome(scan.next());
        System.out.println("Digite seu endereço: ");
        setEndereco(scan.next());
        System.out.println("Digite sua maior nota:");
        setNotamaior(scan.nextDouble());
        System.out.println("Digite a sua menor nota:");
        setNotamenor(scan.nextDouble());
        
        setMedia((getNotamenor() + getNotamaior())/2);
        
    }
    
    public void verificarMedia(){
        
        System.out.println("----------------------------");
        System.out.println("Aluno(a): " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("----------------------------");
        
        if(getMedia() > 9){
            System.out.println("Aluno(a) inscrito\nMédia: " + getMedia());
        }else{
            System.out.println("Média insuficiente\nMédia: " + getMedia());
        }
    }
}
