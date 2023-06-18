package respostaAdapter;

public class testPPay {
	        
	public static void testPayPal (PPay pp){
		System.out.println(pp.getCardOwnerName());
		System.out.println(pp.getCustCardNo());
		System.out.println(pp.getCardExpMonthDate());
		System.out.println(pp.getCVVNo());
		System.out.println(pp.getTotalAmount());
		}
	
	public static void main(String[] args) {
		
		// Criando um objeto MPay para teste

		MPay mercadoPapo = new MpayImpl();
		mercadoPapo.setCustomerName("John Doe");
		mercadoPapo.setCreditCardNo("123456789");
		mercadoPapo.setCardExpMonth("0525");
		mercadoPapo.setCardCVVNo((short) 123);
		mercadoPapo.setAmount(100.0);

        // Criando o adaptador para usar o objeto MPay mercadoPapo
        PPay adapter = new PPayAdapter(mercadoPapo);

        // Testando o método com o objeto adaptado
        testPayPal(adapter);
			        
	}
	
}
