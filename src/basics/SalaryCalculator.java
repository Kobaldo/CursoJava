package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		String carrer;
		System.out.println("O sistema est� ligando");
		carrer = "Software Developer";
		System.out.println("Minha carreira �: " + carrer);
		
		int horas =40;
		int semanas = 50;
		double taxa = 42.5;
		double salary = horas * semanas * taxa;
		System.out.println("Meu sal�rio anual como "+ carrer + " a um valor de "+ taxa + " por hora � de "+ salary);
	}

}
