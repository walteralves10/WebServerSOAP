package MODEL;

public class ProdutosBEAN {
    
    private String codigoBarrasProdutos;
    private String descricaoProdutos;
    private double precoVendaProdutos;
    private double custoProdutos;
    private int estoqueAtualProdutos;
    private int estoqueMaximoProdutos;
    private int estoqueMinimoProdutos;
//    private CategoriasBEAN categorias;
//    private UnidadeMedidaBEAN unidadeMedida;
//    private FornecedoresBEAN fornecedores;
    private int fkIdCategorias;
    private int fkIdUnidadeMedida;
    private int fkIdFornecedores;

    public ProdutosBEAN(String codigoBarrasProdutos, String descricaoProdutos){
        setCodigoBarrasProdutos(codigoBarrasProdutos);
        setDescricaoProdutos(descricaoProdutos);
    }

    public ProdutosBEAN(String codigoBarrasProdutos, String descricaoProdutos, double precoVendaProdutos, double custoProdutos, int estoqueAtualProdutos, int estoqueMaximoProdutos, int estoqueMinimoProdutos, int fkIdCategorias, int fkIdUnidadeMedida, int fkIdFornecedores) {
        this.codigoBarrasProdutos = codigoBarrasProdutos;
        this.descricaoProdutos = descricaoProdutos;
        this.precoVendaProdutos = precoVendaProdutos;
        this.custoProdutos = custoProdutos;
        this.estoqueAtualProdutos = estoqueAtualProdutos;
        this.estoqueMaximoProdutos = estoqueMaximoProdutos;
        this.estoqueMinimoProdutos = estoqueMinimoProdutos;
        this.fkIdCategorias = fkIdCategorias;
        this.fkIdUnidadeMedida = fkIdUnidadeMedida;
        this.fkIdFornecedores = fkIdFornecedores;
    }
    
    public String getCodigoBarrasProdutos() {
        return codigoBarrasProdutos;
    }

    public void setCodigoBarrasProdutos(String codigoBarrasProdutos) {
        this.codigoBarrasProdutos = codigoBarrasProdutos;
    }

    public String getDescricaoProdutos() {
        return descricaoProdutos;
    }

    public void setDescricaoProdutos(String descricaoProdutos) {
        this.descricaoProdutos = descricaoProdutos;
    }

    public double getPrecoVendaProdutos() {
        return precoVendaProdutos;
    }

    public void setPrecoVendaProdutos(double precoVendaProdutos) {
        this.precoVendaProdutos = precoVendaProdutos;
    }

    public double getCustoProdutos() {
        return custoProdutos;
    }

    public void setCustoProdutos(double custoProdutos) {
        this.custoProdutos = custoProdutos;
    }

    public int getEstoqueAtualProdutos() {
        return estoqueAtualProdutos;
    }

    public void setEstoqueAtualProdutos(int estoqueAtualProdutos) {
        this.estoqueAtualProdutos = estoqueAtualProdutos;
    }

    public int getEstoqueMaximoProdutos() {
        return estoqueMaximoProdutos;
    }

    public void setEstoqueMaximoProdutos(int estoqueMaximoProdutos) {
        this.estoqueMaximoProdutos = estoqueMaximoProdutos;
    }

    public int getEstoqueMinimoProdutos() {
        return estoqueMinimoProdutos;
    }

    public void setEstoqueMinimoProdutos(int estoqueMinimoProdutos) {
        this.estoqueMinimoProdutos = estoqueMinimoProdutos;
    }

    public int getFkIdCategorias() {
        return fkIdCategorias;
    }

    public void setFkIdCategorias(int fkIdCategorias) {
        this.fkIdCategorias = fkIdCategorias;
    }

    public int getFkIdUnidadeMedida() {
        return fkIdUnidadeMedida;
    }

    public void setFkIdUnidadeMedida(int fkIdUnidadeMedida) {
        this.fkIdUnidadeMedida = fkIdUnidadeMedida;
    }

    public int getFkIdFornecedores() {
        return fkIdFornecedores;
    }

    public void setFkIdFornecedores(int fkIdFornecedores) {
        this.fkIdFornecedores = fkIdFornecedores;
    }
    
    
    
}
