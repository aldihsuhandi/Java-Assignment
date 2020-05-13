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
       // runners.add(new Hare("Hare1", "hare", fun.getRandNum(50) + 25));
       // runners.add(new Turtle("Turtle1", "turtle", fun.getRandNum(25) + 25));
       // runners.add(new Turtle("Turtle2", "turtle", fun.getRandNum(25) + 25));
       // runners.add(new Hare("Hare2", "hare", fun.getRandNum(50) + 25));

        while(choice != 4){
            fun.clear_terminal();
            fun.printMenu();
            try{
                choice = in.nextInt();
            } catch(Exception e){

            }
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

                System.out.println("Another runner has joined the race!!");
                System.out.print("Press enter to continue...");
                in.nextLine();
            }
            else if(choice == 2)
            {
                if(runners.isEmpty())
                {
                    System.out.println("There is no runner...");
                    System.out.print("Press enter to continue...");
                    in.nextLine();

                    continue;
                }
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
                    System.out.println("+===========================================+");
                    Collections.sort(runners, Collections.reverseOrder());

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
                System.out.println("+===========================================+");
                System.out.printf("\n%s The %s takes the 1st place!!\n", runners.get(0).getName(), runners.get(0).getType());
                System.out.print("Press enter to continue...");
                in.nextLine();
            }
            else if(choice == 3)
            {
                fun.clear_terminal();
                if(win_hare == win_turtle)
                    System.out.println("DRAW");
                else if(win_hare > win_turtle)
                    System.out.println("HARE LEADS");
                else
                    System.out.println("TURTLE LEADS");

                System.out.println("+===========================================+");
                System.out.println("+        Hare         |      Turtle         +");
                System.out.println("+===========================================+");
                System.out.printf("+ %-3d                 | %-3d                 +\n", win_hare, win_turtle);
                System.out.println("+===========================================+");
                System.out.print("Press enter to continue...");
                in.nextLine();
            }
        }
    }
}
