package exerciciosjavadiego;
import java.util.Scanner;
public class ExerciciosJavaDiego {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao simulador de pintura IQUINE. Aqui você saberá a quantidade de galões ou latas necessários para fazer sua obra.");
        
        final double GALAO = 18;
        final double QTD_METROS_GALAO = 108;
        
        final double LATAO = 3.6;
        final double QTD_METROS_LATAO = 21.6;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos metros você pintará?");
        double metros = teclado.nextDouble();
        //Galão
        double rendgalao = metros / QTD_METROS_GALAO;
        double modgalao = metros % QTD_METROS_GALAO;
        int totalgaloes =  (int)rendgalao;
        double valortotalgalao = totalgaloes * 60; 
        if(modgalao != 0){
            totalgaloes = totalgaloes +1;
        }
        System.out.println("Você precisará de " + totalgaloes + " galões para fazer a pintura de "+ metros+ " metros de parede. Você precisará de R$"+valortotalgalao+ " para utilizar essa opção.");
        
        //Latão
        double rendlatao = metros / QTD_METROS_LATAO;
        double modlatao = metros % QTD_METROS_LATAO;
        int totallatoes =  (int)rendlatao;
        double valortotallatao = totallatoes * 25;
        if(modlatao != 0){
            totallatoes = totallatoes +1;
        }
        System.out.println("Você precisará de " + totallatoes + " latões para fazer a pintura de "+metros+ " metros de parede. Você precisará de R$"+valortotallatao+ " para utilizar essa opção.");
         
            
    }        
}