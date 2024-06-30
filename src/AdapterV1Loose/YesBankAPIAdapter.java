package AdapterV1Loose;

public class YesBankAPIAdapter implements BankAPI{
	
	YesBankAPI yesBankAPI=new YesBankAPI();
	@Override
	public int checkBalance() {
		// TODO Auto-generated method stub
		return yesBankAPI.getBalance();
	}

	@Override
	public void TransferMoney(int amount) {
		// TODO Auto-generated method stub
		yesBankAPI.setTransferAmount(amount);
		yesBankAPI.moneyTransfer();
		
	}
	
	void rtgsPayment() {
		throw new UnsupportedOperationException("Not Supported by this bank. Please change the bank to get this operation");
	}

}
