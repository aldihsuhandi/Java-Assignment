import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Function fun = new Function();
        ArrayList<Runner> runners = new ArrayList<>();
        
        int win_turtle = 0, win_hare = 0;

        int choice = 0;
        while(choice != 4){
            fun.clear_terminal();
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
                    runners.add(new Hare(name, type, speed));
                }
                else
                {
                    speed = fun.getRandNum(25) + 25;
                    runners.add(new Turtle(name, type, speed));
                }

                System.out.print("Another runner has joined the race!!");
                in.nextLine();
            }
            else if(choice == 2)
            {
                int[] distance = {150, 250, 500};
                int index = fun.getRandNum(3) - 1;
                for(int i = 0;i < 3;++i)
                    System.out.println("Generating data statistics..");

                System.out.print("Press enter to continue...");
                in.nextLine();

                int maxDistance = 0;
                
                Collections.sort(runners, Collections.reverseOrder());

                do{
                    fun.clear_terminal();
                    fun.printTableHeaders(distance[index]);
                    int idx = 1;
                    for(Runner runner : runners){
                        fun.printRunner(idx, runner);
                        runner.addDistance();
                        maxDistance = fun.max(runner.getDistance(), maxDistance);

                        ++idx;
                    }
                    System.out.println("+===========================================+")
                    Collections.sort(runners, Collections.reverseOrder());;

                    System.out.print("Press enter to continue...");
                    in.nextLine();
                } while(maxDistance < distance[index]);

                if(runners.get(0) instanceof Hare)
                    ++win_hare;
                else
                    ++win_turtle;

                fun.clear_terminal();
                fun.printTableHeaders(distance[index]);
                int idx = 1;
                for(Runner runner : runners){
                    fun.printRunner(idx, runner);
                    runner.setDistance(0);
                    runner.addDistance();

                    ++idx;
                }
            }
        }
    }
}
