import java.util.Scanner;
public class SegundoApp{
    public static void main(String[] args) {
        System.out.println("Diga um número de 0:999999999");
        int idade=0;
        Scanner pergunte=new Scanner (System.in);
        idade=pergunte.nextInt();
        System.out.println(idade);
        }
}