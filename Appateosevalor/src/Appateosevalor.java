import java.util.Scanner;
public class Appateosevalor {
    public static void main(String[] args) {
        Scanner pergunte = new Scanner (System.in);
        System.out.println("diga um valor");
        int valor=0;
        valor = pergunte.nextInt();
        int cont=0;
        while(cont<=valor){
            System.out.println(cont);
            cont++;
    }
    }
}
