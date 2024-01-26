import java.util.Scanner;
public class App7{
    public static void main(String[] args) {
        Scanner pergunte=new Scanner (System.in);
        int valor1=0;
        System.out.println("Digite um Valor");
        valor1=pergunte.nextInt();
        int valor2=0;
        System.out.println("Digite outro Valor");
        valor2=pergunte.nextInt();
        int soma=valor1+valor2;
        System.out.println("a soma é igual a...");
        System.out.println(soma);
        int subtração=valor1-valor2;
        System.out.println("a subtração é igual a...");
        System.out.println(subtração);
        int divisão=valor1/valor2;
        System.out.println("a divisão é igual a...");
        System.out.println(divisão);
        int multiplicação=valor1*valor2;
        System.out.println("a multiplicação é igual a...");
        System.out.println(multiplicação);
    }
    
}
