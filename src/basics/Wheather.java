package basics;

public class Wheather {
	public static void main(String[] args) {
		
		int temperatura =19;
		String sol = "Nublado";
		
		if((temperatura >= 30) && (sol== "Ensolarado") ) {
			System.out.println("T� quente pacas!!");
		}
		else if((temperatura >= 20) || (sol=="Ensolarado")) {
			System.out.println("T� calorzin!");
		}
		else {
			System.out.println("O tempo t� frio!");
		}
	}
}
