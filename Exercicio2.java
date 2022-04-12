import java.util.Scanner;
public class Exercicio2 {

        public static void main(String[] args) {
          
          Scanner entrada = new Scanner(System.in);
          float num1, num2, resultado; 
      
          
          System.out.println("Escolha a Operação desejada: " + "\n"  +"\n" + "|1| para Somar" + "\n" + "\n" + "|2| para subtrair"+ "\n" + "\n" +  "|3| para Multiplicação"+ "\n" + "\n" +  "|4| para Dividir");
          
          int opcao = entrada.nextInt();
          
          switch (opcao){
            case 1:
                      
             System.out.println("Informe o primeiro Número");
               //num1 = entrada.nextInt();
               num1 = entrada.nextFloat();
      
             System.out.println("Informe o Segundo Número");
               //num2 = entrada.nextInt();
               num2 = entrada.nextFloat();
      
             resultado = (num1 + num2);
      
             System.out.println("Resulado da soma: " + resultado);
          break;         
          }
          
        }
    }
