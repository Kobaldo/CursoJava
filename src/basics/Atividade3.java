package basics;

public class Atividade3 {

	public static void main(String[] args) {
	int num[] = {10, 18, 7, 6, 22, 8};
	Min(num);
	Max(num);
	Avg(num);
	System.out.println("The minimum value of the given array is " + Min(num));
	System.out.println("The maximum value of the given array is " + Max(num));
	System.out.println("The average value of the given array is " + Avg(num));
	}
	
	public static int Min(int[] A) {
		int n = A.length-1;
		int MinLocal =1000;
		while(n>0) {
			if(MinLocal>A[n-1]) {
				MinLocal= A[n-1];
			}
			n--;
			System.out.println(MinLocal);
		}
		return MinLocal;
	}
	
	public static int Max(int[] A) {
		int n = A.length-1;
		int MinLocal =0;
		while(n>0) {
			if(MinLocal<A[n-1]) {
				MinLocal= A[n-1];
			}
			n--;
		}
		return MinLocal;
	}
	
	public static int Avg(int[] A) {
		int n = A.length;
		int MinLocal =0;
		while(n>0) {
				MinLocal=MinLocal+ A[n-1];
			
			n--;
		}
		MinLocal= MinLocal/A.length;
		return MinLocal;
	}

}
