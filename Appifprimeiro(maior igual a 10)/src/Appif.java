import java.util.Scanner;
public class Appif {
  public static void main(String[] args){
    Scanner pergunte=new Scanner (System.in);
    System.out.println("digite um valor");
    int valor = pergunte.nextInt();
    if(valor>=10){
        System.out.println("é maior que 10");
    }  
    else {
        System.out.println("é igual ou menor que 10");
    }
  }
}