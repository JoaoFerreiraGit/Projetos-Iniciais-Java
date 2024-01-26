package appate100;
public class Appate100 {
    public static void main(String[] args) {
    int cont=0;
    int acum=0;
    while(cont<=100){
        System.out.println(cont+"->" + acum);
        cont=cont+1;
        acum=acum+cont;
    }
    
    
    }
    
}
