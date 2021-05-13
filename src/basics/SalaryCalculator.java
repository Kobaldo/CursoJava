package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		String carrer;
		System.out.println("O sistema está ligando");
		carrer = "Software Developer";
		System.out.println("Minha carreira é: " + carrer);
		
		int horas =40;
		int semanas = 50;
		double taxa = 42.5;
		double salary = horas * semanas * taxa;
		System.out.println("Meu salário anual como "+ carrer + " a um valor de "+ taxa + " por hora é de "+ salary);
	}

}
