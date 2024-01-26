import java.util.Scanner;
public class Applancheria2 {
    public static void main(String[] args) {
    int numero=0;
   Scanner escolha=new Scanner (System.in);
   System.out.println("Escolha um produto\n"
     + "1)Água da Jamaica por R$3,00\n"
     + "2)Marreco catupiry por R$8,00\n"
     + "3)Iscas de Lagarto por R$6,00\n"
     + "4)Suco de Limão por R$4,00\n"
     + "5)Total\n"
     + "6)Sair do programa\n");
   double soma=0;
   double op1=3.00;
   double op2=8.00;
   double op3=6.00;
   double op4=4.00;
   while(numero!=6){
   numero=escolha.nextInt(); 
   switch (numero){
       case 1: soma+=op1;
           System.out.println("Água da Jamaica\n"
               + soma);
       
           break;
       case 2:soma+=op2;
           System.out.println("Marreco catupiry\n"
               + soma);
       
           break;
       case 3: soma+=op3;
           System.out.println("Iscas de Lagarto\n"
               + soma);
       
           break;
       case 4: soma+=op4;
           System.out.println("Suco de Limão\n"
               + soma);
           
       break;
       case 5: System.out.println("R$"+soma);
           break;
       default: System.out.println("Valor Inválido");}       
   }
    System.out.println("Até a proxima ^-^");
    }
}