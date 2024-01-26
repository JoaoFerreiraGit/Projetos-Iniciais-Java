import java.util.Scanner;
public class Appsomandoatevalor {
    public static void main(String[] args) {
        Scanner pergunte=new Scanner(System.in);
        System.out.println("Digite um valor");
        int valor=pergunte.nextInt();
        int cont=0;
        int acum=0;
        while(cont<=valor){
            System.out.println(cont+"="+acum);
            cont++;
            acum=acum+cont;
        }
    }    
}
