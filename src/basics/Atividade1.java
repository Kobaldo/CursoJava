package basics;

public class Atividade1 {

	public static void main(String[] args) {
		int n =5;
		SomaAte(n);
	}
	
	public static void SomaAte(int A) {
		int sum =0;
		int x = A;
		while(A!=0) {
			sum= sum + A;
			A--;
		}
		System.out.println("The sum of number from 1 to " + x + " is " +sum);
	}

}
