package exercicio5;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        
       String start = "s";
       
       while(start.equals("s")){
           
            double Temp[] = new double[7];
            double soma = 0;
            double media = 0;
            int acima = 0;
            Scanner input = new Scanner(System.in);

            for(int i=0; i < Temp.length; i++){
                Temp[i] = input.nextDouble();
                soma = soma + Temp[i];
            }
            media = soma / 7;

            for(int j = 0; j < Temp.length; j++){
                if(Temp[j] > media){
                    acima++;
                }
            }
            System.out.println(acima + " dias acima da media");

            Scanner inputStart = new Scanner(System.in);
            System.out.println("Deseja reinicializar o sistema? (s/n)");
            start = inputStart.nextLine();
        
        
    }
  }
}
