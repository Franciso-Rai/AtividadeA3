
package com.mycompany.atividadea3;

public class Vendas {
    private int id_venda;
    private String data_venda;
    private String modelo_carro;
    private int id_vendedor;
    private int id_cliente;

public Vendas(int id_venda, String data_venda, String modelo_carro, int id_vendedor, int id_cliente){
        this.id_venda = id_venda;
        this.data_venda = data_venda;
        this.modelo_carro = modelo_carro;
        this.id_vendedor = id_vendedor;
        this.id_cliente = id_cliente;
}
        
public Vendas(int id_venda) {
    this.id_venda = id_venda;
}


        /**
     * @return the id_venda
     */
    public int getId_venda() {
        return id_venda;
    }

    /**
     * @param id_venda the id_venda to set
     */
    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    /**
     * @return the data_venda
     */
    public String getData_venda() {
        return data_venda;
    }

    /**
     * @param data_venda the data_venda to set
     */
    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }

    /**
     * @return the modelo_carro
     */
    public String getModelo_carro() {
        return modelo_carro;
    }

    /**
     * @param modelo_carro the modelo_carro to set
     */
    public void setModelo_carro(String modelo_carro) {
        this.modelo_carro = modelo_carro;
    }

    /**
     * @return the id_vendedor
     */
    public int getId_vendedor() {
        return id_vendedor;
    }

    /**
     * @param id_vendedor the id_vendedor to set
     */
    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    /**
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
}


   
    
    
    

