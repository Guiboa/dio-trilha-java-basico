import java.util.Scanner;

public class Aula2 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int count = 0;
    int numero ;
    int soma = 0 ;
    int impares = 0 ;
    int pares = 0;

    do {  
        System.out.print("numero: ");
        numero= scan.nextInt();

        soma = soma + numero;
        System.out.println("Soma: " + soma);

        if (numero % 2 != 0) impares++;
        else pares++;

        count = count + 1;
    } while (count < 10);

    System.out.println("quantidade de numeros impares: " + impares);
    System.out.println("quantidade de numeros pares: " + pares);
}
}
