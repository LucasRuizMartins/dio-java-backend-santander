import java.util.Scanner;

import entities.Contador;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("qual o primeiro valor?");
        int numberOne = sc.nextInt(); 
        System.out.println("Qual o segundo valor? ");
        int numberTwo = sc.nextInt(); 

        Contador cont = new Contador(numberOne, numberTwo);
        cont.countValues();
        
        sc.close();

    }
}
