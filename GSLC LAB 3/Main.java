import java.util.Scanner;
import java.util.ArrayList;

class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Function fun = new Function();
        ArrayList<Runner> runner = new ArrayList<>();

        int choice = 0;
        while(choice != 4){
            fun.printMenu();
            choice = in.nextInt();
            in.nextLine();

            if(choice == 1)
            {
                String name, type;
                int speed;

                do{
                    System.out.print("Which animal will you rooting for [hare | turtle]? ");
                    type = in.nextLine();
                } while(!(type.equals("hare") || type.equals("turtle")));

                do{
                    System.out.print("What's the name [5 - 15 characters]? ");
                    name = in.nextLine();
                } while(!(name.length() >= 5 && name.length() <= 15));

                if(type.equals("hare"))
                {
                    speed = fun.getRandNum(50) + 25;
                    runner.add(new Hare(name, type, speed));
                }
                else
                {
                    speed = fun.getRandNum(25) + 25;
                    runner.add(new Turtle(name, type, speed));
                }

                System.out.print("Another runner has joined the race!!");
                in.nextLine();
            }
            else if(choice == 2)
            {
                
            }
        }
    }
}
