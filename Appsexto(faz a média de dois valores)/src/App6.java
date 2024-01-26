import java.util.Scanner;
public class App6{
    public static void main(String[] args) {
        Scanner pergunte=new Scanner (System.in);
        int valor1=0;
        System.out.println("Digite um Valor");
        valor1=pergunte.nextInt();
        int valor2=0;
        System.out.println("Digite outro Valor");
        valor2=pergunte.nextInt();
        int Média=(valor2+valor1)/2;
        System.out.println("valor igual a...");
        System.out.println(Média);
        
    }
    
}
