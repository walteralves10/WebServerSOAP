package CONTROLER;

import MODEL.ProdutosBEAN;
import java.io.File;
import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface ProdutosServer {
    
    @WebMethod File ListarProdutosCat(int categoria,String APIKey);
    @WebMethod File ListarProdutos(String APIKey);
    @WebMethod File DadosProduto(String codigo,String APIKey);
    
}
