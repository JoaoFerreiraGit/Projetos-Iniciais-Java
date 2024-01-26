import java.util.Scanner;
public class Appif3 {
  public static void main(String[] args){
    Scanner pergunte=new Scanner (System.in);
    System.out.println("digite um valor");
    int valor = pergunte.nextInt();
    if(valor>0){
        System.out.println(valor+ " é positivo");
    }
    if(valor<0){
        System.out.println(valor+ " é negativo");
    }
    
  }
}