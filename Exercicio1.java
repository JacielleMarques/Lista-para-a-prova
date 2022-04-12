
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args){

		String nome;
		String modelo;
        float tamanho;
        double preco;
		int quantidade;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o nome do produto: ");
		nome= ler.next();

		System.out.println("Digite o modelo de seu produto: "); 
		modelo = ler.next();

        System.out.println("Digite o tamanho do seu produto: "); 
	    tamanho = ler.nextFloat();

        System.out.println("Digite o preço de seu produto: "); 
		preco = ler.nextDouble();

        System.out.println("Digite a quantidade de seu produto: "); 
		quantidade= ler.nextInt();
		
		System.out.println("Os dados dos produtos. " + 
		" Nome do produto: " + nome + ";" + 
		" Modelo do produto: " + modelo + ";" + 
		" Tamanho do produto: " + tamanho + " cm;" + 
		" Preço do produto: " + preco + ";" + 
		" Quantidade do produto: " + quantidade + "." );

		



	}
}


