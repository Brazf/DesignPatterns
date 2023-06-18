package respostaFacade;

public class Main {

	public static void main(String[] args) {

		
		// CRIAÇÃO DO PRODUTO
		Produto product = new Produto(2109302, "TV");
		System.out.println(product);
		
		// PROCESSANDO O PRODUTO
		System.out.println("\nProcesso de Pedido:\n");
		PedidoFacade.processarPedido(product);
		

	}
}
