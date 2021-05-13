package lab;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		NewStudent Aluno1= new NewStudent("Rodrigo", "110055", 1000);
		NewStudent Aluno2= new NewStudent("Ana Beatriz", "221166", 2000);
		NewStudent Aluno3= new NewStudent("Leonardo", "332277", 3000);
		Aluno1.enroll("Math, Physics and Geometry.");
		Aluno1.pay(500);
		Aluno3.pay(1000);
		Aluno1.checkBalance();
		System.out.println(Aluno2.toString());
		Aluno2.pay(500);
		System.out.println(Aluno2.toString());
		Aluno1.ShowCourses();
		Aluno2.setPhone("99663154");
		Aluno2.setCity("Juiz de Fora");
		Aluno2.setState("Minas Gerais");
	}

}

class NewStudent{
	private static int ID =100;
	private String SSN;
	private String email;
	private String userID;
	private String phone;
	private String city;
	private String state;
	private String name;
	private double balance;
	private String courses;
	
	public NewStudent(String name,String SSN, double balance){
		this.name=name;
		this.email= name.substring(0,3)+ "@UFJF.com";
		this.SSN = SSN;
		this.balance=balance;
		setID();
		System.out.println("New Student included. Your email is: "+ email + "\nYour user ID is " + userID+ "\nYour innitial balance is: $"+ balance);
		
		
	}
	
	public void setID() {
		ID = ID +5; 
		int rand =(int)(Math.random()*10000);
		userID= ID+""+rand+ SSN.substring(2,6);
	}
	public void enroll(String courses) {
		this.courses= courses;
		System.out.println( name +" has been enrolled in " + courses);
	}
	public void pay (double ammount) {
		this.balance= balance-ammount;
		System.out.println( name +", your new balance is: $"+ balance);
	}
	public void checkBalance() {
		System.out.println(name +", your balance is: $"+balance);
	}
	@Override
	public String toString() {
		return "Name: " + name + " User ID: " + userID+ " Balance: " + balance;
	}
	public void ShowCourses() {
		System.out.println(name + " is enrolled in the following courses: " + courses);
	}
	public void setPhone(String phone) {
		this.phone=phone;
		System.out.println(name+"'s phone has been defined as "+ phone);
	}
	public void setCity(String city) {
		this.city=city;
		System.out.println(name+"'s city has been defined as "+ city);
	}
	public void setState(String state) {
		this.state=state;
		System.out.println(name+"'s state has been defined as "+ state);
	}
}