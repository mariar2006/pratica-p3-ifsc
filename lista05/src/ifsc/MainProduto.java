package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
	ArrayList<Produto> produtos = new ArrayList<>();
	
		Produto celular = new Produto();
		celular.setNome("Iphone 15");
		celular.setCodBarra(5100001251l);
		celular.setPreco(12500.99);
		celular.setFornecedor("Apple");
		produtos.add(celular);
		
		Produto tablet = new Produto();
		tablet.setNome("Ipad");
		tablet.setCodBarra(8961901251l);
		tablet.setPreco(5456.89);
		tablet.setFornecedor("Apple");
		produtos.add(tablet);
		
		Produto notebook = new Produto();
		notebook.setNome("Macbook");
		notebook.setCodBarra(7885101251l);
		notebook.setPreco(6999.36);
		notebook.setFornecedor("Apple");
		produtos.add(notebook);
		
		for(Produto produto: produtos){
			System.out.println(produto.getNome());
			System.out.println(produto.getCodBarra());
			System.out.println(produto.getPreco());
			System.out.println(produto.getFornecedor());
			System.out.println("");
		}
		
		
		
	}
	
	
		

	}

