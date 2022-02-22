package week3_day2_assignment;

public class Bank extends SBI implements CIBIL,PNB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank ban = new Bank();
		ban.bankBalance();
		ban.cibilScore();
		ban.creditScore();
		ban.maximumLoanAmount();
		ban.minimumBalance();
		ban.ITLoan();
		

	}

	public void creditScore() {
		// TODO Auto-generated method stub
		System.out.println("92%");
		
		
	}

	public void minimumBalance() {
		// TODO Auto-generated method stub
		System.out.println("Rs:1000");
		
	}

	public void cibilScore() {
		// TODO Auto-generated method stub
		System.out.println("92.3%");
		
	}

	@Override
	public void bankBalance() {
		// TODO Auto-generated method stub
		System.out.println("Rs:85223.36");
		
	}

	@Override
	public void maximumLoanAmount() {
		// TODO Auto-generated method stub
		System.out.println("Rs:1000000");
		
	}

}
