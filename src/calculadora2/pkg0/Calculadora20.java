package calculadora2.pkg0;

import java.util.Scanner;

public class Calculadora20 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double n1 = ler.nextDouble();
        System.out.println("Digite o segundo número: ");
        double n2 = ler.nextDouble();
        System.out.println("Digite: \n"
                + "+ para somar \n"
                + "- para subtrair \n"
                + "* para multiplicar \n"
                + "/ para dividir \n");
        
        char caracter = ler.next().charAt(0);
        switch(caracter){
            case '+':
                Operacoes.somar(n1, n2);
                break;
            
            case '-':
                Operacoes.subtrair(n1, n2);
                break;
                
            case '*':
                Operacoes.multiplicar(n1, n2);
                break;
               
            case '/':
                Operacoes.dividir(n1, n2);
                break;
                
            default:
                System.out.println("\nDigite um caracter válido!\n");
                break;
        }
    }
    
}
