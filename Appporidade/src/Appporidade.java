import java.util.Scanner;
public class Appporidade {
    public static void main(String[] args) {
        Scanner pergunte=new Scanner(System.in);
        System.out.println("Diga sua idade");
        int idade=pergunte.nextInt();        
        if(idade>=0 && idade <=14){
            System.out.println("Criança");
        }else if(idade>=15 && idade<=21){
            System.out.println("Jovem");
        }else if(idade>=22 && idade<=50){
            System.out.println("Adulto");
        }else if(idade>50 && idade<=374){
            System.out.println("Idoso");
        }else if(idade<0 || idade>374 ){
            System.out.println("Você não existe");
        }
    }
    
}

