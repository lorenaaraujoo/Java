import java.util.Scanner;
public class multiplos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a, b;
		System.out.println("Digite um n�mero");
		a = in.nextInt();
		
		System.out.println("Digite um n�mero");
		b = in.nextInt();
		
		if(a % b == 0 || b % a == 0) {
			System.out.println("S�o multiplos!");
		}else {
			System.out.println("N�o s�o multiplos!");
		}
	}
}
