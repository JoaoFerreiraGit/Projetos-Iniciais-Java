import java.util.Scanner;
public class App5{
    public static void main(String[] args) {
        Scanner pergunte=new Scanner (System.in);
        int valor1=0;
        System.out.println("Digite um Valor");
        valor1=pergunte.nextInt();
        int valor2=0;
        System.out.println("Digite outro Valor");
        valor2=pergunte.nextInt();
        int soma=valor2+valor1;
        System.out.println("valor igual a...");
        System.out.println(soma);
        
    }
    
}
