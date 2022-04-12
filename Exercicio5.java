import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um número: ");
        double numero = entrada.nextDouble();
    
        if(numero > 0){
            double 
            quadrado = (numero*numero);
            System.out.println("Este  número ao quadrado é: " + quadrado );
            double
            raiz = Math.sqrt(numero);
            System.out.println("A raiz quadrada deste número é: " + raiz );
        }else{
            System.out.println("Esse número não é positivo");
        }    

    
    }
}
