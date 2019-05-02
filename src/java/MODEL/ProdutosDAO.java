package MODEL;

import java.sql.ResultSet;
import java.util.ArrayList;

public class ProdutosDAO {

    public ArrayList<ProdutosBEAN> findAllProdutos() {
        return listaProdutos("SELECT * FROM produtos");
    }

    public ArrayList<ProdutosBEAN> findAllProdutosCategorias(String categoria) {
        return listaProdutos("SELECT * FROM produtos "
                + "INNER JOIN categorias ON (fk_id_categorias = id_categorias) "
                + "WHERE id_categorias = " + categoria);
    }

    public ProdutosBEAN findProdutosPorCodigo(String codigo) {
        return listaProdutosPorCodigo("SELECT  *"
                + "FROM produtos "
                + "INNER JOIN categorias on (id_categorias = fk_id_categorias)"
                + "INNER JOIN fornecedores on (id_fornecedores = fk_id_fornecedores)"
                + "INNER JOIN unidade_medida on (id_unidade_medida = fk_id_unidade_medida)"
                + "WHERE codigo_barras_produtos = " + codigo);
    }
    
    private ProdutosBEAN listaProdutosPorCodigo(String sql){
        
        ProdutosBEAN obj = null;
        
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(sql);
        try {
            while (rs.next()) {
                obj = (new ProdutosBEAN(
                        rs.getString("codigo_barras_produtos"), 
                        rs.getString("descricao_produtos"),
                        rs.getDouble("preco_venda_produtos"),
                        rs.getDouble("custo_produtos"),
                        rs.getInt("estoque_atual_produtos"),
                        rs.getInt("estoque_maximo_produtos"),
                        rs.getInt("estoque_minimo_produtos"),
                        rs.getInt("id_categorias"),
                        rs.getInt("id_unidade_medida"),
                        rs.getInt("id_fornecedores")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return obj;
    }

    private ArrayList<ProdutosBEAN> listaProdutos(String sql) {
        ArrayList<ProdutosBEAN> lista = new ArrayList<ProdutosBEAN>();

        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(sql);
        try {
            while (rs.next()) {
                lista.add(new ProdutosBEAN(rs.getString("codigo_barras_produtos"), rs.getString("descricao_produtos")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}
