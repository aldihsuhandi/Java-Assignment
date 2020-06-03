import java.util.Scanner;

public class Main
{
   public static void main(String[] args) throws Exception
   {
        Scanner in = new Scanner(System.in);

        int odd, even;
        do{
            System.out.print("How many numbers of even number you want to display?[>0]: ");
            even = in.nextInt();
        } while(even <= 0);

        do{
            System.out.print("How many numbers of odd number you want to display?[>0]: ");
            odd = in.nextInt();
        } while(odd <= 0);

        Thread even_thread = new Thread(new Multithreading("Even number", 0, even));
        Thread odd_thread = new Thread(new Multithreading("Odd number", 1, odd));
        odd_thread.start();
        even_thread.start();
   }
}
