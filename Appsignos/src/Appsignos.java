import java.util.Scanner;
public class Appsignos {
    public static void main(String[] args) {
        Scanner pergunte=new Scanner(System.in);
        System.out.println("Diga um dia");
        int dia=pergunte.nextInt();
        pergunte=new Scanner(System.in);
        System.out.println("Diga um mês");
        int mês=pergunte.nextInt();
        if(dia>=17 && mês==12 || dia<=14 && mês==01) {
            System.out.println("Dhanu");
        }
        if(dia>=15 && mês==01 || dia<=13 && mês==02) {
            System.out.println("Makara");
        }
        if(dia>=14 && mês==02 || dia<=14 && mês==03) {
            System.out.println("Kumbha");
        }
        if(dia>=15 && mês==03 || dia<=14 && mês==04) {
            System.out.println("Mina");
        }
        if(dia>=15 && mês==04 || dia<=15 && mês==05) {
            System.out.println("Mesha");
        }
        if(dia>=16 && mês==05 || dia<=15 && mês==06) {
            System.out.println("Vrishabha");
        }
        if(dia>=16 && mês==06 || dia<=16 && mês==07) {
            System.out.println("Mithuna");
        }
        if(dia>=17 && mês==07 || dia<=17 && mês==8) {
            System.out.println("Karna");
        }
        if(dia>=18 && mês==8 || dia<=16 && mês==9) {
            System.out.println("Simha");
        }
        if(dia>=17 && mês==9 || dia<=17 && mês==10) {
            System.out.println("Kanya");
        }
        if(dia>=18 && mês==10 || dia<=16 && mês==11) {
            System.out.println("Tula");
        }
        if(dia>=17 && mês==11 || dia<=16 && mês==12) {
            System.out.println("Vrichika");
        }
        else {
            System.out.println("Número inválido");
        }
    }
}
