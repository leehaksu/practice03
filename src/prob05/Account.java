package prob05;

public class Account {
	private String AccountNo;
	private int Balance;

	public Account(String str)
	{
		this.AccountNo=str;
		System.out.println(str+"계좌가 계설되었습니다.");
	}

	public void save(int i) {
		// TODO Auto-generated method stub
		this.Balance+=i;
		
	}

	public void deposit(int i) {
		// TODO Auto-generated method stub
		this.Balance-=i;
	}

	public int getBalance() {
		// TODO Auto-generated method stub
		return Balance;
	}

	public String getAccountNo() {
		// TODO Auto-generated method stub
		return AccountNo;
	}

	public void setAccountNo(String accountNo) {
		AccountNo = accountNo;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}
	
	
}
