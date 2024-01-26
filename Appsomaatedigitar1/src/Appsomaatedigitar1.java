import java.util.Scanner;
public class Appsomaatedigitar1 {
    public static void main(String[] args) {
        Scanner pergunte=new Scanner(System.in);
        int vc=0,acum=0;
        while(vc!=1){
            System.out.println("Digite um valor");
            vc=pergunte.nextInt();
            acum=acum+vc;       
        } System.out.println("Soma="+acum);
    }   
}
