package respostaFacade;

public class PedidoFacade {
	
	public static void processarPedido(Produto produto) {
		
		if(ServicoEstoque.isAvailable(produto)) {
			System.out.println("Produto Disponível!");
			if(ServicoPagamento.makePayment(produto)) {
				System.out.println("Pagamento Realizado com Sucesso!");
				ServicoRemessa.shipProduct(produto);
				System.out.println("Pruduto Enviado com Sucesso!");
			}
		}	
	}
	
}
