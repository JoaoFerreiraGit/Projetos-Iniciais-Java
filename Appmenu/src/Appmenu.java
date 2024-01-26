import java.util.Scanner;
public class Appmenu {
    public static void main(String[] args){
    Scanner pergunte=new Scanner(System.in);
    System.out.println("Escolha \n 1)Saudação \n 2)Mensagem \n 3)Despedida");
    int vc=pergunte.nextInt();
    switch(vc){
        case 1:
            System.out.println("Olá, Tudo bem!?");
            break;
        case 2:
            System.out.println("Se o pinóquio dizer que o nariz dele vai crescer agora ele cresce?");
            break;
        case 3:
            System.out.println("Tchau meu consagrado!");
            break;
        default:
            System.out.println("ERRO_404");
    
    }
    } 
}
