package pojo;

import java.util.List;

public class ProdutoPojo {
    private String produtoNome;
    private double valor;
    private List<String> produtoCores;
    private String produtoUrlMock;
    private List<ComponentePojo> componentes;

    public String getProdutoNome() {
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<String> getProdutoCores() {
        return produtoCores;
    }

    public void setProdutoCores(List<String> produtoCores) {
        this.produtoCores = produtoCores;
    }

    public String getProdutoUrlMock() {
        return produtoUrlMock;
    }

    public void setProdutoUrlMock(String produtoUrlMock) {
        this.produtoUrlMock = produtoUrlMock;
    }

    public List<ComponentePojo> getComponentes() {
        return componentes;
    }

    public void setComponente(List<ComponentePojo> componentes) {
        this.componentes = componentes;
    }
}
