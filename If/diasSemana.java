import java.util.Scanner;
public class diasSemana {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		String dia;
		 
		switch (x){
		case 1: dia = "Domingo"; 
		break;
		
		case 2: dia = "Segunda";
		break;
		
		case 3: dia = "Ter�a";
		break;
		
		case 4: dia = "Quarta";
		break;
		
		case 5: dia = "Quinta";
		break;
		
		case 6: dia = "Sexta";
		break;
		
		case 7: dia = "S�bado";
		break;
		
		default:
		dia = "Valor inv�lido!";
		break;
		}
		
		System.out.println("Dia da semana: "+dia);
	}
}
