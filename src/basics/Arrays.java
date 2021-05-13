package basics;

public class Arrays {

	public static void main(String[] args) {
	Fibonnaci();	

	}
	
	public static void Fibonnaci() {
		int Fib[]= new int[100];
		Fib[0]= 0;
		Fib[1]=1;
		for (int x=2; x<101; x++) {
		Fib[x]=	Fib[x-1]+ Fib[x-2];
		System.out.print(Fib[x]+" " );
		}
		
	}

}
