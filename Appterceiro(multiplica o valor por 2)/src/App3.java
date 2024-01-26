import java.util.Scanner;
public class App3{
    public static void main(String[] args) {
        System.out.println("Diga um número");
        int idade=0;
        Scanner pergunte=new Scanner (System.in);
        idade=pergunte.nextInt();
        int soma=idade*2;
        System.out.println(soma);
        }
}