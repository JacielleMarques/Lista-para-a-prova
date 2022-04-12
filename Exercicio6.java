import java.util.Scanner;
public class Exercicio6 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

    
        System.out.print("Altura: ");
        double h = entrada.nextDouble();

        System.out.print("Sexo:");
        char sexo = entrada.next().charAt(0);

        if(sexo == 'F'){
            double pesoF = (62.1*h)-44.7;
            System.out.println("Peso ideal: " + pesoF);

        }else if (sexo == 'M'){
            double pesoM = (72.2*h)-58;
            System.out.println("Peso ideal: " + pesoM);

        }
        
    }
    
}
