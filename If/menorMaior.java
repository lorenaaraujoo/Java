import java.util.Scanner;
public class menorMaior {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numero;
		System.out.println("Digite um n�mero:");
		numero = in.nextInt();
		
		if(numero < 1) {
			System.out.println("N�mero negativo");
		}else if (numero == 0){
			System.out.println("N�mero neutro!");
		}else {
			System.out.println("N�mero positivo!");
		}
	}
}
