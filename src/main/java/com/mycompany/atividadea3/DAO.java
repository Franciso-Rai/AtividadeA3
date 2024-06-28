
package com.mycompany.atividadea3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
    public boolean existe(Usuario usuario) throws Exception {
        String sql = "SELECT * FROM tb_usuario WHERE login = ? AND senha = ?";

        try (Connection conn = ConexaoBDD.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getSenha());

            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Erro ao verificar usuário", e);
        }
    }
    public void inserirCliente(Cliente cliente)throws Exception{
        String sql = "INSERT INTO tb_clientes (nome,cpf,telefone) VALUES (?,?,?)";
        try (Connection conn = ConexaoBDD.obtemConexao();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpf());
            ps.setString(3, cliente.getTelefone());
            ps.execute();
        }
    }
    public void atualizarCliente(Cliente cliente)throws Exception{
        String sql = "UPDATE tb_clientes SET nome = ?, cpf = ?, telefone = ? WHERE id_cliente = ?";
        try (Connection conn = ConexaoBDD.obtemConexao();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpf());
            ps.setString(3, cliente.getTelefone());
            ps.setInt(4, cliente.getId_cliente());
            ps.execute();
}
    }
    public void excluirCliente(Cliente cliente)throws Exception{
        String sql = "DELETE FROM tb_clientes WHERE id_cliente = ?";
        try (Connection conn = ConexaoBDD.obtemConexao();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, cliente.getId_cliente());
            ps.execute();
}
    }
    public void inserirVendas(Vendas vendas)throws Exception{
        String sql = "INSERT INTO tb_venda (data_venda, modelo_carro, id_vendedor, id_cliente) VALUES (?,?,?,?)";
        try (Connection conn = ConexaoBDD.obtemConexao();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, vendas.getData_venda());
            ps.setString(2, vendas.getModelo_carro());
            ps.setInt(3, vendas.getId_vendedor());
            ps.setInt(4, vendas.getId_cliente());
            ps.execute();
    
}
    }
    public void atualizarVendas(Vendas vendas)throws Exception{
        String sql = "UPDATE tb_venda SET data_venda = ?, modelo_carro = ?, id_vendedor = ?, id_cliente = ? WHERE id_venda = ?";
        try (Connection conn = ConexaoBDD.obtemConexao();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, vendas.getData_venda());
            ps.setString(2, vendas.getModelo_carro());
            ps.setInt(3, vendas.getId_vendedor());
            ps.setInt(4, vendas.getId_cliente());
            ps.setInt(5, vendas.getId_venda());
            ps.execute();
}
    }
    public void excluirVendas(Vendas vendas)throws Exception{
        String sql = "DELETE FROM tb_venda WHERE id_venda = ?";
        try (Connection conn = ConexaoBDD.obtemConexao();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, vendas.getId_venda());
            ps.execute();
}
    }
    public void inserirVendedor(Vendedor vendedor)throws Exception{
        String sql = "INSERT INTO tb_vendedores (nome,unidade) VALUES (?,?)";
        try (Connection conn = ConexaoBDD.obtemConexao();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, vendedor.getNome());
            ps.setString(2, vendedor.getUnidade());          
            ps.execute();
}
    }
    public void atualizarVendedor(Vendedor vendedor)throws Exception{
        String sql = "UPDATE tb_vendedores SET nome = ?, unidade = ? WHERE id_vendedor = ?";
        try (Connection conn = ConexaoBDD.obtemConexao();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, vendedor.getNome());
            ps.setString(2, vendedor.getUnidade()); 
            ps.setInt(3, vendedor.getId_vendedor());
            ps.execute();
}
    }
    public void excluirVendedor(Vendedor vendedor)throws Exception{
        String sql = "DELETE FROM tb_vendedores WHERE id_vendedor = ?";
        try (Connection conn = ConexaoBDD.obtemConexao();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, vendedor.getId_vendedor());
            ps.execute();
}
    }
}
    

