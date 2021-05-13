package Practical;

public class BankAccountAplication {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("10145420655");
		
		acc1.setName("Rod");
		System.out.println(acc1.getName());

	}

}


class BankAccount {
	private static String accountNumber;
	private static final String routingNumber = "36883218";
	private String name;
	private String CPF;
	private double balance;
	private int ID = 1000;
	
	
	public BankAccount (String CPF) {
		System.out.println("New account created.");
		this.CPF = CPF;
		ID++;
		System.out.println(ID);
		setAccountNumber();
	}
	
	public void setAccountNumber() {
		int ran =(int) (Math.random()*100);
		accountNumber = ID +""+  ran + CPF.substring(0, 2);
		System.out.println("Account Number: "+ accountNumber);
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}