package Wyjatki.try_catch;

import java.util.Scanner;
import java.util.InputMismatchException;

public class try_catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int number = 0;
        boolean error = true;
        do {
            try{
                number = sc.nextInt();
                error = false;
                System.out.println("poprawne wczytanie");
            }catch(InputMismatchException ex){
                System.out.println("Podana warosc nie jest liczba calkowita");
                ex.printStackTrace();
                sc.nextLine(); //czyscimy buffor
            }
        }while (error);


        System.out.println("Podana liczba: " + number);
        sc.close();
    }
}
