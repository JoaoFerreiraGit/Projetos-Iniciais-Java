import java.util.Scanner;
public class App4{
    public static void main(String[] args) {
        System.out.println("Diga um número");
        int valor=0;
        Scanner pergunte=new Scanner (System.in);
        valor=pergunte.nextInt();
        int Divisão=valor/2;
        System.out.println(Divisão);
        }
}