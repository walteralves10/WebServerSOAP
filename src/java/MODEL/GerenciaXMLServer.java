package MODEL;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

public class GerenciaXMLServer {
    
    private static final String MEUNOT = "/home/rezende/Documentos/faculdade/9 periodo/qualidade de software/arquivo.xml";
    private static final String TRABALHO = "E:\\0 - walter\\faculdade\\SISTEMA DISTRIBUIDO\\arquivo.xml";
    
    public static File gerarXMLUnico(String codigo){
        File arquivo = null;
        
        ProdutosBEAN produtos = null;
        ProdutosDAO produtosD = new ProdutosDAO();
        
        produtos = produtosD.findProdutosPorCodigo(codigo);
        
        Element supermercado = new Element("Supermercado") {};
        Document documento = new Document(supermercado);
            
            Element produto = new Element("Produtos");
            produto.setAttribute("id",produtos.getCodigoBarrasProdutos());
            
            Element nome = new Element("Nome");
            nome.setText(produtos.getDescricaoProdutos()); 
           
            Element preco = new Element("preco");
            preco.setText(String.valueOf(produtos.getPrecoVendaProdutos()));
            
            Element custo = new Element("custo");
            custo.setText(String.valueOf(produtos.getCustoProdutos()));
            
            Element estoqueAtual = new Element("estoqueAtual");
            estoqueAtual.setText(String.valueOf(produtos.getEstoqueAtualProdutos()));
            
            Element estoqueMax = new Element("estoqueMax");
            estoqueMax.setText(String.valueOf(produtos.getEstoqueMaximoProdutos()));
            
            Element estoqueMin = new Element("estoqueMin");
            estoqueMin.setText(String.valueOf(produtos.getEstoqueMinimoProdutos()));
            
            Element idCat = new Element("idCat");
            idCat.setText(String.valueOf(produtos.getFkIdCategorias()));
            
            Element idUnid = new Element("idUnid");
            idUnid.setText(String.valueOf(produtos.getFkIdUnidadeMedida()));
            
            Element idForn = new Element("idForn");
            idForn.setText(String.valueOf(produtos.getFkIdFornecedores()));
            
            produto.addContent(nome);
            produto.addContent(preco);
            produto.addContent(custo);
            produto.addContent(estoqueAtual);
            produto.addContent(estoqueMax);
            produto.addContent(estoqueMin);
            produto.addContent(idCat);
            produto.addContent(idUnid);
            produto.addContent(idForn);
            supermercado.addContent(produto);
        
        
        XMLOutputter xout = new XMLOutputter();
        
        try{
            arquivo = new File(TRABALHO);
            xout.output(documento, new FileWriter(arquivo));
            
        }catch(Exception e) {
            System.err.print("Erro: " + e);
        }
        
        return arquivo;
    }

    public static File gerarXMLLista(int opc,String snome) {
        
        File arquivo = null;
        
        ArrayList<ProdutosBEAN> produtos = null;
        //ProdutosBEAN produtosB = null;String
        ProdutosDAO produtosD = new ProdutosDAO();
        
        if (opc == 1) {
            produtos = produtosD.findAllProdutos();
        }else {
            produtos = produtosD.findAllProdutosCategorias(snome);
        }
        
        Element supermercado = new Element("Supermercado") {};
        Document documento = new Document(supermercado);

        for (ProdutosBEAN umProduto : produtos) {
            
            Element produto = new Element("Produtos");
            produto.setAttribute("id",umProduto.getCodigoBarrasProdutos());
            
            Element nome = new Element("Nome");
            nome.setText(umProduto.getDescricaoProdutos()); 
           
            
            
            produto.addContent(nome);
            supermercado.addContent(produto);
        }
        
        XMLOutputter xout = new XMLOutputter();
        
        try{
            arquivo = new File(TRABALHO);
            xout.output(documento, new FileWriter(arquivo));
            
        }catch(Exception e) {
            System.err.print("Erro: " + e);
        }
        
        return arquivo;
        //return xout.outputString(documento);
    }
    
}
