import java.util.Scanner;

public class Aula3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int maior = 0;
        int menor = 0;
        int count = 0;
        int soma = 0;

        System.out.print("Quantas repetições vc deseja? ");
        int repetiçoes = scan.nextInt();


        do {System.out.println("numero:");
            int N = scan.nextInt();

        if (N > maior) maior = N;
        if (menor == 0) menor = N;
        else if (N < menor) menor = N;

        soma = soma + N;
       
            count = count + 1;

        } while (count < repetiçoes);
        System.out.println("O menor valor é: " + menor);
        System.out.println("O maior valor é: " + maior);
        System.out.println("A soma dos valores é: " + soma);
    }
}
