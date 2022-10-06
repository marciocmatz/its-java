import java.util.Scanner;
import java.util.Locale;

public class RaizQuadrada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double numero, raiz;
		
		System.out.println("Digite um número: ");
		numero = sc.nextDouble();
		raiz = Math.sqrt(numero);
		
		Locale.setDefault(Locale.US);
		System.out.printf("A raiz do número %.2f é %.2f.", numero, raiz);
		
		
		sc.close();

	}

}
