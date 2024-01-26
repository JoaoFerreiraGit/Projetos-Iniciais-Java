import java.util.Scanner;
public class Appif4 {
  public static void main(String[] args){
    Scanner pergunte=new Scanner (System.in);
    int valor1=0;
    System.out.println("digite um valor");
    valor1 = pergunte.nextInt();
    int valor2=0;
    System.out.println("digite outro valor");
    valor2 = pergunte.nextInt();
    if (valor1==valor2){
        System.out.println("Seus valores são iguais");
    }
    else{
        System.out.println("seus valores são diferentes");
    }
  }
}