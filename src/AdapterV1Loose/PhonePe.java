package AdapterV1Loose;

public class PhonePe {
	//YesBankAPI yb=new YesBankAPI();
	BankAPI yb;
	PhonePeLoan loan=new PhonePeLoan();
	FastTagRecharge ft=new FastTagRecharge();
	
	void setBankAPI(BankAPI bankAPI) {
		yb=bankAPI;
	}
	boolean checkLoanEligibility() {
		return loan.LoanCheck(yb);
		
	}
	boolean rechargeFastTag(){
		if(ft.recharge(yb, 1000)>0)
			return true;
		else {
			throw new RuntimeException("Add more funds!");
		}
	}
}
/* Suppose if YesBankAPI has to be removed 
 * We have to go with ICICI Bank API- Analyse in how many classes the code needs to be changed
 * the classes are PhonePe.java, PhonePeLoan.java, FastTagRecharge.java
 * 
 * 
 */ 
