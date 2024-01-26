import java.util.Scanner;
public class Appmediade3 {
    public static void main(String[] args) {
        Scanner pergunte=new Scanner(System.in);
        int valor1=0;        
        System.out.println("digite o primeiro valor");
        valor1=pergunte.nextInt();  
        pergunte=new Scanner(System.in);
        int valor2=0;
        System.out.println("digite o segundo valor");
        valor2=pergunte.nextInt();
        pergunte=new Scanner(System.in);
        int valor3=0;
        System.out.println("digite o terceiro valor");
        valor3=pergunte.nextInt();
        int média=(valor1+valor2+valor3)/3 ;
        System.out.println("sua média é igual a "+ média); 
    }
    
}