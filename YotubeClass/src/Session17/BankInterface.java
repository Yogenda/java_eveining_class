package Session17;

interface PersonalBanking {
	void createNewAccount();
	void checkBalance();
}
interface Loan {
	float rateOfInterest();
}

class SBIBank implements PersonalBanking,Loan{

	@Override
	public float rateOfInterest() {
		return 5.6f;
	}

	@Override
	public void createNewAccount() {
		System.out.println("Your SBI Account has been created");
	}

	@Override
	public void checkBalance() {
		System.out.println("SBI Check Bal");
	}
}

public class BankInterface {
	public static void main(String[] args) {
		SBIBank sbi = new SBIBank();
		sbi.createNewAccount();
		sbi.checkBalance();
		System.out.println("Rate of Intrest is: "+sbi.rateOfInterest());
		
	}
}



