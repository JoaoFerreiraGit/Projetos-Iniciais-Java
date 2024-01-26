import java.util.Scanner;
public class Apppoluicao {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in); 
    System.out.println("Qual a taxa de Poluição?");
    double taxa=entrada.nextDouble();
    if (taxa<3){
        System.out.println("Todas em funcionamento");
    }else if (taxa>=3 && taxa<4){
        System.out.println("Paraliza empresas do grupo 1");
    }else if (taxa>=4 && taxa<=5) {
        System.out.println("Paraliza empresas do grupo 1 e 2");
    }else if (taxa>5){
        System.out.println("Paraliza todas as empresas");
    }
    }
    
}
