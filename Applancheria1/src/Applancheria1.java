import java.util.Scanner;
public class Applancheria1 {
    public static void main(String[] args){
    Scanner pergunte=new Scanner(System.in);
    System.out.println("Escolha um produto \n 1)Água da Jamaica \n 2)Marreco catupiry \n 3)Iscas de Lagarto"
            + "\n 4)Vitamina \n 5)sair de programa");
    int vc=pergunte.nextInt();
    switch(vc){
        case 1:
            System.out.println("Água da Jamaica");
            break;
        case 2:
            System.out.println("Marreco catupiry");
            break;
        case 3:
            System.out.println("Iscas de Lagarto");
            break;
        case 4:
            System.out.println("Vitamina");
            break;
        default:
    }
       
    }
    } 
