import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
    	String saludo;
    	System.out.println("Ingrese un saludo");
    	Scanner s = new Scanner(System.in);
    	saludo=s.next();
        int vida, rp;
        boolean fl=false;
        vida=0;
        Scanner sc = new Scanner(System.in);
        do{
            vida++;
            System.out.println("Vida: "+ vida + "\tCual es el numero secreto?");
            rp = sc.nextInt();
            if (rp==1234)
                fl=true;
        }while(vida<3 && !fl);
        if(fl==true)
            System.out.println("Adivinaste!!!");
        else
            System.out.println("ups, perdiste!!!");
    }
}