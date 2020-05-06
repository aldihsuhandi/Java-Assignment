import java.util.Scanner;

public class Main
{
    public Main()
    {
         Game game = new Game();
         Function fun = new Function();
         Scanner in = new Scanner(System.in);

         int choice = 1;
         while(choice != 3){
            fun.printMenu();
            choice = in.nextInt();
            in.nextLine();

            if(choice == 1 || choice == 2)
            {
                game.initializeGame(choice+1);
                game.inGame();
                game.printWinner();

                System.out.println("\nPress enter to continue...");
                in.nextLine();
            }
         }
    }

    public static void main(String[] args)
    {
        new Main();
    }
}
