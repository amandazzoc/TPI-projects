/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Paciente {
    private int cod;
    private String nomePaciente;
    private String endereco;
    private String complemento;
    private String rg;
    private String cpf;
    private String dataNasc;
    Conexao con = new Conexao();

    public Paciente() {
        this(0, "", "", "", "", "", "");
    }

    public Paciente(int cod, String nomePaciente, String endereco, String complemento, String rg, String cpf, String dataNasc) {
        this.cod = cod;
        this.nomePaciente = nomePaciente;
        this.endereco = endereco;
        this.complemento = complemento;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    
    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    public void cadastrarPaciente() {
        String sql = "Insert into pacientes(nome, endereco, complemento, rg, cpf, dataNasc)values "
                + "('" + this.getNomePaciente()+ "', '" + this.getEndereco() + "','" + this.getComplemento() + "','" + this.getRg() + "','" + this.getCpf() + "','" + this.getDataNasc() + "')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");
    }
    
    public ResultSet consultar() {
        ResultSet tabela;
        tabela = null;

        String sql = "Select * from pacientes";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    
    public void excluir() {
        String sql;
        sql = "Delete from pacientes where id=" + getCod();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso...");
    }

    public void alterar() {
        String sql;
        sql = "Update pacientes set nome='" + getNomePaciente() + "',endereco='" + getEndereco() + "',complemento='" + getComplemento() + "',rg='" + getRg() + "',cpf='" + getCpf() + "',dataNasc='" + getDataNasc() + "' where id=" + getCod();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso...");
    }
    
    public ResultSet consultarCampoEspecifico(){
        ResultSet tabela;
        tabela = null;

        try{
          String sql="Select * from pacientes where nome like '"+ getNomePaciente()+"%'";
          tabela= con.RetornarResultset(sql);                  

           }
           catch(Exception sqle){
                JOptionPane.showMessageDialog(null,"Atenção..."+sqle.getMessage());
           }
        return tabela;    
    }
}
