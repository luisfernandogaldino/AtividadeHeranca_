package Heranca;

public class Execucao3 {

	public static void main(String[] args) {
		Produto produto = new Produto(78,"Bombom Nestlé",11.0);
		System.out.println("\n Produto");
		System.out.println("id:"+ produto.getId());
		System.out.println("Nome:" + produto.getNome());
		System.out.println("Preco:" + produto.getPreco());

		Sorvete sorvete = new Sorvete(89,"Sorvete de Chocolate",10.0,15.0);
		System.out.println("\n Sorvete");
		System.out.println("id:"+ sorvete.getId());
		System.out.println("Nome:"+sorvete.getNome());
		System.out.println("Preco:"+ sorvete.getPreco());
		System.out.println("TempAdequada:"+ sorvete.getTempAdequada());

		Camisa camisa = new Camisa(45,"Camiseta Polo",78.0,"Vermelho","Poliéster","M");
		System.out.println("\n Camisa");
		System.out.println("id:"+ camisa.getId());
		System.out.println("Nome:"+ camisa.getNome());
		System.out.println("Preco:"+ camisa.getPreco());
		System.out.println("Cor:"+ camisa.getCor());
		System.out.println("Tecido:"+ camisa.getTecido());
		System.out.println("Tamanho:"+ camisa.getTamanho());

	}

}
