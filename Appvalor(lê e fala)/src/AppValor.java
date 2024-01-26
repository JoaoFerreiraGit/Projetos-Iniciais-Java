import java.util.Scanner;
public class AppValor{
    public static void main(String[] args){
    Scanner pergunte = new Scanner (System.in);
    System.out.println("diga um valor");
    double valor1=0;
    valor1=pergunte.nextDouble();
    System.out.println("diga outro valor");
    double valor2=0;
    valor2 = pergunte.nextDouble();
    System.out.println("Escolha \n 1)Soma os valores \n 2)Média dos valores \n 3)Qual é o maior");
    int op = pergunte.nextInt();
    switch (op){
        case 1:
            System.out.println("Soma "+ (valor1+valor2));
            break;
        case 2:
            System.out.println("Média "+ (valor1+valor2)/2);
            break;
        case 3:
            if (valor1==valor2){
                System.out.println("os valores são iguais");
            }
            else if (valor1>valor2){
                System.out.println("o primeiro valor é maior");
               
            }
            else{
                System.out.println("o segundo valor é maior");}
        default:
            System.out.println("Válor selecionado inválido");
            }
    }
}