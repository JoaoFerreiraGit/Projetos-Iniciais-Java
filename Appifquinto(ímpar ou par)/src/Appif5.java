import java.util.Scanner;
public class Appif5 {
  public static void main(String[] args){
    Scanner pergunte=new Scanner (System.in);
    System.out.println("digite um valor");
    int valor = pergunte.nextInt();
    if (valor%2==0){
        System.out.println("seu valor é par");}
        else{
                System.out.println("seu valor é ímpar");
                }
  }
}