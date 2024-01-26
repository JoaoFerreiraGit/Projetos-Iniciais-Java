import java.util.Scanner;
public class Appdezerosomandoforvalor {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner pergunte=new Scanner(System.in);
        System.out.println("Digite um valor");
        int valor=pergunte.nextInt();
        int soma=0;
        for(int cont=0;cont<=valor;cont++){
            soma=soma+cont;
        System.out.println(soma);
    }
    }
    
}