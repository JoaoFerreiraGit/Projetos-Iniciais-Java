import java.util.Scanner;
public class Appmaiomenordiferenteigual {
     public static void main(String[] args) {
        Scanner pergunte=new Scanner(System.in);
        System.out.println("Diga um número");
        int valor1=pergunte.nextInt();
        System.out.println("Diga outro número");
        int valor2=pergunte.nextInt();
        if(valor1==valor2){
            System.out.println("Iguais");
        }else{
            System.out.println("Difirentes");
            if(valor1>valor2){
                System.out.println("Maior Valor = "+valor1);
            }else{
                System.out.println("Maior Valor = "+valor2);
            }
        }
    }    
}


