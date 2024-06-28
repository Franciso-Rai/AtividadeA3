
package com.mycompany.atividadea3;

public class Cliente {
    private int id_cliente;
    private String nome;
    private String cpf;
    private String telefone;
    
    public Cliente(int id_cliente, String nome, String cpf, String telefone){
        this.id_cliente = id_cliente;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

   
    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getCpf() {
        return cpf;
    }

  
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

  
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
    
    
    
}
