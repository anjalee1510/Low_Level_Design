package AdapterV0Tight;

public class FastTagRecharge {
	int recharge(YesBankAPI yb,int amount) {
		if(yb.getBalance()>=amount) {
			System.out.println("Recharge successful!");
			return 1;
		}
		System.out.println("Insufficient funds");
		return -1;
	}
}
