import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double total;

        System.out.print("Digite um número inteiro e positivo: ");
        int x = entrada.nextInt();

        System.out.print("Digite o segundo número inteiro e positivo: ");
        int y = entrada.nextInt();

        System.out.print("Digite o terceiro número inteiro e positivo: ");
        int z = entrada.nextInt();

        System.out.print("Digite um número para calcular um tipo de média.\n  Digite o número 1, irei calcular a Média Geométrica.\n  Digite o número 2, irei calcular a Média Ponderada.\n  Digite o número 3, irei calcular a Média Aritmética.\n  Digite o número aqui:  ");
        int média = entrada.nextInt();



        if(média == 1 ){
            
            total = (x*y*z);
            System.out.println("O resultado da Média Geométrica é igual a: " + total );

        }else if (média == 2 ){
            
            total = ((x+2*y+3*z)/6);
            System.out.println("O resultado da Média Ponderada é igual a: " + total );

        }else if(média == 3){
            
            total = ((x+y+z)/3);
            System.out.println("O resultado da Média Aritmética é igual a: " + total );

        }
    }
}