import java.util.Scanner;
import java.util.ArrayList;

class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Function fun = new Function();

        int choice = 0;
        while(choice != 4){
            fun.printMenu();
            choice = in.nextInt();
        }
    }
}
