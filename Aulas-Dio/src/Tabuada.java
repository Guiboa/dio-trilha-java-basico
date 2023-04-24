import java.util.Scanner;

public class Tabuada {
   
   
    public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
       
        int count = 1;
        

        System.out.println("tabuada ");
        int tabuada = scan.nextInt();  

        System.out.println("tabuada de " + tabuada +":");

        do {
        System.out.println(tabuada + " x " +count + " = " + (tabuada * count) );
    

           count = count + 1;
        } while( count <= 10);
         
        } 
    }

