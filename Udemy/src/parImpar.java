import java.util.Scanner;
public class parImpar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numero;
		System.out.println("Digite um n�mero:");
		numero = in.nextInt();
		
		if(numero %2 == 0) {
			System.out.println("N�mero par!");
		}else {
			System.out.println("N�mero impar!");
		}
	}
}
