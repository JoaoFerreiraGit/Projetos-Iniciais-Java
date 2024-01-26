import java.util.Scanner;
public class Appbrinquedo {
    public static void main(String[] args) {
        Scanner pergunte=new Scanner(System.in);
        System.out.println("Diga sua altura em centímetros");
        int altura=pergunte.nextInt();
        System.out.println("Diga seu peso");
        int peso=pergunte.nextInt();
        if (altura>=150){
            if (peso>=40){
                System.out.println("pode andar no brinquedo");}
                else {
                        System.out.println("medida não coresponde");
                        }
        }
            else {
                System.out.println("medida não corresponde");
            }
    }
}

    