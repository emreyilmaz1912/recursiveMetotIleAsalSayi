import java.util.Scanner;

public class Main {

    static int isPrimeNumber(){
      Scanner scan = new Scanner(System.in);
      System.out.print("Asal sayı kontrolü için bir sayı giriniz :");
      int number = scan.nextInt();
      int counter = 0, i= 2;

        while(i < number) {
            if(number % i == 0) {
                counter++;
            }
            i++;
        }
        if(counter == 0) {
            System.out.println(number + " Asal bir sayidir.");
        }
        else {
            System.out.println(number + " Asal bir sayi degildir.");
        }
      return number;
    }
    public static void main(String[] args) {
        System.out.println("Asal Sayı Bulma");
        isPrimeNumber();

    }
}