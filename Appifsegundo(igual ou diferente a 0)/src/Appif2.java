import java.util.Scanner;
public class Appif2 {
  public static void main(String[] args){
    Scanner pergunte=new Scanner (System.in);
    System.out.println("digite um valor");
    int valor = pergunte.nextInt();
    if (valor==0){
        System.out.println("seu valor é igual a zero");}
        else{
                System.out.println("seu valor é diferente de zero");
                }
  }
}