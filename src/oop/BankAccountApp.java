package oop;

public class BankAccountApp {

	String AccountName;
	String AccountNumber;
	String AccountType;
	


BankAccountApp(){
	System.out.println("Tipo 1 criado");
}

BankAccountApp(String name){
	System.out.println("Tipo 2 criado");
	System.out.print("  Nome da conta: "+ name);
}

BankAccountApp(String name, int number){
	System.out.println("Tipo 3 criado");
	System.out.print("  Nome da conta: "+ name);
	System.out.print("  Numero da conta: "+ number);
	AccountName= name;
}
}

