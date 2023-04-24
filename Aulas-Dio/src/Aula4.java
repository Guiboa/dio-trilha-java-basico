import java.util.Scanner;

public class Aula4 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
      
        int count = 0;     
        int alunos ;
        int idade ;
        int soma = 0 ;
        int media;

        System.out.print("quantos alunos sao nessa turma? ");
        alunos = scan.nextInt();

        do{ 
            System.out.print("qual a sua idade? ");
            idade = scan.nextInt();

            soma = soma + idade;

            media = soma / alunos;

            
            count = count + 1;
        }while(count < alunos);
        System.out.println(media);
        
        if (media <= 25){
            System.out.println("A turma é jovem");
        }else if (media > 60){
            System.out.println("A turma é idosa");
        }else {
            System.out.println("A turma é adulta");
        }
    }   
}
