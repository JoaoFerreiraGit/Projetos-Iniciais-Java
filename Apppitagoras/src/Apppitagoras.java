import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import java.util.Scanner;
public class Apppitagoras {
    private static int Soma;
    public static void main(String[] args) {
        Scanner pergunte=new Scanner(System.in);
        int cateto1=0;
        System.out.println("digite o valor do cateto 1");
        cateto1=pergunte.nextInt();
        pergunte=new Scanner(System.in);
        int cateto2=0;
        System.out.println("digite o valor do cateto 2");
        cateto2=pergunte.nextInt();
        double quadrado1=pow(cateto1,2);
        double quadrado2=pow(cateto2,2);
        System.out.println(quadrado1);
        System.out.println(quadrado2);
        System.out.println(Soma=(int) (quadrado1+quadrado2));
        double raiz=sqrt(Soma);
        System.out.println(raiz);
        System.out.println("A hipotenusa é igual a 10");
    }
    
}