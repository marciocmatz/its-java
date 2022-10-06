import java.util.Scanner;

public class Funcoes {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 int x = sc.nextInt();
		 int y = sc.nextInt();
		 int z = sc.nextInt();
		
		 // Chamadas as funções.
		 int resultado = max(x, y, z);
		 showResult(resultado);
		 
		 sc.close();
	}
	
	// Função para identificar o maior número.
	public static int max(int num1, int num2, int num3) {
		int aux;
		
		if ( num1 > num2 && num1 > num3) {
			aux = num1;
		}
		else if ( num2 > num3 ) {
			aux = num2;
		}
		else {
			aux = num3;
		}
		return aux;
	}
	
	
	// Função para exibir o maior número.
	public static void showResult(int value) {
		System.out.println("O maior número é: " + value);
	}
	
}