import java.util.Scanner;

public class PersonagensFilmes {

	public static void main(String[] args) {
		/*Programar uma fun��o filme que recebe tr�s arrays com os nomes de personagens, filmes e ano de estr�ia no cinema. 
A fun��o deve receber tamb�m um valor de id escolhido pelo usu�rio com intervalo de 1 at� o tamanho de um dos arrays fornecidos e retornar uma frase com o seguinte modelo: 
"personagem � um personagem do filme filme que estreou no cinema em lan�amento." 
Se o valor de id for inv�lido, a fun��o deve retornar a frase "Essa n�o � uma op��o v�lida."*/

		String personagens[] = {"Hermione", "Trinity", "Leia"}, 
				filmes[]={"Harry Potter", "Matrix", "Star wars"};
		int lancamentos[] = {2001, 1999, 1977}, id, checagem=0;
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o  id: ");
		id = ler.nextInt();
		
		while (id<0 || id>2) {
			System.out.println("Essa n�o � uma op��o v�lida");
			System.out.print("Digite o  id: ");
			id = ler.nextInt();
		}
		
		boolean imprimiu=false;
		while(checagem<=personagens.length && !imprimiu) {
			if (checagem==id) {
				System.out.printf("%s � um personagem do filme %s que estreou no cinema em %d", personagens[id], filmes[id], lancamentos[id]);
				imprimiu=true;
			}
			checagem++;
		}
			
			
		
		
		/*while(checagem<=id) {
			if (checagem==id) {
				System.out.printf("%s � um personagem do filme %s que estreou no cinema em %d", personagens[id], filmes[id], lancamentos[id]);
			}
		checagem++;
		}
	if(id<0 || id>2) {
		System.out.println("Essa n�o � uma op��o v�lida");
		}*/
	}
}
