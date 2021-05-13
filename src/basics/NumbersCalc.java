package basics;

public class NumbersCalc {
	public static void main(String[] args) {
		printName();
		int num1 = 5;
		int num2 = 10;
		SomaNumeros(num1, num2);
		Multiply(num1, num2);
		System.out.println(" O produto de " + num1+ " e "+num2+" é "+ Multiply(num1,num2));
		
		
	}

	static void printName() {
		System.out.println("MeU noME é TiM :P");
	}
	
	static void SomaNumeros (int A, int B) {
		int C = A + B;
		System.out.println(" A soma de " + A+ " e "+B+" é "+C);
	}
	
	static int Multiply (int X, int Z) {
		int Y = X*Z;
		return Y;
	}
}
