
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
public class Usuario {
    
    private String nome;
    private String email;
    private int idade;
    private String endereco;

    public Usuario() {
        this("", "", 0, ""); //Inicializando o construtor
        
    }

    public Usuario(String nome, String email, int idade, String endereco) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void guardarDados(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o nome do usuário: ");
        setNome(scan.nextLine()); 
        
        System.out.println("Digite o e-mail do usuário: ");
        setEmail(scan.next());
        
        System.out.println("Digite a idade do usuário: ");
        setIdade(scan.nextInt());
        
        scan.nextLine();
        
        System.out.println("Digite o endereço do usuario: ");
        setEndereco(scan.nextLine()); // O nextLine serve para caso escrever algo com mais de uma palavra, apareça todas as palavras e não apenas a primeira
        
        
    }
    
    public void mostrarDados(){
        System.out.println("\n Dados do usuário \n Nome: " + getNome() + "\n E-mail: " + getEmail() + "\n Idade: " + getIdade() + "\n Endereço: " + getEndereco());
        
    }
    
    
    
}

