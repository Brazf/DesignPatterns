package respostaFacade;

public class Main {

	public static void main(String[] args) {

		
		// CRIAÇÃO DO PRODUTO
		Produto product = new Produto(2109302, "TV");
		
		// PROCESSANDO O PRODUTO
		System.out.println("Processo de Pedido:\n");
		PedidoFacade.processarPedido(product);
		

	}
}
