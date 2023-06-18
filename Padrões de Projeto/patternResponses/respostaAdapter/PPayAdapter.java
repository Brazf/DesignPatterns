package respostaAdapter;

public class PPayAdapter implements PPay {

	MPay mpay;
	
	public PPayAdapter (MPay mpay) {
		this.mpay = mpay;
	}

	@Override
	public String getCustCardNo() {
		// TODO Auto-generated method stub
		return mpay.getCreditCardNo();
	}

	@Override
	public String getCardOwnerName() {
		// TODO Auto-generated method stub
		return mpay.getCustomerName();
	}

	@Override
	public String getCardExpMonthDate() {
		// TODO Auto-generated method stub
		return mpay.getCardExpMonth();
	}

	@Override
	public Integer getCVVNo() {
		// TODO Auto-generated method stub
		return mpay.getCardCVVNo().intValue();
	}

	@Override
	public Double getTotalAmount() {
		// TODO Auto-generated method stub
		return mpay.getAmount();
	}

	@Override
	public void setCustCardNo(String custCardNo) {
		// TODO Auto-generated method stub
		mpay.setCreditCardNo(custCardNo);
	}

	@Override
	public void setCardOwnerName(String cardOwnerName) {
		// TODO Auto-generated method stub
		mpay.setCustomerName(cardOwnerName);
	}

	@Override
	public void setCardExpMonthDate(String cardExpMonthDate) {
		// TODO Auto-generated method stub
		mpay.setCardExpMonth(cardExpMonthDate);
	}

	@Override
	public void setCVVNo(Integer cVVNo) {
		// TODO Auto-generated method stub
		mpay.setCardCVVNo(cVVNo.shortValue());
	}

	@Override
	public void setTotalAmount(Double totalAmount) {
		// TODO Auto-generated method stub
		mpay.setAmount(totalAmount);
	}
	

}
