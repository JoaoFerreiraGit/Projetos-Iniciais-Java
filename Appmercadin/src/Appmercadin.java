import java.util.Scanner;
public class Appmercadin {
    private static int Multiplicação;
    public static void main(String[] args) {
        Scanner pergunte=new Scanner(System.in);
        System.out.println("digite a quantidade do produto");
        int produto=pergunte.nextInt();
        pergunte=new Scanner(System.in);
        System.out.println("digite o valor do produto");
        int valor=pergunte.nextInt();
        System.out.println(Multiplicação=produto*valor);
        if(Multiplicação>1000) {
            System.out.println("Estoque encontra-se em alto custo!");
        }else{
            System.out.println("Estoque encontra-se em baixo custo!");
        }
    } 
}
