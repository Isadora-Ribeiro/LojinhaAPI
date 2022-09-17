package dataFactory;

import pojo.ComponentePojo;
import pojo.ProdutoPojo;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDataFactory {
    public static ProdutoPojo criarUmProdutoComumComOValorIgualA(double valor){
        ProdutoPojo produto = new ProdutoPojo();
        produto.setProdutoNome("Play Station 5");
        produto.setValor(valor);

        List<String> cores = new ArrayList<>();
        cores.add("Preto");
        cores.add("Branco");

        produto.setProdutoCores(cores);
        produto.setProdutoUrlMock("");

        List<ComponentePojo> componentes = new ArrayList<>();

        ComponentePojo componente =  new ComponentePojo();
        componente.setNome("Controle");
        componente.setQuantidade(1);

        componentes.add(componente);

        produto.setComponente(componentes);

        return produto;
    }
}
