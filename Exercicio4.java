import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        double salario = entrada.nextDouble();

        System.out.print("Digite o valor da prestação do empréstimo: ");
        double prestacao = entrada.nextDouble();

        if(prestacao > 0.2*salario){
            System.out.println("Empréstimo não consedido");
        }else{
            System.out.println("Empréstimo consedido");
        }    
    
}
}