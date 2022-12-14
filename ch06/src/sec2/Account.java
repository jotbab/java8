package sec2;

public class Account {
	//모든 멤버가 getter setter를 가지기 위해 private으로 선언
	
	
	
	public String anum;	//계좌번호
	public String aname;	//계좌주
	public int balance;	//잔액
	public int im;	//입금액
	public int om;	//출금액      ->> money 증감자로 한번에
	final int MIN_BALANCE = 0;	//if문으로 대체
	
	
	public Account() {
		
	}
	
	
	
	
	
	public Account(String anum, String aname, int balance, int im, int om) {
		this.anum = anum;
		this.aname = aname;
		this.balance = balance;
		this.im = im;
		this.om = om;
	}
	
	public Account(String anum, String aname, int im, int om) {
		this.anum = anum;
		this.aname = aname;
		this.im = im;
		this.om = om;
	}
	
	
	public int runDeposit() {
		return(this.balance + this.im);		
	}
	
	public int runWithdraw() {
		if(this.balance - this.om>=this.MIN_BALANCE) {
			
		}this.balance = this.balance+this.im-this.om;
		return this.balance;
	}	//
	
	public int runBalance() {	//
		return(this.balance+this.im-this.om);
	}
	
	

	public String getAnum() {
		return anum;
	}

	public void setAnum(String anum) {
		this.anum = anum;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getIm() {
		return im;
	}

	public void setIm(int im) {
		this.im = im;
	}

	public int getOm() {
		return om;
	}

	public void setOm(int om) {
		this.om = om;
	}
	

}