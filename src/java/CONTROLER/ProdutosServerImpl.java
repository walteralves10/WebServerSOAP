package CONTROLER;

import MODEL.GerenciaXMLServer;
import MODEL.MySQLDAO;
import java.io.File;

import javax.jws.WebService;


@WebService(endpointInterface = "CONTROLER.ProdutosServer")
public class ProdutosServerImpl implements ProdutosServer {
    
    private String APIServer = "hdusdjdj475869dj";

    private boolean verificaAPIKey(String APIKey) {
        
        if (APIKey.equals(APIServer)) {
            return false;
        }
        return true;
    }

    @Override
    public File ListarProdutosCat(int categoria, String APIKey) {

        if (verificaAPIKey(APIKey)) {
            return null;
        }
        
        MySQLDAO.getConnection();
        return GerenciaXMLServer.gerarXMLLista(0, Integer.toString(categoria));
    }

    @Override
    public File ListarProdutos(String APIKey) {
        
        if (verificaAPIKey(APIKey)) {
            return null;
        }
        
        MySQLDAO.getConnection();
        return GerenciaXMLServer.gerarXMLLista(1, "");
    }

    @Override
    public File DadosProduto(String codigo, String APIKey) {
        
        if (verificaAPIKey(APIKey)) {
            return null;
        }
        
        MySQLDAO.getConnection();
        return GerenciaXMLServer.gerarXMLUnico(codigo);
    }
}
