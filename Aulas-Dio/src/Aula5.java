public class Aula5 {

    public static void main(String[] args) {
        
        int paes = 1;
        
        System.out.println("preço do pao: R$ 0.18 ");
        System.out.println("Panificadora Pão de ontem - tabela de preços");


        do {
            System.out.println(paes +" - R$ " + (0.18 * paes ));
            

           
            paes = paes +1;
        }while (paes <= 50);
    }
}
