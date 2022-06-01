package repositorio;

import java.util.ArrayList;
import java.util.List;

public  class Carrinho{

	public List<ProdutoCarrinho> produtos = new ArrayList<ProdutoCarrinho>();
	
	
	
	public void addProduto(int codigo, String descricao, int qtd, double preco) {		
		ProdutoCarrinho teste = new ProdutoCarrinho();
		teste.setCodigo(1);
		teste.setDescricao("Couro");
		teste.setQtd(3);
		teste.setPreco(20.50);		
		
		produtos.add(teste);
	}
	
	public void listaTelevisor() {
		for (ProdutoCarrinho produto : produtos) {
			System.out.println("Cod:" + produto.getCodigo());
			System.out.println("Descricao:" + produto.getDescricao());
			System.out.println("Qtd:" + produto.getQtd());
			System.out.println("Preo:" + produto.getPreco());	
		}
	}
	
}
