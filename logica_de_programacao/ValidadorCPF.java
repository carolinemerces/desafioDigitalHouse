import java.util.Scanner;

public class ValidadorCPF {

	public static void main(String[] args) {
		
		long cpf, aux=0;
		int i=0;
		Scanner ler = new Scanner(System.in);
		System.out.print("Insira seu CPF: ");
		cpf = ler.nextLong();

		while (i <= aux && cpf > 0 ) {
			aux = aux + (cpf % 10);
			cpf = (cpf/10);
			i++;
		}
			
		if (aux/10 == aux%10) {
			System.out.print("CPF válido = " + aux);
		}
		else {
			System.out.print("CPF inválido = " + aux);
		}
		
		ler.close();
	}
		

}
