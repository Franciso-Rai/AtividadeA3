
package com.mycompany.atividadea3;

public class Vendedor {
    private int id_vendedor;
    private String nome;
    private String unidade;
    
public Vendedor(int id_vendedor, String nome, String unidade){
    this.id_vendedor = id_vendedor;
    this.nome = nome;
    this.unidade = unidade;
}
public Vendedor(int id_vendedor) {
    this.id_vendedor = id_vendedor;
}

    
    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
  
}
