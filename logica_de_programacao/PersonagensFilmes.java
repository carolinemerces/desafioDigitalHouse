import java.util.Scanner;

public class PersonagensFilmes {

	public static void main(String[] args) {
		/*Programar uma função filme que recebe três arrays com os nomes de personagens, filmes e ano de estréia no cinema. 
A função deve receber também um valor de id escolhido pelo usuário com intervalo de 1 até o tamanho de um dos arrays fornecidos e retornar uma frase com o seguinte modelo: 
"personagem é um personagem do filme filme que estreou no cinema em lançamento." 
Se o valor de id for inválido, a função deve retornar a frase "Essa não é uma opção válida."*/

		String personagens[] = {"Hermione", "Trinity", "Leia"}, 
				filmes[]={"Harry Potter", "Matrix", "Star wars"};
		int lancamentos[] = {2001, 1999, 1977}, id, checagem=0;
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o  id: ");
		id = ler.nextInt();
		
		while (id<0 || id>2) {
			System.out.println("Essa não é uma opção válida");
			System.out.print("Digite o  id: ");
			id = ler.nextInt();
		}
		
		boolean imprimiu=false;
		while(checagem<=personagens.length && !imprimiu) {
			if (checagem==id) {
				System.out.printf("%s é um personagem do filme %s que estreou no cinema em %d", personagens[id], filmes[id], lancamentos[id]);
				imprimiu=true;
			}
			checagem++;
		}
			
			
		
		
		/*while(checagem<=id) {
			if (checagem==id) {
				System.out.printf("%s é um personagem do filme %s que estreou no cinema em %d", personagens[id], filmes[id], lancamentos[id]);
			}
		checagem++;
		}
	if(id<0 || id>2) {
		System.out.println("Essa não é uma opção válida");
		}*/
	}
}
