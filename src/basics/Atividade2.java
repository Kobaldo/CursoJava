package basics;

public class Atividade2 {

	public static void main(String[] args) {
	int x;
	x= factorial(5);
	System.out.println(x);

	}
	
	public static int factorial(int n) {
		int result =n;
		if(n==0) {
			result=1;
		}
		else {
			while(n>1) {
				result=result*(n-1);
				n--;
			}
			
		}
		return result;
	}

}
